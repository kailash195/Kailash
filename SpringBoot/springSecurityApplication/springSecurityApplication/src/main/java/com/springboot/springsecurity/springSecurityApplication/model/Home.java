package com.springboot.springsecurity.springSecurityApplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Home")
public class Home {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long homeNo;
	
	@Column(name = "homeArea")
	private String homeArea;

	
	
	public Home(long homeNo, String homeArea) {
		super();
		this.homeNo = homeNo;
		this.homeArea = homeArea;
	}

	
	
	public Home() {
		super();
	}



	public long getHomeNo() {
		return homeNo;
	}

	public void setHomeNo(long homeNo) {
		this.homeNo = homeNo;
	}

	public String getHomeArea() {
		return homeArea;
	}

	public void setHomeArea(String homeArea) {
		this.homeArea = homeArea;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + homeNo + ", empName=" + homeArea + "]";
	}
	
	

}
