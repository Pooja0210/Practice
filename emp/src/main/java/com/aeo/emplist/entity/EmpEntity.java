package com.aeo.emplist.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmpEntity {
	
	@Id
	@GeneratedValue
	 private int empNumber;
     private String firstName;
     private String lastName;
     private String project;
     private String managerName;
	public EmpEntity() {
		super();
	}
	public EmpEntity(int empNumber, String firstName, String lastName, String project, String managerName) {
		super();
		this.empNumber = empNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.project = project;
		this.managerName = managerName;
	}
	public int getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
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
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	@Override
	public String toString() {
		return "EmpEntity [empNumber=" + empNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", project=" + project + ", managerName=" + managerName + "]";
	}
     
     
}
