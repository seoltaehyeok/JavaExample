package comparable;

public class CompPerson implements Comparable<CompPerson>{
	public String name;
	public int age;
	
	public CompPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(CompPerson o) {
		if(age<o.age) return -1;
		else if(age == o.age) return 0;
		else return 1;
	}
}
