package Bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import dbUtil.ConnectionProvider;
import dbUtil.JdbcUtil;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 26.
 * @Description : MVC - DB 연동
 * 
 *              Dao(Controller)
 */

public class AccountDao {

	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	private String sql = null;
	private Scanner sc = null;

	private AccountDto dto = null;

	public void makeAccount() {	// 1. 계좌 개설
		
		dto = new AccountDto();
		sc = new Scanner(System.in);

		System.out.print("계좌번호를 입력하세요. : ");
		dto.setId(sc.next());

		System.out.print("이름을 입력하세요. : ");
		dto.setName(sc.next());

		System.out.print("입금액을 입력하세요. : ");
		dto.setBalance(sc.nextLong());

		System.out.println(dto.toString());

		try {
			conn = ConnectionProvider.getConnection();
			sql = "insert into bank values(bank_num_seq.nextval, ?, ?, ?)";
			ps = conn.prepareStatement(sql);

			ps.setString(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setLong(3, dto.getBalance());

			int check = ps.executeUpdate();
			System.out.println("Insert Result : " + check);

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {
			JdbcUtil.close(ps);
			JdbcUtil.close(conn);
		}
	}
	
	public void deposit() { // 2. 입금
		
		dto = new AccountDto();
		sc = new Scanner(System.in);

		System.out.print("계좌번호 : ");
		dto.setId(sc.next());

		try {
			conn = ConnectionProvider.getConnection();
			sql = "select balance from bank where id=?";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, dto.getId());
			
			rs = ps.executeQuery();
			if (rs.next()) {
				// System.out.println(rs.getLong("balance"));
				System.out.println("입금액");
				long money = sc.nextLong();

				dto.setBalance(rs.getLong("balance") + money);
				JdbcUtil.close(ps);

				sql = "update bank set balance=? where id=?";
				ps = conn.prepareStatement(sql);
				ps.setLong(1, dto.getBalance());
				ps.setString(2, dto.getId());

				int check = ps.executeUpdate();
				System.out.println("Deposit Up : " + check);

			} else {
				System.out.println("계좌 번호가 존재하지 않습니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(ps);
			JdbcUtil.close(conn);
		}
	}
	
	public void withdraw() { // 3. 출금

		dto = new AccountDto();
		sc = new Scanner(System.in);

		System.out.print("계좌번호 : ");
		dto.setId(sc.next());

		System.out.print("출금액 : ");
		long money = sc.nextLong();
		
		System.out.println();

		try {
			conn = ConnectionProvider.getConnection();
			sql = "select balance from bank where id=? and balance >= ?";
			ps = conn.prepareStatement(sql);

			ps.setString(1, dto.getId());
			ps.setLong(2, money);

			rs = ps.executeQuery();
			if (rs.next()) {
				dto.setBalance(rs.getLong("balance") - money);
				JdbcUtil.close(ps);

				sql = "update bank set balance=? where id=?";
				ps = conn.prepareStatement(sql);

				ps.setLong(1, dto.getBalance());
				ps.setString(2, dto.getId());

				int check = ps.executeUpdate();
				System.out.println("Withdraw Up : " + check);
				System.out.println("잔액 : " + dto.getBalance());
				System.out.println();

			} else {
				System.out.println("계좌 번호 또는 잔액을 확인하세요.");
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(ps);
			JdbcUtil.close(conn);
		}
	}
	
	public void inquire() {	// 4. 잔액 조회
		
		conn = ConnectionProvider.getConnection();
		sc = new Scanner(System.in);
		dto = new AccountDto();
		
		System.out.print("계좌 번호 : ");
		dto.setId(sc.next());
		
		System.out.print("이름 : ");
		dto.setName(sc.next());
		
		System.out.println();
		
		try {
			sql = "select * from bank where id=? and name=?";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getName());
			
			rs = ps.executeQuery();
			if(rs.next()) {
				dto.setNum(rs.getInt("num"));
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setBalance(rs.getLong("balance"));
				
				System.out.println(dto.getNum() + "\t" + dto.getId() + "\t" + dto.getName() + "\t" + dto.getBalance());
				System.out.println();
				
			} else {
				System.out.println("계좌번호와 이름을 다시 확인해주세요.");
				System.out.println();
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			
			JdbcUtil.close(rs);
			JdbcUtil.close(ps);
			JdbcUtil.close(conn);
		}
	}
	
	public ArrayList<AccountDto> showData() { // 5. 전체 출력
		
		conn = ConnectionProvider.getConnection();		
		dto = new AccountDto();
		
		ArrayList<AccountDto> list = new ArrayList<AccountDto>();
		
		try {
			sql = "select * from bank order by num asc";
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				dto.setNum(rs.getInt("num"));
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setBalance(rs.getLong("balance"));
				
				list.add(dto);
			}
			
			for(int i =0; i<list.size(); i++) {
				AccountDto ad = list.get(i);
				System.out.println(ad.getNum() + "\t" + ad.getId() + "\t" + ad.getName() + "\t" + ad.getBalance());
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(ps);
			JdbcUtil.close(conn);
		}
		return list;
	}
}