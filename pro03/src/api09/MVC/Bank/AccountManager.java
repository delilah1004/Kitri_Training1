package api09.MVC.Bank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 15.
 * @Description : Controller
 */

public class AccountManager {
	private ArrayList<Account> list;
	private Scanner sc;

	public AccountManager() {
		list = new ArrayList<Account>();
		sc = new Scanner(System.in);
	}

	public void makeAccount() { // 1. 계좌 개설 // 계좌번호가 같은 사람
		Account account = new Account();

		System.out.print("계좌번호 : ");
		int id = sc.nextInt();

		for (int i = 0; i < list.size(); i++) {
			Account existAccount = list.get(i);

			if (existAccount.getId() == id) {
				System.out.println("\n**이미 존재하는 계좌번호입니다.**\n");
				return;
			}
		}
		account.setId(id);

		System.out.print("이름 : ");
		account.setName(sc.next());

		System.out.print("입금액 : ");
		account.setBalance(sc.nextLong());

		list.add(account);

		System.out.println("\n**계좌가 개설되었습니다**");
		System.out.println("계좌번호 : " + account.getId() + " / 이름 : " + account.getName() + " / 잔액 : "
				+ account.getBalance() + "\n");
	}

	public void deposit() { // 2. 입금
		System.out.print("계좌번호 : ");
		int id = sc.nextInt();

		System.out.print("입금액 : ");
		long money = sc.nextLong();

		for (int i = 0; i < list.size(); i++) {
			Account account = list.get(i);

			if (account.getId() == id) {
				long balance = account.getBalance() + money;
				account.setBalance(balance);

				System.out.println("\n**입금 완료되었습니다**");
				System.out.println("계좌번호 : " + account.getId() + " / 이름 : " + account.getName() + " / 잔액 : "
						+ account.getBalance() + "\n");
				return;
			}
		}

		System.out.println("\n**해당 계좌번호가 존재하지 않습니다**\n");
	}

	public void withdraw() { // 3. 출금
		System.out.print("계좌번호 : ");
		int id = sc.nextInt();

		System.out.print("출금액 : ");
		long money = sc.nextLong();

		for (int i = 0; i < list.size(); i++) {
			Account account = list.get(i);

			if (account.getId() == id) {

				if (account.getBalance() < money) {
					System.out.println("\n**잔액이 부족합니다**");
					System.out.println("계좌번호 : " + account.getId() + " / 이름 : " + account.getName() + " / 잔액 : "
							+ account.getBalance() + "\n");
					return;
				}

				long balance = account.getBalance() - money;
				account.setBalance(balance);

				System.out.println("\n**출금 완료되었습니다**");
				System.out.println("계좌번호 : " + account.getId() + " / 이름 : " + account.getName() + " / 잔액 : "
						+ account.getBalance() + "\n");
				return;
			}
		}
		System.out.println("\n**해당 계좌번호가 존재하지 않습니다**\n");
	}

	public void inquire() { // 4. 잔액 조회
		System.out.print("계좌번호 : ");
		int id = sc.nextInt();

		for (int i = 0; i < list.size(); i++) {
			Account account = list.get(i);

			if (account.getId() == id) {
				System.out.println("\n**잔액 조회**");
				System.out.println("계좌번호 : " + account.getId() + " / 이름 : " + account.getName() + " / 잔액 : "
						+ account.getBalance() + "\n");
				return;
			}
		}

		System.out.println("\n**해당 계좌번호가 존재하지 않습니다**\n");
	}

	public void disp() { // 5. 전체 출력
		for (int i = 0; i < list.size(); i++) {
			Account account = list.get(i);
			System.out.println(
					"계좌번호 : " + account.getId() + " / 이름 : " + account.getName() + " / 잔액 : " + account.getBalance());
		}
	}

}