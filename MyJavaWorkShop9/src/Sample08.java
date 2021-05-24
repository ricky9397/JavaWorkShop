// Value type
// reference type => Object class

class Employee extends Object {
	public String toStirng() {
		Integer i = new Integer(this.hashCode());
		return  i.toString();
	}
}

public class Sample08 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		String temp = emp.toStirng();
		System.out.println(temp);
		System.out.println(emp.toStirng());
		Employee emp2 = new Employee();
		System.out.println(emp2.toStirng());
		int a = 1;
		Integer a1 = new Integer(1);
		Float a2 = new Float(1.2);
	}

}
