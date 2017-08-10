package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.mongodb.BasicDBObject;

public class Person implements RDBMSTable,java.io.Serializable {

	private String name;
	private int id;
	private String DOB;
	private Address address;
	private String city;
	
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
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", DOB=" + DOB
				+ ", address=" + address.toString() + ", city=" + city + "]";
	}
	@Override
	public BasicDBObject composeDBObject(RDBMSTable table) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
