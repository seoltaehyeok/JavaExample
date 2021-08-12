package Ramda_Consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer <String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java"); // accept때문이 아니라, 매개변수 타입이 String 이므로 String 타입으로 주어야 함
	
		BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t+u);
		biConsumer.accept("java", "8");
		
		DoubleConsumer doubleConsumer = d -> System.out.println("java" + d);
		doubleConsumer.accept(8.0);
		
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("java", 8);
	}
}
