package Ramda_Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	/*list �÷���*/
	private static List<Function_Student> list = Arrays.asList(
			new Function_Student("ȫ�浿", 90, 96),
			new Function_Student("�ſ��", 95, 93)
			); 
	
	public static void printString(Function<Function_Student, String> function) {
		for(Function_Student student : list) {
			//Student�� �Ű������� �ް�, String���� ������
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Function_Student> function) {
		for(Function_Student student : list) {
			//Student�� �Ű������� �ް�, Int�� ������
			System.out.print(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}
	
		
	public static void main(String[] args) {
		System.out.println("[�л� �̸�]");
		//printString(t-> { return t.getName(); } );
		printString(t-> t.getName()); //�л���ü�� �Ű������� �ָ� �л��̸��� ���ϵǵ��� ��
		
		System.out.println("[���� ����]");
		printInt(t-> t.getEnglishScore());
		
		System.out.println("[���� ����]");
		printInt(t-> t.getMathScore());
	}

}














