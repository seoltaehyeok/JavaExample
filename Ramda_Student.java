package Ramda_Predicate;

public class Ramda_Student {
	private String name;
	private String sex;
	private int score;
	
	public Ramda_Student(String name, String sex, int score) {
		this.name = name;
		this.sex = sex;
		this.score = score;
	}
	
	public String getSex() {
		return sex;
	}

	public int getScore() {
		return score;
	}
	
}
