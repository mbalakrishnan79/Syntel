package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.mongodb.BasicDBObject;

public class Address implements java.io.Serializable {

	private String street;
	private int pincode;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", pincode=" + pincode + "]";
	}

}
