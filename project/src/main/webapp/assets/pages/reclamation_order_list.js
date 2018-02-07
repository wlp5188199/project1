/**
 * DataTables
 */
var datatable = null,idList=[];

$(function() {
	datatable = $('.table-sort').DataTable({
		order: [
			[0, 'desc']
		],
		ajax: {
			url: contextPath + "/reclamation_order/getPageList",
			type: 'post',
			data: function(d) {
				d.search = $('#search').val();
			}
		},
		columns: [{
			data: "id"
		}, {
			data: "order_no"
		}, {
			data: "scrap_name",
			defaultContent: ""
		}, {
			data: "owner_name",
			defaultContent: ""
		}, {
			data: "sc_name",
			defaultContent: ""
		}, {
			data: "rd_id",
			defaultContent: ""
		}, {
			data: "amount",
			defaultContent: ""
		}, {
			data: "unit",
			defaultContent: ""
		}, {
			data: "money",
			defaultContent: ""
		}, {
			data: "rd_status_val",
			defaultContent: ""
		}, {
			data: "sc_status_val",
			defaultContent: ""
		}, {
			data: "create_time",
			defaultContent: ""
		}, {
			data: "update_time",
			defaultContent: ""
		}],
		columnDefs: [{
			targets: [11],
			render: function(data, type, row, meta) {
				return data ? new Date(data).pattern("yyyy-MM-dd hh:mm:ss") : '';
			}
		},{
			targets: [12],
			render: function(data, type, row, meta) {
				return data ? new Date(data).pattern("yyyy-MM-dd hh:mm:ss") : '';
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