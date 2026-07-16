
public class Exam_08 {
	//1~10까지 정수 출력하는 메소드
	static void add() {
		int s =0;
		for(int i=0;i<=10;i++) {
			System.out.print(i+" ");
			s += i;
		}
		System.out.println("=" + s);
	}
	
	//1~N까지 정수 출력하는 메소드
		static void addN(int n) {
			int s =0;
			for(int i=0;i<=n;i++) {
				System.out.print(i+" ");
				s += i;
			}
			System.out.println("=" + s);
		}
		//1~N까지 정수합 변환
		static int addSum(int n) {
			int s =0;
			for(int i=0;i<=n;i++) {
				s += i;
			}
			return s;
		}
	public static void main(String[] args) {
		add();
		
		addN(50);
		
		System.out.println("1 ~ 20 합 : " + addSum(20));

	}

}
