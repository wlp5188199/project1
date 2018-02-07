package com.lanou.datatables;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.StringUtils;

/**
 * datatables实体类，用于传递参数
 * 
 * 
 *
 */
public class DataTables implements java.io.Serializable {

	/**
	 * 版本/////
	 */
	private static final long serialVersionUID = -4352856640468897683L;
	private Integer start;// 起始行数
	private Integer length;// 页面大小
	private String search;// 搜索的字符串
	private String order;// 排序方式desc or asc
	private String column;// 需要排序的列
	private long recordsTotal;// 数据库中的结果总行数
	private long recordsFiltered;// 搜索过滤后的行数
	private Integer draw; // datatables建议将此参数传回
	private List<?> data;// 结果集
	private String subSQL;// 手动拼装的额外参数
	private String timeMin;//动态查询所需最小时间
	private String timeMax;//动态查询所需最大时间

	public DataTables() {
	};

	public DataTables(Integer start, String search, Integer length, String order, String column, Integer pageNum,
			Integer recordsTotal, Integer recordsFiltered, Integer draw, String subSQL) {
		this.start = start;
		this.length = length;
		this.search = search;
		this.order = order;
		this.draw = draw;
		this.column = column;
		this.recordsTotal = recordsTotal;
		this.recordsFiltered = recordsFiltered;
		this.setSubSQL(subSQL);
	}

	public DataTables(HttpServletRequest request, String subSQL) {
		length = StringUtils.isEmpty(request.getParameter("length")) ? 1
				: Integer.parseInt(request.getParameter("length"));
		// length = 5;
		start = StringUtils.isEmpty(request.getParameter("start")) ? 0
				: Integer.parseInt(request.getParameter("start"));
		draw = StringUtils.isEmpty(request.getParameter("draw")) ? 0 : Integer.parseInt(request.getParameter("draw"));
		search = StringUtils.isEmpty(request.getParameter("search"))?null:request.getParameter("search").trim();
		/** -- 以下 防止sql%注入 故对其进行转化---- **/  
	       if (search != null ) {  
	            if(search.contains("%")){  
	            	search=search.replaceAll("\\%", "\\\\%");  
         }  
	            if(search.contains("_")){  
	            	search=(search.replaceAll("\\_", "\\\\_"));  
	            }  
	        }  
		order = request.getParameter("order[0][dir]");
		column = request.getParameter("columns[" + request.getParameter("order[0][column]") + "][data]");
		timeMin = request.getParameter("timeMin");
		timeMax = request.getParameter("timeMax");
		this.setSubSQL(subSQL);
	}

	public static DataTables getInstance(HttpServletRequest request, String subSQL) {
		return new DataTables(request, subSQL);
	};

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

	public Integer getDraw() {
		return draw;
	}

	public void setDraw(Integer draw) {
		this.draw = draw;
	}

	public long getRecordsTotal() {
		return recordsTotal;
	}

	public void setRecordsTotal(long recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	public long getRecordsFiltered() {
		return recordsFiltered;
	}

	public void setRecordsFiltered(long recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}

	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	public String getSubSQL() {
		return subSQL;
	}

	public void setSubSQL(String subSQL) {
		this.subSQL = subSQL;
	}

	public String getTimeMin() {
		return timeMin;
	}

	public void setTimeMin(String timeMin) {
		this.timeMin = timeMin;
	}

	public String getTimeMax() {
		return timeMax;
	}

	public void setTimeMax(String timeMax) {
		this.timeMax = timeMax;
	}

	
	

}
