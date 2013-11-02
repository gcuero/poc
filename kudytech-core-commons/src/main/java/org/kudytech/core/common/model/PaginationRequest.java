/**
 * 
 */
package org.kudytech.core.common.model;

/**
 * @author ERNESTO
 *
 */
public class PaginationRequest {
	
	private int page;
	private int pageSize;

	/**
	 * @return the page
	 */
	public int getPage() {
		return page;
	}



	/**
	 * @param page the page to set
	 */
	public void setPage(int page) {
		this.page = page;
	}



	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}



	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}



	/**
	 * 
	 */
	public PaginationRequest() {
		// TODO Auto-generated constructor stub
	}
	
	public PaginationRequest(int page, int pageSize) {
		// TODO Auto-generated constructor stub
		this.page = page;
		this.pageSize = pageSize;
	}

}
