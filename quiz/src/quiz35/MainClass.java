package quiz35;





import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 1. List, set, map을 이용해서 간단한 관리프로그램을 정합니다.
		 * (도서관, 회원관리, 예약관리, 물품관리)
		 * 
		 * 2. 인터페이스를 반드시 하나이상 사용합니다.
		 * 
		 * 3. 기능은 3개이상 생성.
		 * 
		 * 4. 클래스를 사용하면 됩니다.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		List<Member> list = new ArrayList<>();
		MemberInter inter = new Member();
			
		while(true) {
			MemberInter.Input();
			
			System.out.println("회원 고유번호 입력>");
			String num = sc.next();
			System.out.println("이름 입력>");
			String name = sc.next();
			System.out.println("나이 입력>");
			int age = sc.nextInt();
			System.out.println("닉네임 입력>");
			String nick = sc.next();
			System.out.println("주소 입력>");
			String addres =	sc.next();
			System.out.println("전화번호 입력>");
			int pNumber	= sc.nextInt();
			
			String menu = sc.next();
		}
		
	}
}
