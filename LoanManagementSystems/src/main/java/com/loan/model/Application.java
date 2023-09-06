package com.loan.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Application {
	//customer
	@Column(name = "cust_id")
	private int cid;

	@Column(name = "cust_firstname")
	private String firstName;

	@Column(name = "cust_lastname")
	private String lastName;

	@Column(name = "cust_dob")
	private Date dateOfBirth;

	@Column(name = "cust_panno")
	private String panNumber;

	@Column(name = "cust_mobile")
	private long mobileNumber;

	@Column(name = "cust_address")
	private String address;

	@Column(name = "cust_gname")
	private String guardianName;

	@Column(name = "cust_luudate")
	private Date lastUpdatedAt;

	@ManyToOne
	@JoinColumn(name = "cust_luser")
	private User lastUpdatedBy;
	
	//loan applicant
	
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
	//nominee
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lnap_id")
    private int nid;

    @Column(name = "lnap_nominee")
    private String nominee;

    @Column(name = "lanp_relation")
    private String relation;

    @ManyToOne
    @JoinColumn(name = "lnap_id", referencedColumnName = "lnap_id", insertable = false, updatable = false)
    private LoanApplicants loanApplicant;

	public Application() {
		super();
	}

	public Application(int cid, String firstName, String lastName, Date dateOfBirth, String panNumber,
			long mobileNumber, String address, String guardianName, Date lastUpdatedAt, User lastUpdatedBy, int id,
			Customer customer, Date applicationDate, LoanType loanTypeId, double loanAmount, double emiRangeFrom,
			double emiRangeTo, int numberOfMonthsRequested, double cibilScore, String status, String conclusionRemarks,
			User lastprocesseduser, Date processedDate, int nid, String nominee, String relation,
			LoanApplicants loanApplicant) {
		super();
		this.cid = cid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.panNumber = panNumber;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.guardianName = guardianName;
		this.lastUpdatedAt = lastUpdatedAt;
		this.lastUpdatedBy = lastUpdatedBy;
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
		this.nid = nid;
		this.nominee = nominee;
		this.relation = relation;
		this.loanApplicant = loanApplicant;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public Date getLastUpdatedAt() {
		return lastUpdatedAt;
	}

	public void setLastUpdatedAt(Date lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}

	public User getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(User lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
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

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public LoanApplicants getLoanApplicant() {
		return loanApplicant;
	}

	public void setLoanApplicant(LoanApplicants loanApplicant) {
		this.loanApplicant = loanApplicant;
	}

	@Override
	public String toString() {
		return "Application [cid=" + cid + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", panNumber=" + panNumber + ", mobileNumber=" + mobileNumber + ", address=" + address
				+ ", guardianName=" + guardianName + ", lastUpdatedAt=" + lastUpdatedAt + ", lastUpdatedBy="
				+ lastUpdatedBy + ", id=" + id + ", customer=" + customer + ", applicationDate=" + applicationDate
				+ ", loanTypeId=" + loanTypeId + ", loanAmount=" + loanAmount + ", emiRangeFrom=" + emiRangeFrom
				+ ", emiRangeTo=" + emiRangeTo + ", numberOfMonthsRequested=" + numberOfMonthsRequested
				+ ", cibilScore=" + cibilScore + ", status=" + status + ", conclusionRemarks=" + conclusionRemarks
				+ ", lastprocesseduser=" + lastprocesseduser + ", processedDate=" + processedDate + ", nid=" + nid
				+ ", nominee=" + nominee + ", relation=" + relation + ", loanApplicant=" + loanApplicant + "]";
	}
    
    

}
