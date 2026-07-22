package Com.mnu.unknown;

import java.util.Scanner;

public class unknownExam {

	public static void main(String[] args) {
		//키보드 입력(사원정보)
		Scanner scn = new Scanner(System.in);
		System.out.print("사원등록:");
		int sabun = scn.nextInt();//사번
		String name = scn.next();//이름
		int gender = scn.nextInt();//성별
		int grade = scn.nextInt();//사원등급
		int time = scn.nextInt();//근무시간
		
		unknownDAO dao = unknownDAO.getInstance();
		
		unknown unknown = dao.getunknown(sabun, name, gender, grade, time);
		
		dao.weekPayProcess(unknown);
		
	
		//주간급여
		int weekPay = 2000;
		if(unknown.getGrade()==1)
			weekPay = 10000;
		else if(unknown.getGrade()==2)
			weekPay = 5000;
		
		int weekMoney = dao.weekPayProcess(unknown,weekPay);
	
		
		//출력
		//성별 계산
		String genderStr="여자";
		if(unknown.getGender()==1 || unknown.getGender()==3)
			genderStr = "남자";
		
		
		System.out.println("사원번호\t이름\t성별\t등급\t"
						+"시급\t근무시간\t주간급여");
		System.out.print(unknown.getSabun() + "\t");
		System.out.print(unknown.getName() + "\t");
		System.out.print(unknown.getGender() + "\t");
		System.out.print(unknown.getGrade() + "\t");
		System.out.print(weekPay + "\t");
		System.out.print(unknown.getTime() + "\t");
		System.out.print(weekMoney + "\n");
	}

}
