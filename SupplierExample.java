package Ramda_Supplier;



import java.util.function.IntSupplier;

public class SupplierExample {

	public static void main(String[] args) {
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random()*6) + 1;
			return num;
		};
		int num = intSupplier.getAsInt(); //getAsInt()를 통해 위의 람다식 실행
		System.out.println("눈의 수: " + num);
	}
}
