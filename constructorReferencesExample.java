package constructor_references;

import java.util.function.BiFunction;
import java.util.function.Function;

public class constructorReferencesExample {

	public static void main(String[] args) {
		//ConstructorMember�� ������ �߿��� �Ű������� String���� ������ �����ڸ� ȣ��Ǿ ConstructorMember��ü�� ����
		Function<String, ConstructorMember> function1 = ConstructorMember :: new;
		ConstructorMember member1 = function1.apply("angel"); //angel�� �������� �Ű���
		
		
		BiFunction<String, String, ConstructorMember> function2 = ConstructorMember :: new;
		ConstructorMember member2 = function2.apply("��õ��", "angel");
	}

}
