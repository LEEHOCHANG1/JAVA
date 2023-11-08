package Quiz;

import java.util.Scanner;

public class PrintStudents {

	public static void printStudents(Student[]stu) {
		int leng = 0;
		for (int i=0;i<stu.length;i++) {
			if (stu[i] != null) {
				leng++;
			}
		}
		Scanner s = new Scanner(System.in);
		System.out.println("┏━━━━━━━┳━━━━━━━┳━━━━━━━┳━━━━━━━┳━━━━━━━┳━━━━━━━┓");
		System.out.println("┃" + "이름" + "\t┃" + "국어" + "\t┃" + "영어" + "\t┃" + "수학" + "\t┃" + "총점" + "\t┃" + "평균" + "\t┃");
		System.out.println("┣━━━━━━━╋━━━━━━━╋━━━━━━━╋━━━━━━━╋━━━━━━━╋━━━━━━━┫");
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null) {
				System.out.println("┃" + stu[i].getName() + "\t┃" + stu[i].getKor() + "\t┃" + stu[i].getEng()
						+ "\t┃" + stu[i].getMath() + "\t┃" + stu[i].AllScores() + "\t┃" + String.format("%.2f", stu[i].Average()) + '\t' + "┃");
				if (i < leng-1) {
					System.out.println("┣━━━━━━━╋━━━━━━━╋━━━━━━━╋━━━━━━━╋━━━━━━━╋━━━━━━━┫");
				}
				else if (i == leng-1) {
					System.out.print("");
				}
			}
		}
		System.out.println("┗━━━━━━━┻━━━━━━━┻━━━━━━━┻━━━━━━━┻━━━━━━━┻━━━━━━━┛");
	}
}