package test;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 6.
 * @Description : 
 */

public class Practice {
	public static void main(String[] args)  {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int[] answer = new int[50];
		
		int count = 0;

		for (int[] a : commands) {
			int start = a[0] - 1;
			int finish = a[1];
			
			int[] temp = new int[finish - start];

			for (int i = start, index = 0; i < finish; i++, index++) {
				temp[index] = array[i];
			}
			
			answer[count] = sort(temp, a[2]);
			count++;
		}
		System.out.println(answer[0]);
	}
	
	public static int sort(int[] temp, int k) {
		for(int i = 1; i < temp.length; i++) {
			int standard = temp[i];
			int aux = i - 1;
			
			while(aux >= 0 && standard < temp[aux]) {
				temp[aux + 1] = temp[aux];
				aux--;
			}
			temp[aux + 1] = standard;			
		}
		
		return temp[k - 1];
	}
}




