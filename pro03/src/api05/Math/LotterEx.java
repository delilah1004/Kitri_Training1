package api05.Math;

import java.util.Arrays;

public class LotterEx {

	public static void main(String[] args) {
		while(true) {
			int[] selectNum = new int[6];
			for(int i = 0; i < selectNum.length; i++) {
				selectNum[i] = (int) (Math.random()*45)+1;
			}
			
			int[] machineNum = new int[6];
			for(int i = 0; i < machineNum.length; i++) {
				machineNum[i] = (int) (Math.random()*45)+1;
			}
			
			boolean result = Arrays.equals(selectNum, machineNum);
			
			if(result) {
				Arrays.sort(selectNum);
				System.out.println("편의점 방문 : " + Arrays.toString(selectNum));
				break;
			}
		}

	}

}
