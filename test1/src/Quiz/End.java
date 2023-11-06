package Quiz;

import java.util.Scanner;

public class End {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student[] stu = new Student[4];

        System.out.println("4. 종료");
        int choice = s.nextInt();
        if (choice == 4) {
            System.out.println("프로그램을 종료합니다.");
            s.close();
        }
    }
}