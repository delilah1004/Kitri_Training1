package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 25.
 * @Description : DB 연결 - Person Table : INSERT
 */

public class Ex02 {
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		Scanner sc = null;

		try {
			// 1. 데이터 베이스 연결
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		}

		// 2. 연결을 관리하는 객체 생성
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "java";
			String pass = "1234";

			conn = DriverManager.getConnection(url, id, pass);

			sc = new Scanner(System.in);

			System.out.print("번호 : ");
			int bunho = sc.nextInt();

			System.out.print("이름 : ");
			String name = sc.next();

			System.out.print("키 : ");
			float ki = sc.nextFloat();

			// 3단계 : 작업관리 (Query)
			String sql = "insert into person values(?, ?, ?)"; // 동적 쿼리
			ps = conn.prepareStatement(sql);

			// 4단계 : 결과처리
			ps.setInt(1, bunho);
			ps.setString(2, name);
			ps.setFloat(3, ki);

			int check = ps.executeUpdate();
			// System.out.println(check);

			if (check > 0)
				System.out.println("데이터 추가 성공");

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			// 5단계 : 종료
			try {

				if (ps != null)
					ps.close();

				if (conn != null)
					conn.close();

				if (sc != null)
					sc.close();

			} catch (Exception e) {

				e.printStackTrace();

			}
		}
	}
}