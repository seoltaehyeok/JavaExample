package comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<CompPerson> treeSet = new TreeSet<CompPerson>();
		
		treeSet.add(new CompPerson("ȫ�浿", 45));
		treeSet.add(new CompPerson("������", 25));
		treeSet.add(new CompPerson("���ڹ�", 35));
		
		Iterator<CompPerson> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			CompPerson person = iterator.next();
			System.out.println(person.name + ":" + person.age);
		}
	}

}
