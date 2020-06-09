package quiz.Class2;

import java.util.Scanner;

class SungJuk {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private float avg;
	private Scanner sc;
	private static int banTot;
	private static float banAvg;
	private static int inwon;

	public SungJuk() {
		sc = new Scanner(System.in);
		if (inwon == 0) {
			System.out.print("인원수 입력:");
			inwon = sc.nextInt();
		}
		System.out.print("이름:");
		name = sc.next();
		System.out.print("국어:");
		kor = sc.nextInt();
		System.out.print("영어:");
		eng = sc.nextInt();
		System.out.print("수학:");
		mat = sc.nextInt();
		System.out.println();
	}

	public void total() {
		tot = kor + eng + mat;
	}

	public void average() {
		avg = (float) tot / 3;
	}

	public void banTotal() {
		banTot += tot;
	}

	public void banAverage() {
		banAvg = (banTot / 3) / inwon;
	}

	public void disp() {
		total();
		average();
		banTotal();
		banAverage();
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg);
	}

	public static void title() {
		System.out.println("이름" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균");
	}

	public static void banDisp() {
		System.out.println("=========================");
		System.out.println("반총점:" + banTot + "\t" + "반평균:" + banAvg + "\t" + "인원수:" + inwon);
	}
}

public class Quiz30 {
	public static void main(String[] args) {
		SungJuk kim = new SungJuk();		
		SungJuk park = new SungJuk();

		SungJuk.title();
		kim.disp();
		park.disp();
		
		SungJuk.banDisp();
	}
}