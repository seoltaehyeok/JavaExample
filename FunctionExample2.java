package Ramda_Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	/*list �÷���*/
	private static List<Function_Student> list = Arrays.asList(
			new Function_Student("ȫ�浿", 90, 96),
			new Function_Student("�ſ��", 95, 93)
			); 
	
	
	//�Լ��� �������̽����� ���ٽ��� �����ϸ� function.applyAsInt�� ���� ���ϵ� ���� ���´�.
	//sum�� �����ϰ� �װͿ� ���� ��� avg�� ���Ϲ޴´�.
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
		System.out.println("���� �������: " + englishAvg);
	
		double mathAvg = avg( t->t.getMathScore() );
		System.out.println("���� �������: " + mathAvg);
	
	}
}














