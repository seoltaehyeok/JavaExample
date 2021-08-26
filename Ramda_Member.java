package Ramda_andthen_compose;

public class Ramda_Member {
	private String name;
	private String id;
	private Ramda_Address address;
	
	public Ramda_Member(String name, String id, Ramda_Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
		
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public Ramda_Address getAddress() {
		return address;
	}
}
