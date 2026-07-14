
public class Exam_05 {
	public static void main(String[] args) {
		int n = 5;
		int num = 1;
		
		
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("    ");
			}
			for(int j = 1;j<=i;j++) {
				System.out.printf("%4d",num);
				num++;
			}
			System.out.println();
		}
	}

}
