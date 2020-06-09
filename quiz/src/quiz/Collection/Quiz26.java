package quiz.Collection;

import java.text.DecimalFormat;
import java.util.ArrayList;

class Sung {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private float avg;
	
	public Sung(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public void total() {
		tot = kor+eng+mat;
	}
	
	public void average() {
		avg = (float) tot/3;
	}
	
	public void disp() {
		DecimalFormat d = new DecimalFormat("0.0");
		
		System.out.print(name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + d.format(avg));
	}
	
	public static void title() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
	}
}

public class Quiz26 {
	public static void main(String[] args) {
		Sung a = new Sung("홍길동", 100, 70, 80);
		Sung b = new Sung("이순신", 88, 77, 66);
		Sung c = new Sung("강감찬", 70, 80, 70);
		
		ArrayList<Sung> array = new ArrayList<Sung>();
		array.add(a);
		array.add(b);
		array.add(c);
		
		Sung.title();
		for(int i = 0; i < array.size(); i++) {
			array.get(i).total();
			array.get(i).average();
			array.get(i).disp();
			System.out.println();
		}
	}
}