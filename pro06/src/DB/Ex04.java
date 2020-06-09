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
 * @Description : DB 연동 - Person Table : DELETE
 */

public class Ex04 {
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Scanner sc = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		}

		try {

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "java";
			String pass = "1234";

			conn = DriverManager.getConnection(url, id, pass);

		} catch (SQLException e) {

			e.printStackTrace();

		}

		try {

			sc = new Scanner(System.in);
			System.out.print("번호 : ");
			int bunho = sc.nextInt();

			String sql = "SELECT * FROM person where bunho = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bunho);

			rs = ps.executeQuery();
			if (rs.next()) {
				System.out.print("정말로 삭제하시겠습니까? (Yes) : ");
				String value = sc.next();

				if (value.equalsIgnoreCase("yes")) {
					String sqlDel = "delete from person where bunho=?";

					if (ps != null)
						ps.close();
					ps = conn.prepareStatement(sqlDel);
					ps.setInt(1, bunho);

					int check = ps.executeUpdate();
					if (check > 0)
						System.out.println("삭제 완료");
					else
						System.out.println("삭제 실패");
				}

			} else {
				System.out.println("해당 번호가 존재하지 않습니다.");
			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			try {

				if (conn != null)
					conn.close();

				if (ps != null)
					ps.close();

				if (rs != null)
					rs.close();

				if (sc != null)
					sc.close();

			} catch (SQLException e) {

				e.printStackTrace();

			}
		}

	}
}