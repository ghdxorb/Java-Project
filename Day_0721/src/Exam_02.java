//로그인 구현, 로그아웃
public class Exam_02 {
	public static void main(String[] args) {
		Member m2 = new Member("이사람","user","1234","010-1234-5678");
		
		//키보드 입력
		String id="user";
		String pass="4321";
		boolean bool = m2.memberLogin(id, pass);
		if(bool) {
			//로그인 성공
		}else {
			//아이디 또는 비밀번호가 오류입니다.
		}
		//로그아웃(회원 탈퇴)
		if(bool) {
			String str = m2.memberLogout();
			System.out.println(str);
		}
		//다시 로그인
		boolean bool = m2.memberLogin(id, pass);
		if(bool) {
			//로그인 성공
			System.out.print(bool);
		}else {
			//아이디 또는 비밀번호가 오류입니다.
		}
		/*
		id="user";
		pass="1234";
		bool = m2.memberLogin(id, pass);
		if(bool) {
			//로그인 성공
		}else {
			//아이디 또는 비밀번호가 오류입니다.
		}
*/
	}

}
