package com.test;

public class Oracle extends Database {
	public Oracle(String connString) {
		this.connString = connString;
	}
	public void setConnString(String connString) {
		this.connString = connString;
	}
	public String getConnString() {
		return this.connString;
	}
	@Override
	public void open() {
		System.out.println("Oracle open : " + this.connString);
	}
}
