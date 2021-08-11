package Ramda_Arguments;

public class Ramda_ArgumentsExample {

	public static void main(String[] args) {
		Ramda_ArgumentsInterface fi;
		
		/*약식표현*/
		
		//#1
		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(2);
		
		//#2
		fi = (x) -> {System.out.println(x * 5); };
		fi.method(2);
		
		
		//#3
		fi = x -> System.out.println(x * 5);
		fi.method(2);
	}
}

