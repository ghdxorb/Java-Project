
public class Student {
	int hakbun;//학번
	String name;//이름
	int kor;//국어
	int eng;//영어
	int mat;//수학
	int tot;//총점
	double ave;//평균
	
	Student(){}
	
	Student(int hakbun, String name, int kor, int eng, int mat){
		this.hakbun = hakbun;
		this.name = name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	//총점, 평균, 학점을 구하는 메소드 구현
	void calculate() {
		this.tot = this.kor + this.eng + this.mat;
		this.ave = this.tot/3.0;
	}
	//학점을 구하여 변환하는 메소드
	String getGrade() {
		if(this.ave>=90) {
			return "A";
		}else if(this.ave>=80) {
			return "B";
		}else if(this.ave>=70) {
			return "C";
		}else if(this.ave>=60) {
			return "D";
		}else {
			return "F";
		}
	}
}
