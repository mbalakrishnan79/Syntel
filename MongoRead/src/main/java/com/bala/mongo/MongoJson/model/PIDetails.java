package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.annotations.SerializedName;
import com.mongodb.BasicDBObject;

public class PIDetails implements RDBMSTable,java.io.Serializable {

	private String name;
	private int id;
	private Date DOB;
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
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
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
				 + ", city=" + city + "]";
	}
	@Override
	public BasicDBObject composeDBObject(RDBMSTable table) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
