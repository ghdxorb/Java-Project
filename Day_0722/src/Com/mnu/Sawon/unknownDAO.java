package Com.mnu.Sawon;

public class unknownDAO {
	//싱글톤 패턴
	private unknownDAO() {}
	
	//자신의 객체를 자신이 생성
	private static unknownDAO instance = new unknownDAO();
	public static unknownDAO getInstance() {
		return instance;
	}
	
	//1. 메소드 생성(객체 생성 후 반환)
	public SawonDTO getunknown(int sabun,String name, int gender,
			int grade, int time) {
		//Unknown unknown = new Unknown();
		//unknown.setSabun(sabun);
		SawonDTO unknown = new SawonDTO(sabun, name,gender,grade,time);
		return unknown;
		
	}
	//2. 성별을 구하여 반환하는 메소드
	
	
	
	//3. 주간급여를 계산 후 반환하는 메소드
	public int weekPayProcess(SawonDTO sa) {
		//등급에 따른 시급
		setWeekPay(sa);
		
		int pay = 0;//주간급여
		int overTime=0;//초과근무시간
		int baseTime=sa.getTime();// 28
		if(baseTime>50)
			baseTime=50;
		//초과근무시간
		if(baseTime>36) {
			overTime = baseTime-36;
			baseTime = 36;
		}
		return pay = baseTime * sa.getWeekPay() + (int)(overTime*sa.getWeekPay()*1.5);
		
		//return pay;
	}
	
	private void setWeekPay(SawonDTO sa) {
		sa.setweekPay = (2000);
		if(sa.getGrade()==1)
			sa.setweekPay = (10000);
		else if(sa.getGrade()==2)
			sa.setweekPay = (5000);	
	}
	private void setGender(SawonDTO sa) {
		sa.setGenderStr("여자");
		if(sa.getGender()==1||sa.getGender()==3)
			sa.setGenderStr("남자");
		
	}
}
