package quiz28;

public class StringQuiz03 {
	
		
		
	public static void main(String[] args) {
		
		
		/*
		 * 아이티뱅크 친구 네오는 palindrome()를 함수를 만들었습니다.
		 * - 매개변수로 String값을 받아서 회문 여부를 검사하는 메서드 입니다.
		 * ex)아 좋다 좋아, 다시 다 , 앞으로 읽거나 뒤로 읽으면 같음
		 * 
		 * 매개변수를 공백을 포함해서 받을 수 있습니다.
		 * 회문이라면 return "회문입니다" 를 반환합니다.
		 * 회문이 아니라면 "회문이 아닙니다" 를 반환합니다.
		 * 
		 */
		System.out.println(palindrome("ABCCBA"));
//	}
//	public static String palindrome(String word) {
//		String a = " ";	
//		
//		word = word.replace(" ", " ");
//		for(int i = 0; i< word.length() / 2; i++) {
//				
//			if(word.charAt(i) != word.charAt(word.length()-1 -i)) {
//				return "회문이 아닙니다";
//			}
//		
//
//		
//	}
//		return "회문 입니다";
		
		
	}
	public static String palindrome(String word){
		word = word.replace(" ",  " ");
		
		StringBuffer sb = new StringBuffer(word);
		if(sb.reverse().toString().equals(word)) {
			return "회문입니다.";
	}else {
		return "회문이 아닙니다";
	}
	}
}