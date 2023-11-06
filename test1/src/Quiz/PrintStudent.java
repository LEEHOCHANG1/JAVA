package Quiz;

import java.util.Scanner;

public class PrintStudent {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student[] stu = new Student[4];

        while (true) {
            System.out.println("메뉴");
            System.out.println("3. 출력");
            int choice = s.nextInt();

            if (choice == 3) {
                printStudents(stu);
            }
        }
    }

    public static void printStudents(Student[] stu) {
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