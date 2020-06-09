package thread08.Synchronized;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 21.
 * @Description : Synchronized
 */

public class UseEx {
	public static void main(String[] args) {
		
		Toilet toilet = new Toilet();
		
		Family father = new Family(toilet);
		father.setName("아빠");
		father.start();
		
		Family mother = new Family(toilet);
		mother.setName("엄마");
		mother.start();
		
		Family sister = new Family(toilet);
		sister.setName("언니");
		sister.start();
		
		Family brother = new Family(toilet);
		brother.setName("오빠");
		brother.start();
		
		Family me = new Family(toilet);
		me.setName("나");
		me.start();
	}
}