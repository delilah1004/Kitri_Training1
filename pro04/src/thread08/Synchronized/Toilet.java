package thread08.Synchronized;

public class Toilet {
	
	public void openDoor(String name) {
		
		synchronized (this) {
			
			System.out.println(name + " 화장실 들어감");

			for (long i = 0; i < 100; i++) {
				if (i == 10)
					System.out.println(name + " 화장실 사용 중~");
			}
			
			System.out.println(name + " 화장실 이용 끝\n");
			
		}
		
	}
	
}