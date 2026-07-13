import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("1~15 사이의 정수를 입력하세요 : ");
		
		int num = scn.nextInt();
		
		if(num<1|| num>15) {
			System.out.printf("입력오류");
			System.exit(num);
		}
		
		int mok = num / 16;
		int na = num % 16;
		
		String con="";
		if(na == 10) {
			con = "A";
		}else if(na==11) {
			con = "B";
		}else if(na==12) {
			con = "C";
		}else if(na==13) {
			con = "D";
		}else if(na==14) {
			con = "E";
		}else if(na==15) {
			con = "F";
		}else {
			con = na+"";//문자열 정수로 Integer.parseInt("1")
		}
		System.out.println("10진수 : " + num);
		System.out.println("16진수 : " + con);
	}
}