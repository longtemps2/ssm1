package com.atlt.beans;

import java.util.List;



public class Dept {

	
	private int id;
	private String dname;
	private List<Users> l;
	
	public Dept(int id, String dname, List<Users> l) {
		super();
		this.id = id;
		this.dname = dname;
		this.l = l;
	}
	public Dept() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", dname=" + dname + ", l=" + l + "]";
	}

}
