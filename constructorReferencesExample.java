package constructor_references;

import java.util.function.BiFunction;
import java.util.function.Function;

public class constructorReferencesExample {

	public static void main(String[] args) {
		//ConstructorMember의 생성자 중에서 매개변수를 String으로 가지는 생성자를 호출되어서 ConstructorMember객체가 생성
		Function<String, ConstructorMember> function1 = ConstructorMember :: new;
		ConstructorMember member1 = function1.apply("angel"); //angel은 생성자의 매개값
		
		
		BiFunction<String, String, ConstructorMember> function2 = ConstructorMember :: new;
		ConstructorMember member2 = function2.apply("신천사", "angel");
	}

}
