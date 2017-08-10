package com.bala.mongo.MongoJson.model;

import java.lang.reflect.Field;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mongodb.BasicDBObject;

@Entity
@Table(name = "users")
public class Users implements RDBMSTable,java.io.Serializable {

	@Id
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	private String address;
	private String city;
	@Column(name="pin_code")
	private int pinCode;
	

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String toString() {
		return (getFirstName() + ", " + getLastName() + ", "+ getAddress() + ", " + getCity() + ", " + getPinCode());
	}
	
	public BasicDBObject composeDBObject(RDBMSTable table) {
		Field[] fields = new Users().getClass().getDeclaredFields();
		int count = 0;
		Users users = (Users)table;
		
		BasicDBObject doc = new BasicDBObject(
				fields[count++].getName(), users.getFirstName().trim())
				.append(fields[count++].getName(), users.getLastName().trim())
				.append(fields[count++].getName(), users.getAddress().trim())
				.append(fields[count++].getName(), users.getCity().trim())
				.append(fields[count].getName(), users.getPinCode());
		
		return doc;
	}
}

