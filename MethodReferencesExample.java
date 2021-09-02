package Method_references;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {

	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		//정적 메소드 참조
		operator = (x, y) -> Method_Calculator.staticMethod(x, y); // 두 코드는 동일
		System.out.println("결과1: " + operator.applyAsInt(1, 2));
		
		operator = Method_Calculator :: staticMethod;
		System.out.println("결과2: " + operator.applyAsInt(3, 4));  // 두 코드는 동일
		
		//------------------------------------------------------//
		
		//인스턴스 메소드 참조
		Method_Calculator obj = new Method_Calculator();
		operator = (x, y) -> obj.instanceMethod(x, y);				// 두 코드는 서로 동일
		System.out.println("결과3: " + operator.applyAsInt(5, 6)); 
		
		operator = obj :: instanceMethod;
		System.out.println("결과4: " + operator.applyAsInt(7, 8));	// 두 코드는 서로 동일
	}

}
