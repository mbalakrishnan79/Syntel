package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.mongodb.BasicDBObject;

@Entity
@Table(name = "employee")
public class Employee implements RDBMSTable,java.io.Serializable {

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
	
	public String toString() {
		return (getName() + ", " + getId() + ", "+ getDept() + ", " + getSkill() + ", " + getCity());
	}
	
	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new Employee().getClass().getDeclaredFields();
		int count = 0;
		Employee employee = (Employee)table;
		
		BasicDBObject doc = new BasicDBObject(
				fields[count++].getName(), employee.getName().trim())
				.append(fields[count++].getName(), employee.getId())
				.append(fields[count++].getName(), employee.getDept().trim())
				.append(fields[count++].getName(), employee.getSkill().trim())
				.append(fields[count].getName(), employee.getCity().trim());
		
		return doc;
	}
}
