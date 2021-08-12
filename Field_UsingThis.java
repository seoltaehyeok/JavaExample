package Ramda_field;

public class Field_UsingThis {
	public int outterField = 10;
	public int Field = 10;
	class Inner {
		int innerField = 20;
		int Field = 20;
		void method () {
			Field_MyFunctionalInterface fi = () -> {
				// 바깥 클래스 필드
				System.out.println("outterField: " + outterField);
				System.out.println("outterField: " + Field_UsingThis.this.Field); 
				// 안쪽 클래스 필드
				System.out.println("innerField: " + innerField);
				System.out.println("innerField: " + this.Field);
			};
			fi.method(); // 인터페이스의 메소드
		}
	}
}
