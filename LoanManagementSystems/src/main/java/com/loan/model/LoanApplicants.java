package com.loan.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "ms_loanApplicants")
@Entity
public class LoanApplicants {
	@Id
	@Column(name = "lnap_id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "lnap_cust_id")
	private Customer customer;

	@Column(name = "lnap_apdate")
	private Date applicationDate;

	@ManyToOne
	@JoinColumn(name = "lnap_lnty_id")
	private LoanType loanTypeId;

	@Column(name = "lnap_amount")
	private double loanAmount;

	@Column(name = "lnap_emi_range_from")
	private double emiRangeFrom;

	@Column(name = "lnap_emp_range_to")
	private double emiRangeTo;

	@Column(name = "lnap_nom_requested")
	private int numberOfMonthsRequested;

	@Column(name = "lnap_cibil_score")
	private double cibilScore;

	@Column(name = "lnap_status")
	private String status;

	@Column(name = "lnap_conclusion_remarks")
	private String conclusionRemarks;

	@ManyToOne
	@JoinColumn(name = "lnap_processed_user")
	private User lastprocesseduser;

	@Column(name = "lnap_processed_date")
	private Date processedDate;

	public LoanApplicants(int id, Customer customer, Date applicationDate, LoanType loanTypeId, double loanAmount,
			double emiRangeFrom, double emiRangeTo, int numberOfMonthsRequested, double cibilScore, String status,
			String conclusionRemarks, User lastprocesseduser, Date processedDate) {
		super();
		this.id = id;
		this.customer = customer;
		this.applicationDate = applicationDate;
		this.loanTypeId = loanTypeId;
		this.loanAmount = loanAmount;
		this.emiRangeFrom = emiRangeFrom;
		this.emiRangeTo = emiRangeTo;
		this.numberOfMonthsRequested = numberOfMonthsRequested;
		this.cibilScore = cibilScore;
		this.status = status;
		this.conclusionRemarks = conclusionRemarks;
		this.lastprocesseduser = lastprocesseduser;
		this.processedDate = processedDate;
	}

	public LoanApplicants() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	public LoanType getLoanTypeId() {
		return loanTypeId;
	}

	public void setLoanTypeId(LoanType loanTypeId) {
		this.loanTypeId = loanTypeId;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getEmiRangeFrom() {
		return emiRangeFrom;
	}

	public void setEmiRangeFrom(double emiRangeFrom) {
		this.emiRangeFrom = emiRangeFrom;
	}

	public double getEmiRangeTo() {
		return emiRangeTo;
	}

	public void setEmiRangeTo(double emiRangeTo) {
		this.emiRangeTo = emiRangeTo;
	}

	public int getNumberOfMonthsRequested() {
		return numberOfMonthsRequested;
	}

	public void setNumberOfMonthsRequested(int numberOfMonthsRequested) {
		this.numberOfMonthsRequested = numberOfMonthsRequested;
	}

	public double getCibilScore() {
		return cibilScore;
	}

	public void setCibilScore(double cibilScore) {
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

	public User getLastprocesseduser() {
		return lastprocesseduser;
	}

	public void setLastprocesseduser(User lastprocesseduser) {
		this.lastprocesseduser = lastprocesseduser;
	}

	public Date getProcessedDate() {
		return processedDate;
	}

	public void setProcessedDate(Date processedDate) {
		this.processedDate = processedDate;
	}

	@Override
	public String toString() {
		return "LoanApplicants [id=" + id + ", customer=" + customer + ", applicationDate=" + applicationDate
				+ ", loanTypeId=" + loanTypeId + ", loanAmount=" + loanAmount + ", emiRangeFrom=" + emiRangeFrom
				+ ", emiRangeTo=" + emiRangeTo + ", numberOfMonthsRequested=" + numberOfMonthsRequested
				+ ", cibilScore=" + cibilScore + ", status=" + status + ", conclusionRemarks=" + conclusionRemarks
				+ ", lastprocesseduser=" + lastprocesseduser + ", processedDate=" + processedDate + "]";
	}

}
