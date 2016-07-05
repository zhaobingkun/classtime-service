package com.classtime.service.manager.impl;
import com.classtime.service.manager.Page;

import java.io.Serializable;
import java.util.List;


public class PageiBatisImpl implements Page, Serializable {

    private static final long serialVersionUID = -1660717012084634442L;

    protected List thisPageElements;

    protected int pageSize = 20;

    protected int totalNumberOfElements;

    protected int pageNumber;

    private int skipResults;

    private int lastPageNumber;

    public PageiBatisImpl(int pageNumber, int pageSize, int totalNumberOfElements) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.totalNumberOfElements = totalNumberOfElements;

        if (pageNumber < 1)
            this.pageNumber = 1;

        if (pageSize < 1)
            this.pageSize = 20;

        operation();

        if (pageNumber > getLastPageNumber()) {
            this.pageNumber = getLastPageNumber();
        }
        this.skipResults = (pageNumber - 1) * pageSize;
    }

    private void operation() {
        double totalResults = new Integer(getTotalNumberOfElements()).doubleValue();
        lastPageNumber = new Double(Math.floor(totalResults / getPageSize())).intValue();

        if (lastPageNumber <= 0)
            lastPageNumber = 1;
        else
            lastPageNumber = (totalResults % getPageSize() == 0) ? lastPageNumber : lastPageNumber + 1;
    }

    public boolean getIsFirstPage() {
        return getThisPageNumber() == 1;
    }

    public boolean getIsLastPage() {
        return getThisPageNumber() >= getLastPageNumber();
    }

    public boolean getHasNextPage() {
        return !getIsLastPage();
    }

    public boolean getHasPreviousPage() {
        return getThisPageNumber() > 1;
    }

    public int getLastPageNumber() {
        return lastPageNumber;
    }

    public List getThisPageElements() {
        return thisPageElements;
    }

    public void setThisPageElements(List thisPageElements) {
        this.thisPageElements = thisPageElements;
    }

    public int getTotalNumberOfElements() {
        return totalNumberOfElements;
    }

    public int getThisPageFirstElementNumber() {
        return getThisPageNumber() * getPageSize() + 1;
    }

    public int getThisPageLastElementNumber() {
        int fullPage = getThisPageFirstElementNumber() + getPageSize() - 1;
        return getTotalNumberOfElements() < fullPage ? getTotalNumberOfElements()
                : fullPage;
    }

    public int getNextPageNumber() {
        return getThisPageNumber() + 1;
    }

    public int getPreviousPageNumber() {
        return getThisPageNumber() - 1;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getThisPageNumber() {
        return pageNumber;
    }

    public int getSkipResults() {
        return skipResults;
    }
}
