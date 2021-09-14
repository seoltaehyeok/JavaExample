package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		//�������� ������ �����ص� ������ �� ���� ����Ʈ�� �������� �����
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		Integer score = null;
		
		score = scores.first(); // ����Ʈ�� �� ���� ������ ��ü�� ���� (���� ���� ���� ��ü)
		System.out.println("���� ���� ����: " + score);
		
		score = scores.last(); // ����Ʈ�� �� ���� �������� ��ü�� ���� (���� ���� ū ��ü)
		System.out.println("���� ���� ����: " + score + "\n");
		
		score = scores.lower(95); // �־��� ��ü�� ������ ��ü�� ���� (�־��� ��ü�� �ٷ� �Ʒ��� ��ü ����)
		System.out.println("95���� �ٷ� �Ʒ� ����: " + score);
		
		score = scores.higher(95); // �־��� ��ü�� ������ ��ü�� ���� (�־��� ��ü�� �ٷ� ���� ��ü ����)
		System.out.println("95���� �ٷ� �� ����: " + score);
		
		score = scores.floor(95); // 95���̰ų� �ٷ� �Ʒ����� (floor�� ��� �ڱ��ڽŵ� ����)
		System.out.println("95���̰ų� �ٷ� �Ʒ� ����: " + score);
		
		score = scores.ceiling(85); // 85���̰ų� �ٷ� �� ���� (ceiling�� ��� �ڱ��ڽŵ� ����)
		System.out.println("85���̰ų� �ٷ� �Ʒ� ����: " + score + "\n");
		
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst(); // ���� �����ڽĳ�� ���� �ϳ��� set�� ���� ������. (treeSet���� ��尡 ����)
			System.out.println("Ʈ������ ���� ��ü:" + score + " (���� ��ü��: " + scores.size() + ")");			
		}

	}

}
