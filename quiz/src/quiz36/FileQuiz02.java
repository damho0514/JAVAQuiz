package quiz36;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileQuiz02 {
	
	public static void main(String[] args) {
		
		FileWriter file = null;
		BufferedWriter buf = null;
		Date d = new Date();
		
		SimpleDateFormat simple = new SimpleDateFormat("yyyMMdd");
		System.out.println(simple.format(d));
		
		try {
			
			file = new FileWriter("D:\\damho\\file\\" + simple.format(d)+ ".txt");
			buf =  new BufferedWriter(file);
			
			buf.write("안녕하세요. 하하하");
			System.out.println("파일이 정상적으로 입력되었습니다.");
						
		} catch (Exception e) {
			e.printStackTrace();
		}try {
			buf.close();
			file.close();
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		FileReader file2= null;
		BufferedReader buf2 = null;
		
		try {
			file2 = new FileReader("D:\\damho\\file\\"  + simple.format(d) + ".txt");
			buf2 = new BufferedReader(file2);
			
			String str;
			while((str = buf2.readLine()) !=  null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}try {
			buf2.close();
			file2.close();
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
	}
		
	/*
	 * Date클래스를 이용해서 file경로에 20200421.txt이름으로 파일을 씁니다
	 * 내용은 아무거나 작성하세요
	 * 파일을 정상적으로 썼다면 BufferedReader를 통해서 파일을 읽어들이세요.
	 * 
	 * 
	 */
	
}
