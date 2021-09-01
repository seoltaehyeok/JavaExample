package Ramda_MinByMaxBy;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {

	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
		//f1이크면 양수, 작으면 음수, 같으면 0
		//minBy는 둘 중 작은값을 리턴
		binaryOperator = BinaryOperator.minBy( (f1, f2) -> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println(fruit.name);
		
		//maxBy는 둘 중 큰값을 리턴
		binaryOperator = BinaryOperator.maxBy( (f1, f2) -> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println(fruit.name);
	}
}
