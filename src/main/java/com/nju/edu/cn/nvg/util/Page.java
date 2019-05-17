package com.nju.edu.cn.nvg.util;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/8/9.
 */
public class Page implements Serializable {

    private static final long serialVersionUID = -836463410232378945L;

    private int currentPage;
    private int pageSize;
    private long totalHits;
    private long pageCount;

    private final int defaultCurrentPage = 1;
    private final int defaultPageSize = 10;

    public Page() {
    }

    public Page(int currentPage, int pageSize, long totalHits) {
        if (defaultCurrentPage <= 0) {
            this.currentPage = defaultCurrentPage;
        } else {
            this.currentPage = currentPage;
        }
        if (pageSize <= 0) {
            this.pageSize = defaultPageSize;
        } else {
            this.pageSize = pageSize;
        }
        this.totalHits = totalHits;
        this.pageCount = totalHits % this.pageSize == 0 ? (totalHits / this.pageSize) : (totalHits / this.pageSize) + 1;
    }

    public Page(int currentPage, int pageSize, long totalHits, long pageCount) {
        if (defaultCurrentPage <= 0) {
            this.currentPage = defaultCurrentPage;
        } else {
            this.currentPage = currentPage;
        }
        if (pageSize <= 0) {
            this.pageSize = defaultPageSize;
        } else {
            this.pageSize = pageSize;
        }
        this.totalHits = totalHits;
        this.pageCount = pageCount;
    }


    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalHits() {
        return totalHits;
    }

    public void setTotalHits(long totalHits) {
        this.totalHits = totalHits;
    }

    public long getPageCount() {
        return pageCount;
    }

    public void setPageCount(long pageCount) {
        this.pageCount = pageCount;
    }
}
