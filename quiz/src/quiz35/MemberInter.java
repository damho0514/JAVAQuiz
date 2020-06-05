package quiz35;

import java.util.List;

public interface MemberInter {
	
	
	public void point();
	public void input(List<Member>member);
	public void showAll(List<Member>member);
	public void search(List<Member>member);
	public void modify(List<Member>member);
	public void delete(List<Member>member);
	
	public static void Input() {
		
		System.out.println("---프로그램 시작---");
		System.out.println("# 1. 회원정보 입력");
		System.out.println("# 2. 회원정보 조회");
		System.out.println("# 4. 회원정보 수정");
		System.out.println("# 5. 회원정보 삭제");
		System.out.println("# 6. 프로그램 종료");
	}
}
