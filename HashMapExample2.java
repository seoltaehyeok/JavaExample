package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		Map<HashMapStudent, Integer> map = new HashMap<HashMapStudent, Integer>();
		
		//HashMap �� ��� key�� ���ü�� ��� �ߺ�������� �ʴ´�.
		map.put(new HashMapStudent(1, "ȫ�浿"), 95);
		map.put(new HashMapStudent(1, "ȫ�浿"), 90);
		
		System.out.println("�� Entry ��: " + map.size());
		
		System.out.println(map.get(new HashMapStudent(1, "ȫ�浿")));
	}

}
