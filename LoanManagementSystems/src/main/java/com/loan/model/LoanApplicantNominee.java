package com.loan.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name = "loanApplicantsNominees")
public class LoanApplicantNominee {

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

	public LoanApplicantNominee() {
		super();
	}

	public LoanApplicantNominee(int nid, String nominee, String relation, LoanApplicants loanApplicant) {
		super();
		this.nid = nid;
		this.nominee = nominee;
		this.relation = relation;
		this.loanApplicant = loanApplicant;
	}

	@Override
	public String toString() {
		return "LoanApplicantNominee [nid=" + nid + ", nominee=" + nominee + ", relation=" + relation
				+ ", loanApplicant=" + loanApplicant + "]";
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

}
