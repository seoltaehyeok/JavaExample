package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		Map<HashMapStudent, Integer> map = new HashMap<HashMapStudent, Integer>();
		
		//HashMap 의 경우 key가 동등객체의 경우 중복저장되지 않는다.
		map.put(new HashMapStudent(1, "홍길동"), 95);
		map.put(new HashMapStudent(1, "홍길동"), 90);
		
		System.out.println("총 Entry 수: " + map.size());
		
		System.out.println(map.get(new HashMapStudent(1, "홍길동")));
	}

}
