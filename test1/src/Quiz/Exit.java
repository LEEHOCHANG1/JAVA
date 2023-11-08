package Quiz;

import java.util.Scanner;

public class Exit {

	public static void exit(Student[]stu) {

		Scanner s = new Scanner(System.in);
		char continueChoice = 'y';
		while (continueChoice == 'y' || continueChoice == 'Y') {
			while(true) {
				System.out.print("정말 종료하시겠습니까? (y/n) : ");
				continueChoice = s.next().charAt(0);
				if (continueChoice == 'y' || continueChoice == 'Y') {
					System.out.println("종료합니다.");
					System.exit(0);
					break;
				}
				else if (continueChoice == 'n' || continueChoice=='N') {
					break;
				}
				else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주십시요.");
				}
			}
		}
	}
}
