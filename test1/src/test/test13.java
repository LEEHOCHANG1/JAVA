package test;

import java.util.Scanner;

public class test13 {

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double min(double a, double b) {
        return a - b;
    }

    public static double ab(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
    }

    public static double ac(double a, double b) {
        return a * b;
    }

    public static double ad(double a, double b) {
            return a % b;
 
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueChoice = 'y';

        while (continueChoice == 'y' || continueChoice == 'Y') {
            System.out.print("숫자 두 개를 입력하세요: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            System.out.print("연산자를 입력하세요 (+, -, *, /, %): ");
            char c = scanner.next().charAt(0);
 
            double result = 0;

            switch (c) {
                case '+':
                    result = sum(a, b);
                    System.out.printf("%.2f + %.2f = %.2f%n", a, b, result);
                    break;
                case '-':
                    result = min(a, b);
                    System.out.printf("%.2f - %.2f = %.2f%n", a, b, result);
                    break;
                case '*':
                    result = ac(a, b);
                    System.out.printf("%.2f * %.2f = %.2f%n", a, b, result);
                    break;
                case '/':
                    result = ab(a, b);
                    System.out.printf("%.2f / %.2f = %.2f%n", a, b, result);
                    break;
                case '%':
                    result = ad(a, b);
                    System.out.printf("%.2f %% %.2f = %.2f%n", a, b, result);
                    break;
            }

            System.out.print("계속 하시겠습니까? (y/n): ");
            continueChoice = scanner.next().charAt(0);
        }

        System.out.print("프로그램을 종료합니다.");
        scanner.close();
    }
}