package com.loan.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ms_customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@Override
	public String toString() {
		return "cid=" + cid ;
	}

	public Customer(int cid, String firstName, String lastName, Date dateOfBirth, String panNumber, long mobileNumber,
			String address, String guardianName, Date lastUpdatedAt, User lastUpdatedBy) {
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
	}

	public Customer() {
		super();
	}

	// Constructors, getters, and setters
}