
public class Sample09 {

	public static void main(String[] args) {
		try {
			int a = 1/0;
		} catch(OutOfMemoryError ex) {
			System.out.println("OutOfMemoryError���� �߻��Ͽ����� �����ڿ��� �������ּ���.");
		} catch(ArithmeticException ex) {
			String name = ex.getMessage();
			System.out.println(name);
			System.out.println("ArithmeticException���� �߻��Ͽ����� �����ڿ��� �������ּ���.");
		} catch(Exception ex) {
			System.out.println("Exception������ �߻��Ͽ����ϴ�.");
		}
		Object o = new Object();
	}

}
