package comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<CompPerson> treeSet = new TreeSet<CompPerson>();
		
		treeSet.add(new CompPerson("È«±æµ¿", 45));
		treeSet.add(new CompPerson("¼³ÅÂÇõ", 25));
		treeSet.add(new CompPerson("°¨ÀÚ¹Ù", 35));
		
		Iterator<CompPerson> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			CompPerson person = iterator.next();
			System.out.println(person.name + ":" + person.age);
		}
	}

}
