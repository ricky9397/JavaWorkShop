package com.test4;

interface IDatabase {
	public void open();
}
class Oracle implements IDatabase {
	@Override
	public void open() {
		System.out.println("Oracle open");
	}
}
class MySql implements IDatabase {
	@Override
	public void open() {
		System.out.println("MySql open");
	}
}
class Sql implements IDatabase{
	@Override
	public void open() {
		System.out.println("Sql open");
	}
}
class DbManager {
	IDatabase db;
	public DbManager(IDatabase db) {	// IDatabase db = new Oracle();
		this.db = db;
	}
	public void run() {
		db.open();
	}
}
public class Sample05 {

	public static void main(String[] args) {
		DbManager dbg = new DbManager(new Oracle());
		dbg.run();
		DbManager dbg2 = new DbManager(new MySql());
		dbg2.run();
		DbManager dbg3 = new DbManager(new Sql());
		dbg3.run();
	}

}
