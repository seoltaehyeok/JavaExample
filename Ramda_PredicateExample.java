package Ramda_Predicate;

import java.util.function.Predicate;

public class Ramda_PredicateExample {
	private static List<Ramda_Student> list = Arrays.asList(
			new Ramda_Student("홍길동", "남자", 90),
			new Ramda_Student("김순희", "여자", 90),
			new Ramda_Student("감자바", "남자", 95),
			new Ramda_Student("박한나", "여자", 92)
			);
	
	//true가 나오는것만 평균을 구함
	public static double avg(Predicate<Ramda_Student> predicate) {
		int count = 0, sum = 0;
		for(Ramda_Student student : list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum/count;
	}
	public static void main(String[] args) {
		//남자평균
		double maleAvg = avg( t-> t.getSex().equals("남자"));
		System.out.println("남자 평균점수: " + maleAvg);
		//여자평균
		double femaleAvg = avg( t-> t.getSex().equals("여자"));
		System.out.println("남자 평균점수: " + femaleAvg);
	}

}
