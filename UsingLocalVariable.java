package Ramda_local_variable;

public class UsingLocalVariable {
	void method(int arg) { // fianl int arg �� ����
		int localVar = 40; // final int localVar �� ����
		
		
		local_variable_MyFunctionalInterface fi = () -> {
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar);
		};
		fi.method();
	}
}
