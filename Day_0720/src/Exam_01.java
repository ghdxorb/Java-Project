
public class Exam_01 {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int cnt = 0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0; j<a.length-1; j++) {
				cnt++;
				a[i][j]=cnt;
				a[i][4]+=cnt;
				a[4][j]+=cnt;
				a[4][4]+=cnt;
			}
		}
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.println();
				
			}
		
		}
		
		for(int i=0;i<a.length;i++) {
			a[i][4]=a[i][3]+a[i][2]+a[i][1]+a[i][0];
		}
		System.out.println();
		for(int j=0;j<a.length;j++) {
			a[4][j]=a[1][j]+a[2][j]+a[3][j]+a[0][j];
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.print("\n");
		}

	}

}
