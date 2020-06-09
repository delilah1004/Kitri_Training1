package api01.Object;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 11.
 * @Description : java.lang.Object - equals(Object obj)
 */

public class EqualsExam {
	public static void main(String[] args) {
		String a = "hi";
		String b = "hi";
		
		if(a==b) {
			System.out.println("ab 주소값 비교");
		}
		
		if(a.equals(b)) {
			System.out.println("ab 데이터 비교");
		}
		
		String x = new String("hi");
		String y = new String("hi");
		
		if(x==y) {
			System.out.println("xy 주소값 비교");
		}
		
		if(x.equals(y)) {
			System.out.println("xy 데이터 비교");
		}
		
		System.out.println("-------------------");
		
		Member kim = new Member("abc123", "pass1234");
		Member lee = new Member("abc123", "pass1234");
		
		if(kim == lee) {
			System.out.println("member 주소값 비교");
		} else {
			System.out.println("member 주소값 비교 같지 않음");
		}
		
		if(kim.equals(lee)) {
			System.out.println("member 데이터 비교");
		}
	}
}