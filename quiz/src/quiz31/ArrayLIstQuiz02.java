package quiz31;

import java.util.ArrayList;
import java.util.List;

public class ArrayLIstQuiz02 {
	
	public static void main(String[] args) {
		
		/*
		 * 1.User클래스는 은닉된 변수로 name, age 선언.
		 * User클래스의 생성자도 선언.
		 * 
		 * 2.User클래슬르 저장할 수 있는 ArrayList선언
		 * 3.User객체를 2개 생성해서 리스트에 추가하세요.
		 * 
		 * 4.List에 저장된 모든 이름, 나이를 for문으로 출력, 향상된 for문으로 출력
		 * 5.list에 "홍길자" 가 있다면 홍길자의 이름, 나이만 출력
		 */
		
		List<User> list = new ArrayList<>();
		User u = new User("홍길자",30 );
		User u2 = new User("홍길동",20 );
		
		list.add(u);
		list.add(u2);
		
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getAge());
		}
		System.out.println("-------------");
		
		System.out.println("---------------");
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals("홍길동")){
				System.out.println(list.get(i).getName());
				System.out.println(list.get(i).getAge());
			}
		}
		
		System.out.println("-----------------------");
		
		for(int i = 0; i <list.size(); i++ ) {
			if(list.get(i).getName().equals("홍길자")){
				list.remove(i);
		}
			System.out.println(list.toString());
	}
	}
}
	

