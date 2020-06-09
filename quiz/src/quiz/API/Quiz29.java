package quiz.API;

public class Quiz29 {

	public static void main(String[] args) {
		String str = "1!2@3^4~5";
		String delStr = "!@^~";
		
		StringBuffer sb = new StringBuffer();
		
		int preindex = 0;
		int index;

		for (int i = 0; i < delStr.length(); i++) {
			char chStr = delStr.charAt(i);
			index = str.indexOf(chStr);
			
			sb.append(str.substring(preindex, index));	
			preindex = index+1;
			
			if(i==delStr.length()-1) {
				sb.append(str.substring(index+1));
			}
		}
		
		System.out.println(sb.toString());
	}
}