import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("n값을 입력하세요");
		int n = scn.nextInt();
		int oddsum = 0;
		
		for(int i = 1; i<=n; i++) {
			System.out.printf(i+" ");
			
			if(i%10==0) {
				System.out.println();
			}
			if(i%2==1) {
				oddsum += i;
			}
		}
		if(n%10!=0) {
			System.out.println();
		}
		System.out.print("1부터 " + n + "까지의 홀수의 합"+ oddsum);
	}

}
