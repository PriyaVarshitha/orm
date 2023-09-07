package com.loan.model;

import java.sql.Date;

public class InputLoanApplicants {

	private Integer id;
	private Integer customer;
	private Date applicationDate;
	private Integer loanTypeId;
	private Double loanAmount;
	private Double emiRangeFrom;
	private Double emiRangeTo;
	private Integer numberOfMonthsRequested;
	private Double cibilScore;
	private String status;
	private String conclusionRemarks;
	private Integer lastprocesseduser;
	private Date processedDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCustomer() {
		return customer;
	}

	public void setCustomer(Integer customer) {
		this.customer = customer;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(String applicationDate) {
		this.applicationDate = Date.valueOf(applicationDate);
	}

	public Integer getLoanTypeId() {
		return loanTypeId;
	}

	public void setLoanTypeId(Integer loanTypeId) {
		this.loanTypeId = loanTypeId;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Double getEmiRangeFrom() {
		return emiRangeFrom;
	}

	public void setEmiRangeFrom(Double emiRangeFrom) {
		this.emiRangeFrom = emiRangeFrom;
	}

	public Double getEmiRangeTo() {
		return emiRangeTo;
	}

	public void setEmiRangeTo(Double emiRangeTo) {
		this.emiRangeTo = emiRangeTo;
	}

	public Integer getNumberOfMonthsRequested() {
		return numberOfMonthsRequested;
	}

	public void setNumberOfMonthsRequested(Integer numberOfMonthsRequested) {
		this.numberOfMonthsRequested = numberOfMonthsRequested;
	}

	public Double getCibilScore() {
		return cibilScore;
	}

	public void setCibilScore(Double cibilScore) {
		this.cibilScore = cibilScore;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getConclusionRemarks() {
		return conclusionRemarks;
	}

	public void setConclusionRemarks(String conclusionRemarks) {
		this.conclusionRemarks = conclusionRemarks;
	}

	public Integer getLastprocesseduser() {
		return lastprocesseduser;
	}

	public void setLastprocesseduser(Integer lastprocesseduser) {
		this.lastprocesseduser = lastprocesseduser;
	}

	public Date getProcessedDate() {
		return processedDate;
	}

	public void setProcessedDate(String processedDate) {
		this.processedDate = Date.valueOf(processedDate);
	}

}
