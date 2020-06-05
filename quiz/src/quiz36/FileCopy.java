package quiz36;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
	
	public static void main(String[] args) {
		/*
		 * 1.스캐너를 통해서 파일명을 정확히 입력받습니다.
		 * 
		 * 2.upload폴더에 해당파일이 있다면, 해당파일을 복사해서 uploadcopy폴더로 복사하세요
		 *  파일이 없다면 파일명이 없습니다 예외구문을 출력합니다.
		 * 
		 * 3. 복사도중에 에러가 발생하면 "파일 처리중 예외발생" 구문을 출력. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		FileInputStream oFile = null;
		FileOutputStream newFile = null;
		
		try {
			System.out.println("파일명을 입력하세요");
			String name = sc.next();
			oFile = new FileInputStream("D:\\damho\\upload\\" + name);
			newFile = new FileOutputStream("D:\\damho\\uploadcopy\\" + name);
			int result;
			byte[] arr = new byte[100];
			while((result = oFile.read(arr)) != -1) {
				newFile.write(arr, 0, result);
			}
			System.out.println("파일이 복사되었습니다.");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}catch(IOException e){
			System.out.println("파일 처리중 에러가 발생했습니다.");
		}finally {
			
		}try {
			sc.close();
			oFile.close();
			newFile.close();
		} catch (Exception e2) {
			
		}
	}
}
