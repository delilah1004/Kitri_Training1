package dbUtil;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 26.
 * @Description : 데이터 베이스 연결 클래스
 */

public class DriverProvider {

	public void getDriver() {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		} catch(ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}