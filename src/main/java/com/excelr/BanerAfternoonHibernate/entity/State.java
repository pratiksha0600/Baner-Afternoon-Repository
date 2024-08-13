package com.excelr.BanerAfternoonHibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class State {
     
    @Id
 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sno;
	private String sname;
	private String Capcity;
	
	@OneToOne(mappedBy = "state")
	ChiefMinister chiefMinister;
	
	public State() {}
	public State(int sno, String sname, String capcity) {
		
		this.sno = sno;
		this.sname = sname;
		Capcity = capcity;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCapcity() {
		return Capcity;
	}
	public void setCapcity(String capcity) {
		Capcity = capcity;
	}
	public ChiefMinister getChiefMinister() {
		return chiefMinister;
	}
	public void setChiefMinister(ChiefMinister chiefMinister) {
		this.chiefMinister = chiefMinister;
	}
	@Override
	public String toString() {
		return "State [sno=" + sno + ", sname=" + sname + ", Capcity=" + Capcity + "]";
	}
	
}
