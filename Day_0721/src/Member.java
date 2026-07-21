import java.util.Scanner;

public class Member {
	//멤버변수
	String name;
	String id;
	String pass;
	String phone;
	
	public Member() {}
	
	public Member(String name, String id, String pass, String phone) {
		this.name=name;
		this.id=id;
		this.pass=pass;
		this.phone=phone;
	}
	
	
	//회원가입
	boolean memberRegister() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n[회원가입 정보를 입력하시오.]");
		
		System.out.print("이름 : ");
		this.name=sc.nextLine();
		
		System.out.print("아이디 : ");
		return true;
	}
	//로그인
	boolean memberLogin(String id, String pass) {
		
		return true;
	}
	
	//로그아웃
	String memberLogout() {
		//이름, 아이디, 비번, 전화 삭제
		return "로그아웃 되었습니다.";
	}
	
}
