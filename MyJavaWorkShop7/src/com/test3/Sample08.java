package com.test3;

import java.util.ArrayList;

class Database {
	void open() {
		System.out.println("Database open");
	}
}

class Oracle extends Database {
	void select_oracle() {
		System.out.println("Oracle select");
	}
}

class Mysql extends Database {
	void select_mysql() {
		System.out.println("MySql select");
	}
}

public class Sample08 {
	public static void main(String[] args) {
		Oracle oracle = new Oracle();
		oracle.open();
		oracle.select_oracle();
		Database database = oracle;
		database.open();
		
//		Oracle oracle2 = new Oracle();
//		Database database2 = oracle2;
		Database database2 = new Oracle();
		database2.open();
		
		Mysql mysql = new Mysql();
		mysql.open();
		mysql.select_mysql();
		Database database3 = new Mysql();
		ArrayList a1 = new ArrayList();
		a1.add(1);
		a1.add("ÀÌ¼ø½Å");
		a1.add(new Oracle());
		Object o = a1.get(2);
		Oracle o2 = (Oracle)o;
		o2.open();
//		openDb(new Oracle());
//		openDb(new Mysql());
		
//	}
//	
//	static Database openDb(Database db) {
//		
//	}
//	
//	static void openDb(Database db) {
//		// Database db = new Oracle()
//		// Database db = new Mysql()
//		db.open();
//		
	}

}
