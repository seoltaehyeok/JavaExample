package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>(); // key: String, value: Integer
		
		
		//key�� ���� ��� �ߺ�������� ����
		map.put("������", 85);
		map.put("ȫ�浿", 60);
		map.put("�̼���", 80);
		map.put("ȫ�浿", 95); //������ ȫ�浿 key�� ���� ���� ����
		
		System.out.println("�� Entry ��: " + map.size());
		
		System.out.println("ȫ�浿: "+ map.get("ȫ�浿")); //ȫ�浿���� ����� �� ���
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator(); //key�� �ݺ��ڸ� ����
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + ": " + value);
		}
		System.out.println();
		
		//��ü ����
		map.remove("ȫ�浿");
		System.out.println("�� Entry ��: " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + ": " + value);
			}
		System.out.println();
		
		//��ü����
		map.clear();
		System.out.println("�� Entry ��: " + map.size());
	}
}
