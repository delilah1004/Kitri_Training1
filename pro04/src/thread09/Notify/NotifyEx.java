package thread09.Notify;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 21.
 * @Description : 동기화 메소드 wait() / notify()
 */

public class NotifyEx {
	public static void main(String[] args) {
		
		WorkData workData = new WorkData();		// 공유객체
		
		Hong a = new Hong(workData);
		a.setName("Ahong");
		
		Hong b = new Hong(workData);
		b.setName("Bhong");
		
		ChoCEO x = new ChoCEO(workData);
		x.setName("Xcho");
		
		ChoCEO y = new ChoCEO(workData);
		y.setName("Ycho");
		
		a.start();
		b.start();
		x.start();
		y.start();
		
	}
}