package com.bala.mongo.MongoJson.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DBDetails {
	private String db;
	private List<String> tableNames;
	private String hostName;
	private int portNumber;
	private String userName;
	private String password;

	public DBDetails() {
		tableNames = new ArrayList<String>();
	}

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public List<String> getTableNames() {
		return tableNames;
	}

	public void setTableNames(List<String> tableNames) {
		this.tableNames = tableNames;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public int getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(int portNumber) {
		this.portNumber = portNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setTableName(String tableName) {
		this.tableNames.add(tableName);
	}

	public String toString() {
		return "Host - " + getHostName() + ", Port - " + getPortNumber()
				+ ", DB - " + getDb() + ", User - " + getUserName()
				+ ", Password - " + getPassword() + ", Table names - "
				+ Arrays.toString(tableNames.toArray());
	}
}
