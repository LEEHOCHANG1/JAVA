package test;

import java.util.Scanner;

public class test19 {
	public static int Add(int a, int b) {
		return a + b;
	}
	public static int Sub(int a, int b) {
		return a - b;
	}
	public static int Mul(int a, int b) {
		return a * b;
	}
	public static double Div (int a, int b) {
		return a / b;
	}
	public static int Rem (int a, int b) {
		return a % b;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		

		while(true) {
			double c = 0;
			System.out.print("연산자를 입력하세요 (+-*/%) : ");
			String x = s.next();
			System.out.print("숫자를 입력하세요 : ");
			int a = s.nextInt();
			System.out.print(a + x);
			int b = s.nextInt();
				if(x.equals("+")) {
					c = Add(a, b);
				}
				if(x.equals("-")) {
					c = Sub(a, b);
				}
				if(x.equals("*")) {
					c = Mul(a, b);
				}
				if(x.equals("/")) {
					c = Div(a, b);
				}
				if(x.equals("%")) {
					c = Rem(a, b);
				}
			System.out.print(a + " " + x + " " + b + " = ");
				if((c / 1) > 0) {
					System.out.println(Math.round(c));
				}
				else {
					System.out.println(String.format("%.2f", c));
				}
				System.out.print("계속 하시겠습니까?(y/n) : ");
				String n = s.next();
				if(n.equals("y")) {
					continue;
				}
				if(n.equals("n")) {
					break;
				}
		}
		s.close();
	}
}
