package Quiz;

import java.util.Scanner;

public class Student2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("학생 수 : ");
		int num = s.nextInt();
		
		Student[] students = new Student[num];
		
		for(int i = 0; i<num; i++) {
			System.out.println("학생" + (i+1));
			System.out.print("이름 : ");
			String name = s.next();
			System.out.print("국어 점수 : ");
			int Kor = s.nextInt();
			System.out.print("영어 점수 : ");
			int Eng = s.nextInt();
			System.out.print("수학 점수 : ");
			int Math = s.nextInt();
			
			students[i] = new Student(name, Kor, Eng, Math);
        }
			
		for (int i = 0; i < num; i++) {
            Student student = students[i];
            System.out.println(student.getName() + " 국어 " + student.getKor() + " 영어 "
            						+ student.getEng() + " 수학 " + student.getMath());
		}
		
		s.close();

	}

}
