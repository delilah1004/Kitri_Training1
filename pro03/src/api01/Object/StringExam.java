package api01.Object;

public class StringExam {

	public static void main(String[] args) {
		String str = "apple";
		// String은 자료형처럼 쓰는 클래스
		
		int su =10;
		// int는 자료형
		
		Integer value = new Integer(10);
		System.out.println(value.toString());

		Member member = new Member("abc123", "pass1234");
		System.out.println(member.toString());
		
		Su s = new Su();
		s.setX(10);
		s.setY(20);
		s.setZ(30);
		
		System.out.println(s.toString());
	}

}
