
public class Sample04 {

	// method �޼ҵ�, �Լ�, ���ν��� => swap
	public static void main(String[] args) {
		int price = 1000;
		float rate = 10.2f;
		float total = price*rate;
		System.out.println(total);
		String LastName = "Dennis";
		String FirstName = "Lee";
		String temp = "1234";
		String FullName = LastName + ", "+ FirstName;
		System.out.println(FullName);
		boolean check = true;
		boolean check2 = false;
		System.out.println(check);
		System.out.println(check2);
		byte a2 = 10;
		double a3 = 10.00d;
		System.out.println(a3);
		char a4 = 'b';
		char a5 = 'a';
		System.out.println(a4);
		System.out.println(a5);
		
		String a6 = "7" + 7;
		System.out.println(a6);
		String a7 = 7+7+"8";
		System.out.println(a7);
		String name1 = "������";
		String name2 = "�������";
		//��������� ���������� �Ǹ��ϴ�.
		String str = name2+"�� "+ name1 + "���� �Ǹ��ϴ�";
		System.out.println(str);
//		String str2 = "%s�� %s���� �Ǹ��ϴ�";
		System.out.printf("%s�� %s���� �Ǹ��ϴ�",name2, name1);
		
	}
}
