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
		
		Scanner scanner = new Scanner(System.in); // 키보드에서 입력된 값을 얻기위해 Scanner를 사용
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디: ");
			String id = scanner.nextLine(); // 사용자가 입력하고 Enter를 누르면 그때까지 입력한 문자열을 리턴
			
			System.out.print("비밀번호: ");
			String password = scanner.nextLine(); // 사용자가 입력하고 Enter를 누르면 그때까지 입력한 문자열을 리턴
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("로그인 되었습니다.");
					break;
				} else { // 비밀번호가 맞지 않는 경우
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else { // 아이디가 일치하지 않는 경우
				System.out.println("아이디가 존재하지 않습니다.");
			}
			
			
		}
	}

}
