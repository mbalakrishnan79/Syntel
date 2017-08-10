package com.bala.mongo.SparkWithMongo;

import java.util.List;

import org.apache.spark.sql.Row;

public class Employee {

	private String name;
	private int id;
	private String dept;
	private String skill;
	private String city;

	public Employee() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public String toString() {
		return (getName() + ", " + getId() + ", " + getDept() + ", "
				+ getSkill() + ", " + getCity());
	}
	
	public static void composeEmployee(List<Row> result) {
		for (Row row : result) {
			Employee employee = new Employee();
			employee.setCity(row.getString(1));
			employee.setDept(row.getString(2));
			employee.setId(row.getInt(3));
			employee.setName(row.getString(4));
			employee.setSkill(row.getString(5));
			System.out.println("");
			System.out.println(employee.toString());
			System.out.println("");
		}

	}

}
