package constructor_references;

public class ConstructorMember {
	private String name;
	private String id;
	
	
	public ConstructorMember() {
		System.out.println("ConstructorMember() 실행");
	}
	
	public ConstructorMember(String id) {
		System.out.println("ConstructorMember(String id) 실행");
		this.id = id;
	}
	
	public ConstructorMember(String name, String id) {
		System.out.println("ConstructorMember(String name, String id)");
		this.name = name;
		this.id = id;
	}
}
