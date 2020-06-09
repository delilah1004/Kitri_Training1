package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.next();
			char ch = str.charAt(0);
			
			if(ch=='q') {
				System.out.println(ch);
				break;
			}
			
			System.out.println(ch);
		}
	}
}