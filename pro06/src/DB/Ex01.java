package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 25.
 * @Description : DB 연결 - Person Table : SELECT
 */

public class Ex01 {
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;

		// 1단계 : 데이터 베이스 연결
		try {

			String className = "oracle.jdbc.driver.OracleDriver";
			Class.forName(className);

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
			
		}

		// 2단계 : 연결을 관리하는 객체 생성
		try {

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "java";
			String pass = "1234";

			conn = DriverManager.getConnection(url, id, pass);

			// 3단계 : 작업관리 (Query)
			ps = conn.prepareStatement("SELECT * FROM dept");

			// 4단계 : 결과처리
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				int dNo = rs.getInt("deptno");
				String dName = rs.getString("dname");
				String loc = rs.getString("loc");

				System.out.println(dNo + "\t" + dName + "\t" + loc);
			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			try {
				// 5단계 : 종료
				if (ps != null)
					ps.close();

				if (conn != null)
					conn.close();

			} catch (Exception e) {

				e.printStackTrace();

			}
		}
	}
}