package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 26.
 * @Description : DB 연동 - Person Table : UPDATE
 */

public class Ex03 {
	public static void main(String[] args) {

		Connection conn = null;
		Scanner sc = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		// 데이터베이스 연결
		try {
			// 클래스 1번
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		}

		// 연결관리 객체 Connection 객체 생성
		try {

			// 클래스 2번
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "java";
			String pass = "1234";

			conn = DriverManager.getConnection(url, id, pass);

		} catch (SQLException e) {

			e.printStackTrace();

		}

		// 작업관리 - PreparedStatement , 결과처리 - ResultSet / int , 종료 - 각각의 close()
		try {

			sc = new Scanner(System.in);
			System.out.print("번호 : ");
			int bunho = sc.nextInt();

			String sql = "SELECT * FROM person where bunho = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bunho);

			rs = ps.executeQuery();
			if (rs.next()) {

				System.out.println(rs.getInt("bunho") + "\t" + rs.getString("name") + "\t" + rs.getFloat("ki"));
				System.out.print("키 수정 : ");
				float ki = sc.nextFloat();

				String sqlUp = "update person set ki=? where bunho=?";
				if(ps!=null) ps.close();
				ps = conn.prepareStatement(sqlUp);
				ps.setFloat(1, ki);
				ps.setInt(2, bunho);

				int check = ps.executeUpdate();
				if (check > 0) {
					System.out.println(check + " : Update Success");
				} else
					System.out.println(check + " : Update Fail");

			} else {

				System.out.println("해당 번호가 존재하지 않습니다.");

			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			try {

				if (conn != null)
					conn.close();

				if (sc != null)
					sc.close();
				
				if (ps != null)
					ps.close();

				if (rs != null)
					rs.close();

			} catch (SQLException e) {

				e.printStackTrace();

			}
		}
	}
}