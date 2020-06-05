package quiz36;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz03 {
	
	public static void main(String[] args) {
		/*
		 * Date클래스를 이용해서 File경로에 하위폴더로 20200421file 폴더를 생성합니다.
		 * 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
		 * 그만을 입력받을 때 까지 엔터를 포함해서 입력 받습니다.
		 * 	\r\n을 적절하게 이용해서 파일 출력을 완료
		 * 	파일을 다 썼다면 아무방법으로 읽어들여서 이클립스창에 출력.
		 */
		
		Date d = new Date();
		
		SimpleDateFormat simple = new SimpleDateFormat("yyyMMdd");
		System.out.println(simple.format(d)); 
		Scanner sc = new Scanner(System.in);
		BufferedWriter buf = null;
		String name = sc.nextLine();
		
		
		try {
			
			File file = new File("D:\\damho\\file\\"+ simple.format(d)  );
			if(! file.exists()) {
				file.mkdir();
				System.out.println("폴더생성 완료");
			}else {
				System.out.println("해당폴더는 존재합니다");
			}
			System.out.println("파일명을 입력>");
			buf = new BufferedWriter(new FileWriter("D:\\damho\\file\\" + simple.format(d)+ "\\" + name + ".txt"));
			
			System.out.println("[그만]을 입력하려면 중지합니다");
			System.out.println("하실말씀>");
			String result = " ";
			while(true) {
				String str = sc.nextLine();
				
				if(str.equals("그만")) break;
				result += str + "\r\n";
			}
			buf.write(result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {	
		}try {
			buf.close();
	
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		BufferedReader buf2 = null;
		try {
			buf2 = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\damho\\file\\" + simple.format(d) + "\\" + name + ".txt"),"UTF-8"));
			String str;
			while((str = buf2.readLine()) != null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}try {
			buf.close();
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
	}
}
