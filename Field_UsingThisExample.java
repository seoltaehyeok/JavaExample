package Ramda_field;

public class Field_UsingThisExample {

	public static void main(String[] args) {
		Field_UsingThis usingThis = new Field_UsingThis();
		Field_UsingThis.Inner inner = usingThis.new Inner();
		inner.method();
	}

}
