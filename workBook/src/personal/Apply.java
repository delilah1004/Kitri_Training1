package personal;

public class Apply {
	public static void main(String[] args) {
		String love = "사랑해";
		byte[] blove = love.getBytes();
		
		for(int j = 0; j < blove.length; j++) {
			System.out.print(blove[j] + " ");
		}
		System.out.println();
		
		byte[] loves = {-20, -126, -84, -21, -98, -111, -19, -107, -76};
		String luv = new String(loves);
		
		System.out.println(luv.toString());
	}
}