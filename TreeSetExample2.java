package treeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for(Integer score : descendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		NavigableSet<Integer> asendingSet = descendingSet.descendingSet(); // 내림차순 상태에서 또 내림차순을 시키면 값이 아예 뒤바뀌어 나온다.
		for(Integer score : asendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();
	}

}
