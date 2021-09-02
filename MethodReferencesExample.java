package Method_references;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {

	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		//���� �޼ҵ� ����
		operator = (x, y) -> Method_Calculator.staticMethod(x, y); // �� �ڵ�� ����
		System.out.println("���1: " + operator.applyAsInt(1, 2));
		
		operator = Method_Calculator :: staticMethod;
		System.out.println("���2: " + operator.applyAsInt(3, 4));  // �� �ڵ�� ����
		
		//------------------------------------------------------//
		
		//�ν��Ͻ� �޼ҵ� ����
		Method_Calculator obj = new Method_Calculator();
		operator = (x, y) -> obj.instanceMethod(x, y);				// �� �ڵ�� ���� ����
		System.out.println("���3: " + operator.applyAsInt(5, 6)); 
		
		operator = obj :: instanceMethod;
		System.out.println("���4: " + operator.applyAsInt(7, 8));	// �� �ڵ�� ���� ����
	}

}
