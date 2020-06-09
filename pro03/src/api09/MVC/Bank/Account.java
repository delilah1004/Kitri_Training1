package api09.MVC.Bank;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 15.
 * @Description : Model : RDBMS(Oracle, MSSQL, MySQL) 연결
 * 
 * DTO
 */

public class Account {
	private int id;					// 계좌번호
	private String name; 		// 고객 이름
	private long balance;		// 계좌 잔액
	
	public Account() { }
	
	public Account(int id, String name, long balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account" + id +  " : id=" + id + ", name=" + name + ", balance=" + balance + " /";
	}
	
	
	
	
	
}