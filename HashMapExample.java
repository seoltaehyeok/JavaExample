package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>(); // key: String, value: Integer
		
		
		//key가 같은 경우 중복저장되지 않음
		map.put("설태혁", 85);
		map.put("홍길동", 60);
		map.put("이순신", 80);
		map.put("홍길동", 95); //이전의 홍길동 key의 값이 새로 적용
		
		System.out.println("총 Entry 수: " + map.size());
		
		System.out.println("홍길동: "+ map.get("홍길동")); //홍길동으로 저장된 값 출력
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator(); //key의 반복자를 얻음
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + ": " + value);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + ": " + value);
			}
		System.out.println();
		
		//전체삭제
		map.clear();
		System.out.println("총 Entry 수: " + map.size());
	}
}
