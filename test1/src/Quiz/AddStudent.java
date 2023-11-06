package Quiz;

import java.util.Scanner;

public class AddStudent {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student[] stu = new Student[4];
        
        while (true) {
            System.out.println("메뉴");
            System.out.println("1. 입력");
            int choice = s.nextInt();

            if (choice == 1) {
                addStudent(s, stu);
            }
        }
    }

    public static void addStudent(Scanner s, Student[] stu) {
        boolean st = false;
        int i;

        for (i = 0; i < stu.length; i++) {
            if (stu[i] == null) {
                st = true;
                break;
            }
        }

        if (st) {
            System.out.print("학생 이름 : ");
            String name = s.next();
            System.out.print("국어 점수 : ");
            int kor = s.nextInt();
            System.out.print("영어 점수 : ");
            int eng = s.nextInt();
            System.out.print("수학 점수 : ");
            int math = s.nextInt();

            stu[i] = new Student(name, kor, eng, math);
        } else {
            System.out.println("더 이상 학생을 추가할 수 없습니다.");
        }
    }
}
