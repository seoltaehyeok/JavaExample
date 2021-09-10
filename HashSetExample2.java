package HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<hashSetMember> set = new HashSet<hashSetMember>();
		
		// 서로 다른 객체, 데이터는 같은 객체 => 동등 객체 (hashSet의 경우 동등객체의 경우도 중복x)
		set.add(new hashSetMember("홍길동", 30));
		set.add(new hashSetMember("홍길동", 30));
		
		System.out.println("총 객체수: "+ set.size());
		
	}

}
