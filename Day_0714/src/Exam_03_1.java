import java.util.Scanner;

public class Exam_03_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("급여를 입력 : ");
		int pay = scn.nextInt();
		int money = 50000;
		System.out.printf("급여 : %7d\n ", pay);
		int sw = 1;
		
		while(pay != 0) {
			System.out.printf("%5d : ", money);
			int mok = pay/money;
			System.out.printf("%3d : ", mok);
			pay = pay % money;
			
			if(sw==1) {
				money = money/5;
				sw = 0;
			}else {
				money = money/2;
				sw = 1;
			}
		
		}
		
		
	}

}
