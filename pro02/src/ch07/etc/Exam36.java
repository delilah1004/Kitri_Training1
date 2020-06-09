package ch07.etc;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 11.
 * @Description : 
 */

class Sungjuk {
	private String name;
	private int kor, eng, mat;
	
	public Sungjuk() { }
	
	public Sungjuk(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

	public void disp() {
		System.out.println(name + "\t" + kor + "\t"  + eng + "\t"  + mat);
	}
}

class SungjukTotal {
	private int tot;
	
	public void setTotal(Sungjuk sungjuk) {
		tot = sungjuk.getKor() + sungjuk.getEng() + sungjuk.getMat();
		
		sungjuk.disp();
		System.out.println("tot:" + tot);
	}
}

public class Exam36 {
	public static void main(String[] args) {
		Sungjuk hong = new Sungjuk("홍길동", 70, 70, 70);
		
		SungjukTotal s = new SungjukTotal();
		s.setTotal(hong);
		
		Sungjuk kim = new Sungjuk("김철수", 60, 60, 60);
		s.setTotal(kim);
	}
}