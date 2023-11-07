package Quiz;

import java.util.Scanner;

public class AddStudent {
	public static void addStudent(Student[] stu) {
		Scanner s = new Scanner(System.in);

		char continueChoice = 'y';
		while (continueChoice == 'y' || continueChoice == 'Y') {
			boolean st = false;
			int i;

			for (i = 0; i < stu.length; i++) {
				if (stu[i] == null) {
					st = true;
					break;
				}
			}

			if (st == true) {
				String name = null;
				boolean Name = false;
				while (!Name) {
					System.out.print("학생 이름 : ");
					name = s.next();
					if (name.length() >= 2) {
						Name = true;
					}
					else {
						System.out.println("이름은 2글자 이상이어야 합니다. 다시 입력하세요.");
					}
				}

				System.out.print("국어 점수: ");
				int kor = s.nextInt();
				System.out.print("영어 점수: ");
				int eng = s.nextInt();
				System.out.print("수학 점수: ");
				int math = s.nextInt();

				stu[i] = new Student(name, kor, eng, math);

				while(true) {
					System.out.print("계속 추가하시겠습니까? (y/n) : ");
					continueChoice = s.next().charAt(0);
					if (continueChoice == 'y' || continueChoice == 'Y') {
						break;
					}
					else if (continueChoice == 'n'||continueChoice=='N') {
						break;
					}
					else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주십시요.");
					}
				}
			} 
			else {
				System.out.println("더 이상 학생을 추가할 수 없습니다.");
				break;
			}
			if(continueChoice == 'n'||continueChoice=='N') {	        	
				break;
			}
		}

	}
}