import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("급여를 입력 : ");
		int pay = scn.nextInt();
		
		int money = 50000;
		for(int i=	1;i<=10;i++) {
			System.out.print(money + ":");
			int mok = pay/money;
			System.out.println(mok);
			pay=pay%money;
			if(i%2==1) {
				money=money/5;
				
			}else {
				money=money/2;
			}
		}

	}

}
