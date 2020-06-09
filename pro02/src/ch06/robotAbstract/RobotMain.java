package ch06.robotAbstract;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 8.
 * @Description : 실행 클래스 - 로봇
 * 
 * 시나리오
 * 1) 로봇모양은 팔, 다리, 머리, 몸통으로 구성되어 있다.
 * 2) 로봇은 기본적으로 걷고, 달릴 수 있어야 한다.
 * 3) 로봇 종류에 따라서 날 수 있고, 미사일을 쏘거나 검을 가질 수 있다.
 * 4) super 로봇은 날 수 있고, 미사일을 쏠 수 있으며, 레이저 검을 가지고 있다.
 * 5) standard 로봇은 날 수 없고, 미사일은 쏠 수 있으며, 목검을 가지고 있다.
 * 6) low 로봇은 날 수 없고, 미사일을 쏠 수 없으며, 검도 없다.
 */

public class RobotMain {
	public static void main(String[] args) {
		
		Robot[] robotArray = new Robot[3];
		robotArray[0] = new LowRobot("LowRobot");
		robotArray[1] = new StandardRobot("StandardRobot");
		robotArray[2] = new SuperRobot("SuperRobot");
		
		for(int i = 0; i < robotArray.length; i++) {
			robotArray[i].shape();
			robotArray[i].actionWalk();
			robotArray[i].actionRun();
			robotArray[i].actionFly();
			robotArray[i].actionMissile();
			robotArray[i].actionKnife();
			System.out.println();
		}
	}
}