package Bank;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 26.
 * @Description : MVC - DB 연동
 * 
 * Dto(Model)
 * 변수 선언 - 기본 생성자, 생성자 생성 - Getter, Setter 생성, toString() 오버라이딩
 */

public class AccountDto {
	
	private int num;	// 자동 증가 번호
	private String id;		// 계좌 번호
	private String name;		// 이름
	private long balance;		// 잔액
	
	public AccountDto() {
	}

	public AccountDto(int num, String id, String name, long balance) {
		this.num = num;
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
		return "AccountDTO [num=" + num + ", id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}	
}