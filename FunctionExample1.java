package Ramda_Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	/*list 컬렉션*/
	private static List<Function_Student> list = Arrays.asList(
			new Function_Student("홍길동", 90, 96),
			new Function_Student("신용권", 95, 93)
			); 
	
	public static void printString(Function<Function_Student, String> function) {
		for(Function_Student student : list) {
			//Student를 매개값으로 받고, String으로 리턴함
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Function_Student> function) {
		for(Function_Student student : list) {
			//Student를 매개값으로 받고, Int로 리턴함
			System.out.print(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}
	
		
	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		//printString(t-> { return t.getName(); } );
		printString(t-> t.getName()); //학생객체를 매개값으로 주면 학생이름이 리턴되도록 함
		
		System.out.println("[영어 점수]");
		printInt(t-> t.getEnglishScore());
		
		System.out.println("[수학 점수]");
		printInt(t-> t.getMathScore());
	}

}














