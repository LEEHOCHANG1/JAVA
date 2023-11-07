package Quiz;

import java.util.Scanner;

public class FindStudents {

	public static void findStudents(Student[]stu) {
		Scanner s = new Scanner(System.in);

		System.out.println("누구를 검색하시겠습니까?");

		String Student = s.next();

		boolean found = false;

		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null && stu[i].getName().equals(Student)) {
				System.out.println("이름" +'\t'+ "국어" +'\t'+ "영어" +'\t'+ "수학" +'\t'+ "총점" +'\t'+ "평균");
				System.out.println("----------------------------------------------");
				System.out.println(stu[i].getName() + '\t' + stu[i].getKor() + '\t' + stu[i].getEng()
						+ '\t' + stu[i].getMath() + '\t' + stu[i].AllScores() + '\t' + String.format("%.2f", stu[i].Average()));
				found = true;
			}
		}

		if (!found) {
			System.out.println("입력하신 학생을 찾을 수 없습니다.");

		}
	}
}
