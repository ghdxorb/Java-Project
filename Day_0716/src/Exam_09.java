//키보드로 정수 연산자 정수를 입력하면 사칙연산(+,-,*,/,%)을 하는 프로그램

import java.util.Scanner;

public class Exam_09 {
	static void add(int a, int b) {
		System.out.println(a + "+" + b + "=" + (a+b));
	}
	static void sum(int k1, int k2) {
		int r = k1- k2;
		System.out.printf("%d - %d = %d\n",k1,k2,r);
	}
	static void mul(int b1, int b2) {
		int m = b1*b2;
		System.out.printf("%d * %d = %d\n",b1,b2,m);
	}
	static void div(int n1,int n2) {
		int nn = n1/n2;
		System.out.printf("%d / %d = %d\n",n1,n2,nn);
	}
	static void mod(int a1,int a2) {
		int aa = a1%a2;
		System.out.printf("%d %% %d = %d\n",a1,a2,aa);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 : ");
		int a = scn.nextInt();
		String op = scn.next();
		int b = scn.nextInt();
		
		if(op.equals("+")) {
			add(a,b);
		}else if(op.equals("-")) {
			sum(a,b);
		}else if(op.equals("*")) {
			mul(a,b);
		}else if(op.equals("/")) {
			div(a,b);
		}else if(op.equals("%")) {
			mod(a,b);
		}else {
			System.out.println("연산자 오류");
			
		}

	}

}
