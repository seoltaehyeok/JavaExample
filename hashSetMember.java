package HashSet;

import java.util.Objects;

public class hashSetMember {
	public String name;
	public int age;
	
	public hashSetMember(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof hashSetMember) { 
			hashSetMember member = (hashSetMember) obj;
		return member.name.equals(name) && member.age == age; // 둘다 true라면 true리턴
	} else {
		return false;
	}
}
	@Override
	public int hashCode() {
		// return name.hashCode() + age;
		return Objects.hash(name, age);
		
	}
}
