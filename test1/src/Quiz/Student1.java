package Quiz;

public class Student1 {

	public static void main(String[] args) {
		
		Student s1 = new Student("홍길동", 85, 75, 65);
		Student s2 = new Student("김길동", 80, 65, 90);
		Student s3 = new Student("이길동", 95, 85, 100);
		
		System.out.println(s1.getName() + " " + "국어" + " " + s1.getKor() + " " + "영어" 
							+ " " + s1.getEng() + " " + "수학" + " " + s1.getMath());
		
		System.out.println(s2.getName() + " " + "국어" + " " + s2.getKor() + " " + "영어"
							+ " " + s2.getEng() + " " + "수학" + " " + s2.getMath());
		
		System.out.println(s3.getName() + " " + "국어" + " " + s3.getKor() + " " + "영어"
							+ " " + s3.getEng() + " " + "수학" + " " + s3.getMath());
		
	}
}