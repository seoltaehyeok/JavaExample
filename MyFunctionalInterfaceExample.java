package Ramda_NoArguments_NoReturn;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		//#1 �߰�ȣ �ȿ��� �Լ����������̽��� method()�� ������ �ۼ�
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};	//���� ���ٽ��� MyFunctionalInterface �������̽��� �͸�����ü�� �ȴ�.
		fi.method();
		
		//#2
		fi = () -> { System.out.println("method call2"); };
		fi.method();
		
		//#3 #2�� �����ڵ�
		fi = () -> System.out.println("method call3");
		fi.method();
		
		//#4 �͸�ü
		fi = new MyFunctionalInterface() {
			public void method() {
				System.out.println("method call4");
			}
		};
		fi.method();
	}
}

