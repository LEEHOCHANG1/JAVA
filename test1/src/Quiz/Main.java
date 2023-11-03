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

            if (Choice == 1) {
                AddStudent(s, stu);
            } else if (Choice == 2) {
                RemoveStudents(s, stu);
            } else if (Choice == 3) {
                PrintStudents(stu);
            } else if (Choice == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
        s.close();
    }

    public static void AddStudent(Scanner s, Student[] stu) {
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
            int Kor = s.nextInt();
            System.out.print("영어 점수 : ");
            int Eng = s.nextInt();
            System.out.print("수학 점수 : ");
            int Math = s.nextInt();

            stu[i] = new Student(name, Kor, Eng, Math);
        } else {
            System.out.println("더 이상 학생을 추가할 수 없습니다.");
        }
    }

    public static void RemoveStudents(Scanner s, Student[] stu) {
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

    public static void PrintStudents(Student[] stu) {
        for (Student student : stu) {
            if (student != null) {
                System.out.println("이름: " + student.getName() + " 국어 성적 : "
                        + student.getKor() + " 영어 성적 : " + student.getEng()
                        + " 수학 성적 " + student.getMath() + " 총점 : " + student.AllScores() + " 평균 : "
                        + String.format("%.2f", student.Average()));
            }
        }
    }
}