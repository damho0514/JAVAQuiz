package quiz34;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MenuManager {
	
		
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
//		Map<String,Integer> map = new HashMap<>();
//		Scanner sc = new Scanner(System.in);	
		//맵을 이용하는데 key : 메뉴 이름 value: 가격
		while(true) {
			
			System.out.println("--------음식 메뉴 관리-------");
			System.out.println("1. 신규 메뉴 등록"); 	//이미 등록된 메뉴인지 확인 후에 메뉴 등록
			System.out.println("2. 메뉴판 전체 보기");	//메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정");	//변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
			System.out.println("4. 메뉴판 삭제");	//변경할 메뉴를 받아서 메뉴가 있다면 삭제
			System.out.println("5. 프로그램 종료");	//종료
			
//			int menu = sc.nextInt();
//			int value = 0;
//			
//			if(menu == 1) {
//				System.out.println("메뉴 입력>");
//				String name = sc.next();
//				if(map.containsKey(name)) {
//					System.out.println(name + "은 이미 등록되어 있습니다");
//				}
//				else {
//					int price = sc.nextInt();
//					map.put(name, price);
//				}
//			}else if(menu == 2) {
//				System.out.println("전체 메뉴판 보기>");
//				Set<Entry<String,Integer>> set = map.entrySet();
//				Iterator<Entry<String,Integer>> iter = set.iterator();
//				while(iter.hasNext()) {
//					String key = iter.next().getKey();
//					System.out.println(key + "메뉴" + map.get(key));
//				}
//			}else if(menu == 3) {
//				
//			}else if(menu == 4) {
//				
//			}else if(menu == 5) {
//				
//			}
			System.out.println("메뉴 입력>");
			int value = 0;
			int menu = sc.nextInt();
			
			if(menu ==1) {//메뉴가 있는 경우
				System.out.println("메뉴입력>");
				String name =sc.next();
				if(map.containsKey(name)) {
					System.out.println(name + "은 이미 등록된 메뉴 입니다");
				}else {
					int price = sc.nextInt();
					map.put(name, price);
					
				}
			}else if(menu ==2) {//메뉴판 전체보기
				System.out.println("====메뉴판 전체보기 =====");
				Set<Entry<String,Integer>> set =  map.entrySet();
				Iterator<Entry<String,Integer>> iter =  set.iterator();
				
				while(iter.hasNext()) {
					String key = iter.next().getKey();
					System.out.println(key + "메뉴" + map.get(key));
				}
			}else if(menu ==3) {//수정
				
				System.out.println("가격을 변경할 메뉴룰 입력하세요>");
				String name = sc.next();
				if(map.containsKey(name)) {
					System.out.println("수정할 가격>");
					int price = sc.nextInt();
					
					System.out.println(map.get(name) + "원 ->" + price);
					map.put(name, price);
				}else {
					System.out.println("해당 메뉴는 없습니다");
				}
			}else if(menu == 4) {//삭제
				
				System.out.println("삭제할 메뉴명 입력>");
				String name = sc.next();
				
				if(map.containsKey(name)) {
					map.remove(name); //삭제
					System.out.println(name + "이 삭제 되었습니다");
				}else {
					System.out.println(name + "은 없는 메뉴입니다");
				}
				
			}else if(menu == 5) {
				System.out.println("프로그램 종료합니다");
				System.exit(0);
			}
		}
		
	}
}
