package api02.Class;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 12.
 * @Description : Class 클래스 : 동적객체 생성시 사용, 클래스이름, 필드정보, 메소드정보, 생성자정보
 */

public class CarMain {
	public static void main(String[] args) throws Exception {
		Car car = new Car("미니쿠퍼", "이다은");
		System.out.println(car.toString());
		
		Class<?> a = car.getClass();
		System.out.println(a.getName());		// 풀패키지명
		System.out.println(a.getSimpleName());		// 클래스명
		System.out.println(a.getPackageName());		// 패키지명
		
		Car c = new Car();
		c.setModel("산타페");
		c.setOwner("도토리");
		System.out.println(c.getModel() + "\t" + c.getOwner());
		
		// 동적 객체 생성 = 풀 패키지명이 문자열로 넘어온다.
		
		String str = "api02.Class.Car";
		Class<?> cls = Class.forName(str);
		Car obj = (Car) cls.getDeclaredConstructor().newInstance();
		
		obj.setModel("아반떼");
		obj.setModel("세반");
		System.out.println(obj.toString());
		
	}
}