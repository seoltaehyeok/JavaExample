package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); // 2번 인덱스의 정보를 갱신 (기존 2번인덱스 데이터는 3번인덱스로 이동)
		list.add("iBATIS"); // 자동으로 4번 인덱스에 저장
		
		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();
		
		list.remove(2); // 2번 인덱스의 데이터를 지우면 3번 4번은 앞으로 당겨져 2번과 3번 인덱스에 저장됨
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
	}
}
