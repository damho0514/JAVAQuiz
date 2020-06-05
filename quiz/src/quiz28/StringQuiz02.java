package quiz28;

import java.util.Scanner;

public class StringQuiz02 {
		
		public static void main(String[] args) {
		
	/*
	 * 1. 주민번호 13자리를 입력받습니다.
	 * 2. 주민번호는 -를 포함해서 받을 수 있습니다.
	 * 3. 13자리가 아니라면 다시 입력받습니다.
	 * 4. 남자인지 여자인지 구분해서 출력해주세요
	 * 
	 */
//	while(true) {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("주민번호 13자리를 입력하세요");
//		String abs = sc.next();
//		String[] arr = abs.split("-");
//		String  a = arr[0]+arr[1];
//		
//		String b = a.substring(6,7);
//		
//		if(a.length() != 13) {
//			System.out.println("다시 입력받습니다.");
//			continue;
//		}if(b.equals("1") || b.equals("3")){
//			System.out.println("남자입니다.");
//			break;
//			
//		}else if(b.equals("2") || b.equals("4")){
//			
//			System.out.println("여자입니다.");	
//			break;
//		}
//		
//	}
	while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력>");
		String abs = sc.nextLine();
		String[] arr = abs.split("-");
		String a = arr[0]+arr[1];
		String b = a.substring(6,7);
		
		if(a.length() != 13) {
			System.out.println("다시 입력하세요");
			continue;
			
		}if(b.equals("1") || b.equals("3")) {
			System.out.println("남자입니다.");	
			break;
		}else if(b.equals("2") || b.equals("4")){
			System.out.println("여자입니다.");
			break;
		}
		
		}
		
	}
}
