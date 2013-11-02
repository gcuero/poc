/**
 * 
 */
package org.kudytech.core.common.model;

import java.util.List;

/**
 * @author ERNESTO
 *
 */
@SuppressWarnings("all")
public class PaginationResponse {
	
	public static int defaultPageSize = 20;
	 
    private int pageSize;  
    private int firstIndex;
    private int lastIndex;
    private List pageItems;
    private int totalItems;
    private int totalPages;
    private int currentPage;
    private int pageItemsCount;

    public PaginationResponse() {
		// TODO Auto-generated constructor stub
	}
    
	/**
	 * Crea un objeto de paginacion en base al numero de pagina, tamano y tamano de pagina 
	 * @param page
	 * @param size
	 * @param pageSize
	 * @param pageItems
	 */
	public PaginationResponse(int page, int size, int pageSize, List pageItems) {
		// TODO Auto-generated constructor stub
		if (pageSize <= 0) {
            pageSize = defaultPageSize;
        }
        this.pageSize = pageSize;
        this.totalItems = size;
        this.pageItems = pageItems;
        this.totalPages = (totalItems % pageSize == 0) ? totalItems / pageSize : totalItems / pageSize + 1;
        if (page < 1) {
            page = 1;
        }
        if (page > totalPages) {
            page = totalPages;
        }
        this.currentPage = page;
        this.firstIndex = calcFirstItemIndexOfPage(page, pageSize, size);
        int last = isLastPage() ? totalItems - 1: firstIndex + pageSize - 1;
        int itemsPerPage = last - firstIndex + 1;
        if (last < 0) {
            last = 0;
            itemsPerPage = 0;
        }
        this.lastIndex = last;
        this.pageItemsCount = itemsPerPage;
	}
	
	public boolean hasNextPage() {
        return currentPage < totalPages - 1;
    }
 
    public boolean isLastPage() {
        return currentPage == totalPages;
    }
 
    public boolean hasPreviousPage() {
        return currentPage > 1;
    }
 
    public boolean isFirstPage() {
        return currentPage == 1;
    }
    
    /**
     * Calculates page number that contains some item.
     */
    public static int calcPageOfItem(int itemIndex, int pageSize) {
        return itemIndex / pageSize + 1;
    }
 
    /**
     * Calculates the first item index of requested page.
     */
    public static int calcFirstItemIndexOfPage(int page, int pageSize, int total) {
        if (total == 0) {
            return 0;
        }
        if (page < 1) {
            page = 1;
        }
        int first = (page - 1) * pageSize;
        if (first >= total) {
            first = ((total - 1) / pageSize) * pageSize;    // first item on the last page
        }
        return first;
    }
 
    /**
     * Calculates first item index of the page.
     */
    public static int calcFirstItemIndexOfPage(PaginationRequest paginationRequest, int total) {
        return calcFirstItemIndexOfPage(paginationRequest.getPage(), paginationRequest.getPageSize(), total);
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
	 * @return the firstIndex
	 */
	public int getFirstIndex() {
		return firstIndex;
	}

	/**
	 * @param firstIndex the firstIndex to set
	 */
	public void setFirstIndex(int firstIndex) {
		this.firstIndex = firstIndex;
	}

	/**
	 * @return the lastIndex
	 */
	public int getLastIndex() {
		return lastIndex;
	}

	/**
	 * @param lastIndex the lastIndex to set
	 */
	public void setLastIndex(int lastIndex) {
		this.lastIndex = lastIndex;
	}

	/**
	 * @return the pageItems
	 */
	public List getPageItems() {
		return pageItems;
	}

	/**
	 * @param pageItems the pageItems to set
	 */
	public void setPageItems(List pageItems) {
		this.pageItems = pageItems;
	}

	/**
	 * @return the totalItems
	 */
	public int getTotalItems() {
		return totalItems;
	}

	/**
	 * @param totalItems the totalItems to set
	 */
	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	/**
	 * @return the totalPages
	 */
	public int getTotalPages() {
		return totalPages;
	}

	/**
	 * @param totalPages the totalPages to set
	 */
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	/**
	 * @return the currentPage
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/**
	 * @param currentPage the currentPage to set
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * @return the pageItemsCount
	 */
	public int getPageItemsCount() {
		return pageItemsCount;
	}

	/**
	 * @param pageItemsCount the pageItemsCount to set
	 */
	public void setPageItemsCount(int pageItemsCount) {
		this.pageItemsCount = pageItemsCount;
	}
    
    
    

}
