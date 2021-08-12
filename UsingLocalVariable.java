package Ramda_local_variable;

public class UsingLocalVariable {
	void method(int arg) { // fianl int arg 客 悼老
		int localVar = 40; // final int localVar 客 悼老
		
		
		local_variable_MyFunctionalInterface fi = () -> {
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar);
		};
		fi.method();
	}
}
