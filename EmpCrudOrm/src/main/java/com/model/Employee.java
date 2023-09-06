package com.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ishwarya")
@Entity // here to write different names for class and database table
public class Employee {

	@Id
	private Integer empno;
	@Column(name = "ename")
	private String eName;
	private String job;
	private Integer mgr;
	private Date hiredate;
	private Double sal;
	private Double comm;

	@Column(name = "dept_no")
	private Integer deptNo;

	public Employee(Integer empno, String eName, String job, Integer mgr, Date hiredate, Double sal, Double comm,
			Integer deptNo) {
		super();
		this.empno = empno;
		this.eName = eName;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", eName=" + eName + ", job=" + job + ", mgr=" + mgr + ", hiredate="
				+ hiredate + ", sal=" + sal + ", comm=" + comm + ", deptNo=" + deptNo + "]";
	}

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getMgr() {
		return mgr;
	}

	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Double getComm() {
		return comm;
	}

	public void setComm(Double comm) {
		this.comm = comm;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public Employee() {
		super();
	}

}
