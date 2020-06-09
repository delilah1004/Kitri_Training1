package api05.Math;

import java.util.Arrays;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 13.
 * @Description : 
 */

public class RandomEx {
	public static void main(String[] args) {
		System.out.println("20의 절대값 : " + Math.abs(-10));
		System.out.println("비교 최대값 : " + Math.max(10, 30));
		System.out.println("비교 최소값 : " + Math.min(1.5, 1.3));
		System.out.println("2의 3승 : " + Math.pow(2, 3));
		
		double ran = Math.random();
		System.out.println(ran);
		
		int r = (int) Math.random()*10;
		System.out.println("0~1 : " + r);
		
		String[] array = new String[] {"김이름", "지이름", "최이름", "장이름", "임이름", "유이름", "박이름", "진이름"};
		
		int index = (int) (Math.random()*array.length);
		System.out.println("사다리 : " + array[index]);
		
		int num = (int) (Math.random()*6)+1;
		System.out.println("주사위 : " + num);
		
		// 1~45  6
		int[] selectNum = new int[6];
		for(int i = 0; i < selectNum.length; i++) {
			selectNum[i] = (int) (Math.random()*45)+1;
		}
		for(int i = 0; i < selectNum.length; i++) {
			System.out.println(selectNum[i] + "\t");
		}
		
		Arrays.sort(selectNum);
		System.out.println(Arrays.toString(selectNum));
		
		
	}
}