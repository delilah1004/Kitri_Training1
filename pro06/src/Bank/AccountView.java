package Bank;

import java.util.Scanner;
import dbUtil.DriverProvider;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 26.
 * @Description : MVC - DB 연동
 * 
 *              View - main
 */

public class AccountView {
	public static void main(String[] args) {

		// 1단계 : 데이터베이스 연결
		DriverProvider dp = new DriverProvider();
		dp.getDriver();

		AccountDao jbank = new AccountDao();
		Scanner sc = new Scanner(System.in);

		while (true) {
			printMenu();

			System.out.print("이용하실 서비스의 번호를 입력하세요. : ");
			int choice = sc.nextInt();
			System.out.println();

			switch (choice) {
			case 1:	// 계좌 개설
				jbank.makeAccount();
				System.out.println();
				break;
			case 2:	// 입금
				jbank.deposit();
				break;
			case 3:	// 출금
				jbank.withdraw();
				break;
			case 4:
				jbank.inquire();
				break;
			case 5:	// 전체 출력
				System.out.println(jbank.showData());
				break;
			case 6:
				System.out.println("종료합니다.");
				if (sc != null)
					sc.close();
				System.exit(0);
			}
		}
	}

	public static void printMenu() {
		System.out.println("[----Menu----]");
		System.out.println("1. 계좌 개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 잔액 조회");
		System.out.println("5. 전체 출력");
		System.out.println("6. 프로그램 종료");
		System.out.println();
	}
}
