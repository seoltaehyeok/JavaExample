package Ramda_NoArguments_NoReturn;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		//#1 중괄호 안에는 함수적인터페이스의 method()의 내용을 작성
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};	//위의 람다식은 MyFunctionalInterface 인터페이스의 익명구현객체가 된다.
		fi.method();
		
		//#2
		fi = () -> { System.out.println("method call2"); };
		fi.method();
		
		//#3 #2와 동일코드
		fi = () -> System.out.println("method call3");
		fi.method();
		
		//#4 익명객체
		fi = new MyFunctionalInterface() {
			public void method() {
				System.out.println("method call4");
			}
		};
		fi.method();
	}
}

