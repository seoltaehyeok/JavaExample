package treeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(87, "홍길동");
		scores.put(98, "이동수");
		scores.put(75, "박길순");
		scores.put(95, "설태혁");
		scores.put(80, "감자바");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수: " + entry.getKey() + "점-" + entry.getValue() + "\n");
		
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수: " + entry.getKey() + "점-" + entry.getValue() + "\n");
		
		
		
		entry = scores.lowerEntry(95); // 95점 아래점수
		System.out.println("95점 아래점수: " + entry.getKey() + "점-" + entry.getValue() + "\n");
		
		entry = scores.higherEntry(95); // 95점 위 점수
		System.out.println("95점 위 점수: " + entry.getKey() + "점-" + entry.getValue() + "\n");
		
		entry = scores.floorEntry(95);
		System.out.println("95점이거나 바로 아래 점수: " + entry.getKey() + "점-" + entry.getValue() + "\n");
		
		entry = scores.ceilingEntry(95);
		System.out.println("95점이거나 바로 위 점수: " + entry.getKey() + "점-" + entry.getValue() + "\n");
		
		// TreeMap에 있는 모든 MapEntry 가져오기
		
		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry(); // 제일 왼쪽 엔트리 가져온 후 엔트리에서 지움
			System.out.println(entry.getKey() + "-" + entry.getValue() + "(남은 객체 수: " + scores.size() + ")");
		}
	}

}
