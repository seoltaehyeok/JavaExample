package Ramda_return;

public class Ramda_ReturnExample {

	public static void main(String[] args) {
		Ramda_ReturnInterface fi;
	
		//#1
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		//#2
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(2, 5));
		
		//#3
		fi = (x, y) -> x + y;
		System.out.println(fi.method(2, 5));
		
		//#4
		fi = (x, y) -> sum(x , y);
		System.out.println(fi.method(2, 5));
	}
		public static int sum(int x, int y) {
			return (x + y);
	}
}

