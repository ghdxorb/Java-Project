import java.util.Scanner;

public class Exam_02 {
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
		switch(na) {
			case 10:
				con="A";
				break;
			case 11:
				con="B";
				break;
			case 12:
				con="C";
				break;
			case 13:
				con="D";
				break;
			case 14:
				con="E";
				break;
			case 15:
				con="F";
				break;
			default:
				con = na +"";
				break;
		}

		System.out.println("10진수 : " + num);
		System.out.println("16진수 : " + con);
	}
}