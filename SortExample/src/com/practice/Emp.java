package com.practice;

public class Emp implements Comparable<Emp> {
	private int empId;
	private String name;
	private String phone;

	public Emp(int empId, String name, String phone) {
		super();
		this.empId = empId;
		this.name = name;
		this.phone = phone;
	}

	public Emp() {
		super();
	}
	@Override
	public int compareTo(Emp o) {
		
		return this.empId-o.empId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", phone=" + phone + "]";
	}

}
