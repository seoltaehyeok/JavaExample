package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		//무작위로 순서를 지정해도 저장이 될 때는 이진트리 형식으로 저장됨
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		Integer score = null;
		
		score = scores.first(); // 이진트리 중 가장 왼쪽의 객체를 리턴 (가장 값이 작은 객체)
		System.out.println("가장 낮은 점수: " + score);
		
		score = scores.last(); // 이진트리 중 가장 오른쪽의 객체를 리턴 (가장 값이 큰 객체)
		System.out.println("가장 높은 점수: " + score + "\n");
		
		score = scores.lower(95); // 주어진 객체의 왼쪽의 객체를 리턴 (주어진 객체의 바로 아래의 객체 리턴)
		System.out.println("95보다 바로 아래 점수: " + score);
		
		score = scores.higher(95); // 주어진 객체의 오른쪽 객체를 리턴 (주어진 객체의 바로 위의 객체 리턴)
		System.out.println("95보다 바로 위 점수: " + score);
		
		score = scores.floor(95); // 95점이거나 바로 아래점수 (floor의 경우 자기자신도 포함)
		System.out.println("95점이거나 바로 아래 점수: " + score);
		
		score = scores.ceiling(85); // 85점이거나 바로 위 점수 (ceiling의 경우 자기자신도 포함)
		System.out.println("85점이거나 바로 아래 점수: " + score + "\n");
		
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst(); // 제일 왼쪽자식노드 부터 하나씩 set을 통해 빼낸다. (treeSet에서 노드가 빠짐)
			System.out.println("트리에서 빠진 객체:" + score + " (남은 객체수: " + scores.size() + ")");			
		}

	}

}
