package Quiz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Main m = new Main();
		Student[] stu = new Student[4];

		while (true) {
			System.out.println("학생정보입력 (이호창)");
			System.out.println("메뉴");
			System.out.println("1. 입력");
			System.out.println("2. 삭제");
			System.out.println("3. 출력");
			System.out.println("4. 파일출력");
			System.out.println("5. 검색");
			System.out.println("6. 종료");
			int choice = s.nextInt();
			if (choice == 1) {
				AddStudent.addStudent(stu);
			}

			else if (choice == 2) {
				DeleteStudent.deleteStudent(stu);
			}

			else if (choice == 3) {
				PrintStudents.printStudents(stu);;
			}

			else if (choice == 4) {
				FilePrint.filePrint(stu);
			}

			else if (choice == 5) {
				FindStudents.findStudents(stu);
			}

			else if (choice == 6) {
				Exit.exit(stu);
			}

			else {
				System.out.println("올바르지 않은 선택입니다.");
			}
		}
	}
}