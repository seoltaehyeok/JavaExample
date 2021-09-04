package constructor_references;

public class ConstructorMember {
	private String name;
	private String id;
	
	
	public ConstructorMember() {
		System.out.println("ConstructorMember() ����");
	}
	
	public ConstructorMember(String id) {
		System.out.println("ConstructorMember(String id) ����");
		this.id = id;
	}
	
	public ConstructorMember(String name, String id) {
		System.out.println("ConstructorMember(String name, String id)");
		this.name = name;
		this.id = id;
	}
}
