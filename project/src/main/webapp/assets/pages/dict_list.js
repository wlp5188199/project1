/**
 * DataTables
 */
var datatable = null,idList=[];

$(function() {
	datatable = $('.table-sort').DataTable({
		order: [
			[0, 'asc']
		],
		ajax: {
			url: contextPath + "/dict/getPageList",
			type: 'post',
			data: function(d) {
				d.search = $('#search').val();
			}
		},
		columns: [{
			data: "id"
		}, {
			data: "dict_name",
			defaultContent: ""
		}, {
			data: "dict_tabname",
			defaultContent: ""
		}, {
			data: "dict_colname",
			defaultContent: ""
		}, {
			data: "dict_option",
			defaultContent: ""
		}, {
			data: "dict_text",
			defaultContent: ""
		}, {
			data: "dict_sort",
			defaultContent: ""
		}, {
			data: null
		}],
		columnDefs: [{
			targets: [0],
			orderable:false,
			render: function(data, type, row, meta) {
				return '<input id="input-' + data + '" type="checkbox" name="single"><label for="input-' + data + '"></label>';
			}  
		}, {
			targets: [7],
			orderable:false,
			responsivePriority: 1,
			render: function(data, type, row, meta) {
				var btns = new Array('edit','del');
				return getDTOperateBtn(btns, row.id, 'system-dict-add.jsp', null, '/dict/del/', reloadTable);
			}
		}]
	});
});

/**
 * 刷新DT
 */
function reloadTable() {
	datatable.ajax.reload(null, false);
}

/**
 * 获取datatables选中行的ID
 */
function getDTSelect() {
	var lines = datatable.rows('.selected').data();
	for (var i = 0; i < lines.length; i++) {
		idList.push(lines[i].id);
	}
	return idList;
}