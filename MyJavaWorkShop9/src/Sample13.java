import java.util.*;

class Student3 {
	public void study() {
		System.out.println("student study");
	}
}
public class Sample13 {

	public static void main(String[] args) {
		Student3[] stus = new Student3[3];
		stus[0] = new Student3();
		
		List<Student3> stus2 = new ArrayList<Student3>();
		stus2.add(new Student3());
		stus2.get(0).study();
	}

}
