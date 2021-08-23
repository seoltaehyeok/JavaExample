package Ramda_Operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score); // 둘 중에 큰값 혹은 작은값을 리턴하도록
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최대값 얻기
		int max = maxOrMin(
			(a,b) -> {
				if(a>=b) return a;
				else return b;
			}
	);
		System.out.println("최대값: " + max);
		
		//최소값 얻기
		int min = maxOrMin(
			(a,b) -> {
				if(a<=b) return a;
				else return b;
			}	
		);
		System.out.println("최소값: " + min);
	}
}
