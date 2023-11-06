package Quiz;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student[] stu = new Student[4];

        while (true) {
            System.out.println("메뉴");
            System.out.println("1. 입력");
            System.out.println("2. 삭제");
            System.out.println("3. 출력");
            System.out.println("4. 종료");
            int Choice = s.nextInt();
        }
    }
}