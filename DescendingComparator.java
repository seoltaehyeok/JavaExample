package Comparator;
import java.util.Comparator;

import Comparator.CompFruit;

public class DescendingComparator implements Comparator<CompFruit>{

	@Override
	public int compare(CompFruit o1, CompFruit o2) {
		if(o1.price < o2.price) return 1;
		else if(o1.price == o2.price) return 0;
		else return -1;
	}
	
}
