//키보드 이름, 국어, 영어, 수학, 과학 점수를 입력 총점, 평균을 구하여
// 최대 점수, 최소 점수를 출력
/*	입력 : 홍길동 90 80 70 60
 * 
 *  출력
 *  이름 : 
 *  총점 : 
 *  평균 :
 *  최대점수 :
 *  최소점수 :
 * 
 */

import java.util.Scanner;

public class Exam_14 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		String name = scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		int sec = scn.nextInt();
		
		//계산
		int tot = kor+eng+mat+sec;
		double ave = (int)(tot/4.*100+0.5)/100.;
		double ave1 = tot/4.;
		
		int max = kor;
		int min = kor;
		
		if(max < eng) {
			max = eng;
		}else if(min > eng) {
			max = eng;
		}
		if(max < mat) {
			max = mat;
		}else if(min > mat) {
			max = mat;
		}
		if(max < sec) {
			max = sec;
		}else if(min > sec) {
			max = sec;
		}
		//출력
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + ave);
		System.out.println("최대점수 : " + max);
		System.out.println("최소점수 : " + min);
	}

}
