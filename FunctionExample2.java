package Ramda_Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	/*list 컬렉션*/
	private static List<Function_Student> list = Arrays.asList(
			new Function_Student("홍길동", 90, 96),
			new Function_Student("신용권", 95, 93)
			); 
	
	
	//함수적 인터페이스에게 람다식을 제공하면 function.applyAsInt를 통해 리턴된 값이 나온다.
	//sum에 저장하고 그것에 대해 평균 avg를 리턴받는다.
	public static double avg(ToIntFunction<Function_Student> function) {
		int sum =0;
		for(Function_Student student : list) {
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum / list.size();
		return avg;
	}
		
	public static void main(String[] args) {
		double englishAvg = avg( t->t.getEnglishScore() );
		System.out.println("영어 평균점수: " + englishAvg);
	
		double mathAvg = avg( t->t.getMathScore() );
		System.out.println("수학 평균점수: " + mathAvg);
	
	}
}














