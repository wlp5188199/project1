/**
 * 菜单添加
 */
$(function($) {
	var entityID = getQueryString('id');
	if(entityID) {
		$.post(contextPath + "/scrap_collector/getScrapCollectorById", {
			"id": entityID
		}, function(result) {
			$("#form-scrap-collector-add").JsonToForm(result);
			$("#sex-0").val("sex_0");
			$("#sex-1").val("sex_1");
			sexCheck(result.sex);
		});
	}

	$('input[type=radio]').iCheck({
		checkboxClass: 'icheckbox_minimal',
		radioClass: 'iradio_minimal',
		increaseArea: '20%'
	});

	$("#form-scrap-collector-add").validate({
		rules: {
			
		},
		submitHandler: function(form) {
			$.ajax({
				type: "post",
				url: contextPath + "/scrap_collector/" + (entityID ? "update" : "add"),
				data: $(form).serialize(),
				dataType: "json",
				success: function(data) {
					if(data.status == '200') {
						var message = entityID ? '更新成功!' : '添加成功!';
						var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引,隐藏layer层和shade
						parent.$('#layui-layer' + index).css({'display': 'none'});
						parent.$('#layui-layer-shade' + index).css({'display': 'none'});
						parent.reloadTable(); //再刷新DT
						parent.showSuccessMessage(message, null, function() {
							parent.layer.close(index); //然后执行关闭     
						});
					} else {
						var message = entityID ? '添加成功!' : '添加失败!';
						parent.showFailMessage(message);
					}
				},
				error: function(XMLHttpRequest, textStatus, errorThrown) {
					alert(errorThrown);
					return false;
				}
			});
			return false;
		}
	});

	$.Huitab("#tab-category .tabBar span", "#tab-category .tabCon", "current", "click", "0");

	createAreaTree();
});
function createAreaTree(){
	var setting = {
			async: {
				autoParam: [],
				contentType: "application/x-www-form-urlencoded",
				enable: true,
				type: "post",
				url: contextPath + "/housing_estate/getAreas"
			},
			view: {
				selectedMulti: false
			},
			check: {
				enable: false
			},
			edit: {
				drag: {
					isCopy: false,
					isMove: false
				},
				enable: false
			},
			data: {
				key: {
					name: "area_name",
					title: "area_name",
					url: "undefined",
					id: "area_code",
					pId: "parent_code"
				},
				simpleData: {
					enable: true,
					idKey: "area_code",
					pIdKey: "parent_code",
					rootPId: "0"
				}
			},
			callback: {
				onClick: zTreeOnClickProvince
			}
		};

		$.fn.zTree.init($("#tree"), setting);

		$('#province_name').on('focus', function() {
			var cityObj = $("#province_name");
			var cityOffset = $("#province_name").offset();
			$("#menuContent").css({
				left: cityOffset.left + "px",
				top: (cityOffset.top + cityObj.outerHeight() - 15) + "px",
				display: "block",
				width: (cityObj.outerWidth() - 3) + "px"
			}).slideDown("fast");

			$("body").bind("mousedown", function() {
				if(!(event.target.id == "menuContent" || $(event.target).parents("#menuContent").length > 0)) {
					$("#menuContent").css({
						left: 0,
						top: 0,
						display: "none",
						width: 0
					}).fadeOut("fast");
				}
			});
		});
}


/**
 * 节点点击回调
 * 
 * @param event
 * @param treeId
 * @param treeNode
 * @returns
 */
function zTreeOnClickProvince(event, treeId, treeNode) {
	$('#province_name').val(treeNode.getParentNode().area_name+"-"+treeNode.area_name);
	$('#province_code').val(treeNode.parent_code);
	$('#city_code').val(treeNode.area_code);
	$("#menuContent").css({
		left: 0,
		top: 0,
		display: "none",
		width: 0
	}).fadeOut("fast");
	createHousingEstateTree();
	
	return false;
};


function createHousingEstateTree(){
	var setting = {
			async: {
				autoParam: [],
				contentType: "application/x-www-form-urlencoded",
				enable: true,
				otherParam : {'cityCode':$("#city_code").val()},
				type: "post",
				url: contextPath + "/housing_estate/getHousingEstateByCityCode"
			},
			view: {
				selectedMulti: false
			},
			check: {
				enable: false
			},
			edit: {
				drag: {
					isCopy: false,
					isMove: false
				},
				enable: false
			},
			data: {
				key: {
					name: "address",
					title: "address",
					url: "undefined",
					id: "code"
				},
				simpleData: {
					enable: true,
					idKey: "code",
					pIdKey: "",
					rootPId: "0"
				}
			},
			callback: {
				onClick: zTreeOnClickHousingEstate
			}
		};

		$.fn.zTree.init($("#he_tree"), setting);

		$('#housing_estate').on('focus', function() {
			var cityObj = $("#housing_estate");
			var cityOffset = $("#housing_estate").offset();
			$("#he").css({
				left: cityOffset.left + "px",
				top: (cityOffset.top + cityObj.outerHeight() - 15) + "px",
				display: "block",
				width: (cityObj.outerWidth() - 3) + "px"
			}).slideDown("fast");

			$("body").bind("mousedown", function() {
				if(!(event.target.id == "he" || $(event.target).parents("#he").length > 0)) {
					$("#he").css({
						left: 0,
						top: 0,
						display: "none",
						width: 0
					}).fadeOut("fast");
				}
			});
		});
}


/**
 * 节点点击回调
 * 
 * @param event
 * @param treeId
 * @param treeNode
 * @returns
 */
function zTreeOnClickHousingEstate(event, treeId, treeNode) {
	$('#housing_estate').val(treeNode.address);
	$('#housing_estate_code').val(treeNode.code);
	$("#he").css({
		left: 0,
		top: 0,
		display: "none",
		width: 0
	}).fadeOut("fast");
	return false;
};

function sexCheck(val){
//	$(".radio-box input[type='radio']").removeAttr("checked");
//	$(".radio-box input[type='radio']").parent().removeClass("checked");
//	if(val == '男'){
//		$("#sex-0").attr("checked","checked");
//		$("#sex-0").parent().addClass("checked");
//	}else{
//		$("#sex-1").attr("checked","checked");
//		$("#sex-1").parent().addClass("checked");
//	}
}