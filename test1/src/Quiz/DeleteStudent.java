package Quiz;

import java.util.Scanner;

public class DeleteStudent {
	public static void deleteStudent(Student[] stu) {
		Scanner s = new Scanner(System.in);
		char continueChoice = 'y';
		while (continueChoice == 'y' || continueChoice == 'Y') {          
			int count = 0;
			for (int i = 0; i < stu.length; i++) {
				if (stu[i] != null) {
					System.out.println("[" + (count + 1) + "] " + stu[i].getName());
					count++;
				}
			}

			for(int i = 0; i < stu.length; i++) {
				if (stu[i] != null) {
					System.out.println("[" + (count + 1) + "] 전체삭제");
					break;

				}		
			}

			if (count == 0) {
				System.out.println("삭제할 학생이 없습니다.");
			} 

			else {
				System.out.println("[" + (count + 2) + "] 돌아가기");
				int input = s.nextInt();
				if (input == count + 1) {
					System.out.print("정말 삭제하시겠습니까? (y/n) : ");
					char RealChoice = s.next().charAt(0);
					if (RealChoice != 'y' && RealChoice != 'Y') {
						break;
					}

					for(int i=0; i<stu.length; i++) {
						stu[i]=null;
					}
					break;
				}

				if (input >= 1 && input <= count) {
					int studentIndex = -1;
					for (int i = 0; i < stu.length; i++) {
						if (stu[i] != null) {
							if (input == 1) {
								studentIndex = i;
								break;
							}
							input--;
						}
					}

					if (studentIndex != -1) {
						String deletedStudentName = stu[studentIndex].getName();
						stu[studentIndex] = null;
						System.out.println(deletedStudentName + "학생이 삭제되었습니다.");
					}

				}
				while(true) {
					System.out.print("계속 삭제하시겠습니까? (y/n) : ");
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
		}
	}
}
