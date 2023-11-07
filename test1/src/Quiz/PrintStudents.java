package Quiz;

import java.util.Scanner;

public class PrintStudents {

	public static void printStudents(Student[]stu) {
		Scanner s = new Scanner(System.in);
		System.out.println("이름" +'\t'+ "국어" +'\t'+ "영어" +'\t'+ "수학" +'\t'+ "총점" +'\t'+ "평균");
		System.out.println("--------------------------------------------");
		for (Student student : stu) {
			if (student != null) {
				System.out.println(student.getName() +'\t' + student.getKor()  +'\t' + student.getEng()
				+'\t'+ student.getMath()  +'\t' + student.AllScores() +'\t' + String.format("%.2f", student.Average()));
			}
		}
	}
}
