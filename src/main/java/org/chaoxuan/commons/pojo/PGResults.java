package org.chaoxuan.commons.pojo;

import java.util.List;

public class PGResults {
	
	private Long pages;//总页数
	private Long total;//总条数 
	private List<?> rows;
	
	
	public Long getTotal() {
		return total;//数据对象-泛型格式 
	}
	public List<?> getRows() {
		return rows;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	public Long getPages() {
		return pages;
	}
	public void setPages(Long pages) {
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "PGResults [pages=" + pages + ", total=" + total + ", rows=" + rows + "]";
	}
	
	

}
