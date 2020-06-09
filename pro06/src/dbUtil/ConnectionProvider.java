package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 26.
 * @Description : 연결을 관리하는 객체 생성
 */

public class ConnectionProvider {

	public static Connection getConnection() {
		
		Connection conn = null;

		try {

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "java";
			String pass = "1234";

			conn = DriverManager.getConnection(url, id, pass);

		} catch (SQLException e) {

			e.printStackTrace();

		}
		
		return conn;
	}
}