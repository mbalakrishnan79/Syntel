package com.bala.hibernateTest.HibernateTest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "employee")
public class Employee implements java.io.Serializable {

	private String name;
	private int id;
	private String dept;
	private String skill;
	private String city;
	
	public Employee() {
	}

	public void clear() {
		name="";
		id=0;
		dept="";
		skill="";
		city="";
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Id
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getSkill() {
		return skill;
	}


	public void setSkill(String skill) {
		this.skill = skill;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
}
