package Quiz;

import java.util.Scanner;

public class RemoveStudent {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student[] stu = new Student[4];

        while (true) {
            System.out.println("메뉴");
            System.out.println("2. 삭제");
            int choice = s.nextInt();

            if (choice == 2) {
                removeStudent(s, stu);
            }
        }
    }

    public static void removeStudent(Scanner s, Student[] stu) {
        System.out.println("삭제할 학생을 선택하세요:");
        for (int i = 0; i < stu.length; i++) {
            if (stu[i] != null) {
                System.out.println("[" + (i + 1) + "] " + stu[i].getName());
            }
        }
        System.out.println("[" + (stu.length + 1) + "] 돌아가기");
        int input = s.nextInt();

        if (input >= 1 && input <= stu.length) {
            stu[input - 1] = null;
            System.out.println("학생이 삭제되었습니다.");
        } else if (input == stu.length + 1) {
            return;
        } else {
            System.out.println("올바르지 않은 선택입니다.");
        }
    }
}