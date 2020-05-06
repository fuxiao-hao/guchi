package com.newer.dto;

public class PageDto {
	private Integer page = 1;
	private Integer pageSize = 5;
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		if (page<1) {
			page=1;
		}
		this.page = page;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public PageDto() {
	}
}
