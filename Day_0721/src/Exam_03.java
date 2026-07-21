//키보드로 학번, 이름, 국어, 영어, 수학 입력
/*	학생체계(Student) 생성 후 출력
 * 
 */

import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		//키보드 입력(학생 객체 생성)
		Scanner scn = new Scanner(System.in);
		System.out.print("학번 입력 : ");
		int hakbun = scn.nextInt();
		System.out.print("이름 입력 : ");
		String name = scn.next();
		System.out.print("국어 점수 : ");
		int kor = scn.nextInt();
		System.out.print("영어 점수 : ");
		int eng = scn.nextInt();
		System.out.print("수학 점수 : ");
		int mat = scn.nextInt();
		
		Student stu = new Student(hakbun, name, kor, eng, mat);
		stu.calculate();
		
		System.out.println("\n===================================");
		//총점, 평균을 구하여 다음과 같이 출력
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
			stu.hakbun, stu.name, stu.kor, stu.eng, stu.mat, stu.tot, stu.ave);
		
		System.out.println("------------------------------------");
		//학번		이름		국어		영어		수학		총점		평균
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
			stu.hakbun, stu.name, stu.kor, stu.eng, stu.mat, stu.tot, stu.ave);
		
		scn.close();
		
		//학점을 구하여 출력(A,B,C,D,F)
		//학번		이름		국어		영어		수학		총점		평균

	}

}
