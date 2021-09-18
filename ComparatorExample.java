package Comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		TreeSet<CompFruit> treeSet = new TreeSet<CompFruit>(new DescendingComparator());
		treeSet.add(new CompFruit("포도", 3000));
		treeSet.add(new CompFruit("수박", 10000));
		treeSet.add(new CompFruit("딸기", 6000));
		
		Iterator<CompFruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			CompFruit fruit = iterator.next();
			System.out.println(fruit.name + ":" + fruit.price);
		}
	}
}
