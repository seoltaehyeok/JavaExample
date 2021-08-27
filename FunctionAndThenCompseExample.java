package Ramda_andthen_compose;

import java.util.function.Function;

public class FunctionAndThenCompseExample {
	
	public static void main(String[] args) {
		Function<Ramda_Member, Ramda_Address> functionA;
		Function<Ramda_Address, String> functionB;
		Function<Ramda_Member, String> functionAB;
		
		functionA = (m) -> m.getAddress();
		functionB = (a) -> a.getCity();
		
		functionAB = functionA.andThen(functionB);
		String city = functionAB.apply(
				new Ramda_Member("ȫ�浿", "hong", new Ramda_Address("�ѱ�", "����"))
				);
		System.out.println("���� ����: " + city);
		
		functionAB = functionB.compose(functionA);
		functionAB.apply(
				new Ramda_Member("ȫ�浿", "hong", new Ramda_Address("�ѱ�", "����"))
				);
		System.out.println("���� ����: " + city);
	}
}
