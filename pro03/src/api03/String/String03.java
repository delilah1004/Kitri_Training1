package api03.String;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 13.
 * @Description : 
 * 
 * String(byte[] byte)
 */

public class String03 {

	public static void main(String[] args) throws Exception {
		String str = "안녕하세요";
		byte[] array = str.getBytes();		// 인코딩
		
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
		
		String value = new String(array);
		System.out.println(value);
		
		// charset 있는 경우
		String string = "반가워요";
		byte[] byArr = string.getBytes("utf-8");		// euc-kr, iso-8859-1
		String byStr = new String(byArr, "utf-8");
		System.out.println(byStr);
		
		
	}
}