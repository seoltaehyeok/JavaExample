package Ramda_Predicate;

import java.util.function.Predicate;

public class Ramda_PredicateExample {
	private static List<Ramda_Student> list = Arrays.asList(
			new Ramda_Student("ȫ�浿", "����", 90),
			new Ramda_Student("�����", "����", 90),
			new Ramda_Student("���ڹ�", "����", 95),
			new Ramda_Student("���ѳ�", "����", 92)
			);
	
	//true�� �����°͸� ����� ����
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
		//�������
		double maleAvg = avg( t-> t.getSex().equals("����"));
		System.out.println("���� �������: " + maleAvg);
		//�������
		double femaleAvg = avg( t-> t.getSex().equals("����"));
		System.out.println("���� �������: " + femaleAvg);
	}

}
