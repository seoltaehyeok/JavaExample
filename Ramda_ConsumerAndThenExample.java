package Ramda_andthen_compose;

import java.util.function.Consumer;

public class Ramda_ConsumerAndThenExample {

	public static void main(String[] args) {
		Consumer<Ramda_Member> consumerA = (m) -> {
			System.out.println("consumerA: " + m.getName());
		};
		
		Consumer<Ramda_Member> consumerB = (m) -> {
			System.out.println("consumerB: " + m.getId());
		};
		
		Consumer<Ramda_Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Ramda_Member("ȫ�浿", "hong", null));
	}

}
