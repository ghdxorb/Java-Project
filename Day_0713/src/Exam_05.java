//1 ~ 10까지 정수 출력
public class Exam_05 {
	public static void main(String[] args) {
		int s=0;//1+2+3...+10
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			s=s+i;//s+=i;
		}
		System.out.println("1~10 합 : " + s);
		//1~ 10 홀수 출력 후 홀수 합
		
		int t=0;
		for(int i=1; i<=10;i+=2) {
			System.out.println(i);
			t += i;
			
		}
		System.out.println("1~10 홀수 합 : " + t);
		
		int a= 0;
		for(int i=0;i<=10;i+=2) {
			System.out.println(i);
			a += i;
		}
			System.out.println("1~10 짝수의 합 : " + a);
	}
	

}
