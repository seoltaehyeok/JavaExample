package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); // 2�� �ε����� ������ ���� (���� 2���ε��� �����ʹ� 3���ε����� �̵�)
		list.add("iBATIS"); // �ڵ����� 4�� �ε����� ����
		
		int size = list.size();
		System.out.println("�� ��ü��: " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();
		
		list.remove(2); // 2�� �ε����� �����͸� ����� 3�� 4���� ������ ����� 2���� 3�� �ε����� �����
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
	}
}
