package com.tyba.technicalServices.web;

import java.io.Serializable;
import java.util.List;

import com.tyba.technicalServices.core.ProcessMsg;

public class SearchResultBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long totalNumberOfResult;
	private ProcessMsg processMsg;
	public ProcessMsg getProcessMsg() {
		return processMsg;
	}

	public void setProcessMsg(ProcessMsg processMsg) {
		this.processMsg = processMsg;
	}

	private ResultBean resultBean = new ResultBean();
	private ISearchResultVO selectedRow;
	private ISearchResultVO[] selectedRows;
	private List<ISearchResultVO> filteredRows;
	
	public boolean isError() {
		return processMsg != null;
	}

	public ProcessMsg getMsgInfo() {
		return processMsg;
	}

	public void setMsgInfo(ProcessMsg msgInfo) {
		this.processMsg = msgInfo;
	}

	public ResultBean getResultBean() {
		return resultBean;
	}

	public void setResultBean(ResultBean resultBean) {
		this.resultBean = resultBean;
	}

	public ISearchResultVO getSelectedRow() {
		return selectedRow;
	}

	public void setSelectedRow(ISearchResultVO selectedRow) {
		this.selectedRow = selectedRow;
	}

	public ISearchResultVO[] getSelectedRows() {
		return selectedRows;
	}

	public void setSelectedRows(ISearchResultVO[] selectedRows) {
		this.selectedRows = selectedRows;
	}

	public List<ISearchResultVO> getFilteredRows() {
		return filteredRows;
	}

	public void setFilteredRows(List<ISearchResultVO> filteredRows) {
		this.filteredRows = filteredRows;
	}
	
	public long getTotalNumberOfResult() {
		return totalNumberOfResult;
	}

	public void setTotalNumberOfResult(long totalNumberOfResult) {
		this.totalNumberOfResult = totalNumberOfResult;
	}

	public void displaySelectedElements(){
		System.out.println(selectedRow);
		System.out.println(selectedRows);
	}
}
