package api02.Class;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 12.
 * @Description :
 */

public class ActionMain {
	public static void main(String[] args) throws Exception {
		ReceiveAction r = new ReceiveAction();
		r.execute();

		SendAction s = new SendAction();
		s.execute();

		Action action = new ReceiveAction();
		action.execute();

		action = new SendAction();
		action.execute();

		System.out.println("------------------");

		Class<?> clazz = Class.forName("api02.Class.ReceiveAction");
		ReceiveAction obj = (ReceiveAction) clazz.getDeclaredConstructor().newInstance();
		obj.execute();

		String[] classArray = new String[] { "api02.Class.ReceiveAction", "api02.Class.SendAction" };
		for (int i = 0; i < classArray.length; i++) {
			Class<?> cls = Class.forName(classArray[i]);
			Action ac = (Action) cls.getDeclaredConstructor().newInstance();
			ac.execute();
		}
	}
}