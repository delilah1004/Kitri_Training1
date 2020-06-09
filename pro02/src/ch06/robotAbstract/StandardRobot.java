package ch06.robotAbstract;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 8.
 * @Description : 구현 클래스 - 로봇(StandardRobot)
 */

public class StandardRobot extends Robot {
	
	public StandardRobot() { }
	
	public StandardRobot(String kind) {
		super.kind = kind;
	}

	@Override
	protected void actionFly() {
		System.out.println("날 수 있습니다.");
	}

	@Override
	protected void actionMissile() {
		System.out.println("미사일을 쏠 수 있습니다.");
	}

	@Override
	protected void actionKnife() {
		System.out.println("목검을 가지고 있습니다.");
	}
}
