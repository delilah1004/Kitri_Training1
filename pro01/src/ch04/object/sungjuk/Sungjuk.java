package ch04.object.sungjuk;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 29.
 * @Description : 구현 클래스 - 성적 계산
 */

public class Sungjuk {
	public String name;	// 이름
	public int kor;			// 국어 성적
	public int eng;			// 영어 성적
	public int mat;			// 수학 성적
	
	public int tot;			// 성적 총점
	public float avg;		// 성적 평균
	public char hak ;		// 학점
	
	public void input(String n, int a, int b, int c) {
		name = n;
		kor = a;
		eng = b;
		mat = c;
	}
	
	public void total() {
		tot = kor + eng + mat;
	}
	
	public void average() {
		avg = (float) tot/3;
	}
	
	public void grade() {
		if(avg >= 90) {
			hak = 'A';
		} else if(avg >= 80) {
			hak = 'B';
		} else if(avg >= 70) {
			hak = 'C';
		} else {
			hak = 'F';
		}
	}
	
	public void disp() {
		System.out.println(name);
		System.out.println("국어 : " + kor + " \t 영어 : " + eng + " \t 수학 : " + mat);
		System.out.println("총점 : " + tot + " \t 평균 : " + avg + "\t 학점 : " + hak + "\n");
	}
	
}
