package quiz.Class1;

class Member {
	public String name;
	public String id;
	public String password;
	public int age;
	
	public boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("1234")) {
			return true;
		} else
			return false;		
	}
	
	public void logout(String id) {
		System.out.println(id + " 로그아웃되었습니다.");
	}
}

public class Quiz10 {
	public static void main(String[] args) {
		Member m = new Member();
		boolean check = m.login("hong", "1234");
		if(check == true) {
			m.logout("hong");
		}
	}
}