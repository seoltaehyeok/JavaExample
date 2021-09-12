package hashTable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in); // Ű���忡�� �Էµ� ���� ������� Scanner�� ���
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
			System.out.print("���̵�: ");
			String id = scanner.nextLine(); // ����ڰ� �Է��ϰ� Enter�� ������ �׶����� �Է��� ���ڿ��� ����
			
			System.out.print("��й�ȣ: ");
			String password = scanner.nextLine(); // ����ڰ� �Է��ϰ� Enter�� ������ �׶����� �Է��� ���ڿ��� ����
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				} else { // ��й�ȣ�� ���� �ʴ� ���
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			} else { // ���̵� ��ġ���� �ʴ� ���
				System.out.println("���̵� �������� �ʽ��ϴ�.");
			}
			
			
		}
	}

}
