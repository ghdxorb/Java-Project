import java.util.Arrays;

public class Exam_01 {
	public static void main(String[] args) {
		int score[] = {90,60,80,70,55,88,77,65};
		
		//선택정렬(오름차순)
		System.out.println("--------선택정렬(오름차순)---------");
		int a[] = score.clone();
		
		for(int i=0;i<a.length-1;i++) {
			for(int b=i+1;b<a.length;b++) {
				if(a[i]>a[b]) {
					int imsi = a[i];
					a[i] = a[b];
					a[b] = imsi;
				}
				
			}
		}
		
		System.out.println("정렬 전 : " + Arrays.toString(score));
		System.out.println("정렬 후 : " + Arrays.toString(a));
	
		//버블정렬(내림차순)
		System.out.println("--------버블정렬(내림차순)---------");
		int test[] = score.clone();
		
		for(int i=0;i<test.length-1;i++) {
			for(int j=0;j<test.length-i-1;j++) {
				if(test[j]<test[j+1]) {
					int imsi = test[j];
					test[j] = test[j+1];
					test[j+1] = imsi;
				}
			}
		}
		System.out.println("정렬 전 : " + Arrays.toString(score));
		System.out.println("정렬 후 : " + Arrays.toString(test));
	}
	

}
