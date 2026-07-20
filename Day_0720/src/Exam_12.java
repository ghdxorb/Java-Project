class Hakseng{
	Hakseng(){}
	Hakseng(int bun, String name,int kor,int eng,int mat);
	int kor;
	int eng;
	int mat;
	
	this.bun=bun;
	this.name=name;
	this.kor=kor;
	this.eng=eng;
	this.mat=mat;
	
	void totAve() {
		tot = kor + eng + mat;
		ave = tot/3.;
	}

	void hakSengPrint() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
	}

}
public class Exam_12 {
	public static void main(String[] args) {
		HakSeng h1 = new HakSeng();
		h1.bun=1101;
		h1.name="김학생";
		h1.kor=90;
		h1.eng=88;
		h1.mat=85;
		h1.totAve();
		h1.hakSengPrint();
		
		HakSeng h2 = new HakSeng(1103,"이학생",97,66,88);
		h2.totAve();
		h2.hakSengPrint();
	}

}
