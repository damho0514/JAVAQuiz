package quiz28;

import java.util.Scanner;

public class StringQuiz01 {
		
	public static void main(String[] args) {
		
	
	/*
	 * scanner를 통해서 id를 입력받습니다.
	 * 아이디는 공백을 포함해서 받을 수 있습니다.
	 * 단 공백을 제거한 아이디가 5글자 미만이면 다시 입력받으세요.
	 * 		5글자 이상이라면 "id가 등록되었습니다" 출력 후 종료
	 * 
	 * 
	 */
//	while(true) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("id를 입력받습니다");
//		String a = sc.next();
//		a = a.trim();
//	
//		if(a.length()<5) {
//			System.out.println("다시 입력받으세요");
//		}else {
//			System.out.print("id가 등록되었습니다.");
//			break;
//		}
//	}
//		 scanner를 통해서 id를 입력받습니다.
//		 * 아이디는 공백을 포함해서 받을 수 있습니다.
//		 * 단 공백을 제거한 아이디가 5글자 미만이면 다시 입력받으세요.
//		 * 		5글자 이상이라면 "id가 등록되었습니다" 출력 후 종료
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("아이디입력");
			String id = sc.nextLine();
			id = id.trim();
			
			if(id.length()<5) {
				System.out.println("다시 입력받으세요");
			}else
				System.out.println(id +"id가 등록되었습니다.");
				break;
			}
		}
			
			
			
			
			
			
			
			
		
	}

