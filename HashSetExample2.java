package HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<hashSetMember> set = new HashSet<hashSetMember>();
		
		// ���� �ٸ� ��ü, �����ʹ� ���� ��ü => ���� ��ü (hashSet�� ��� ���ü�� ��쵵 �ߺ�x)
		set.add(new hashSetMember("ȫ�浿", 30));
		set.add(new hashSetMember("ȫ�浿", 30));
		
		System.out.println("�� ��ü��: "+ set.size());
		
	}

}
