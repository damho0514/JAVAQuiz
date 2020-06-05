package quiz35;

import java.util.Scanner;

public class Member{
	
	private String num;
	private String name;
	private int age;
	private String nick;
	private String addres;
	private int pNumber;
	private Scanner sc = new Scanner(System.in);
	
	public String input() {
		
		System.out.println("고유번호>");
		this.num = sc.next();
		System.out.println("이름>");
		this.name = sc.next();
		System.out.println("나이>");
		this.age = sc.nextInt();
		
		while() {
			System.out.println("닉네임>");
			this.num = sc.next();
		}
	}
	
	
	

	}

