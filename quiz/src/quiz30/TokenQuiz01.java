package quiz30;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenQuiz01 {
		public static void main(String[] args) {
			
		
	/*
	 * 스캐너를 통해서 nextLine()문장을 받습니다.
	 * 입력된 문자열을 토크나이저를 이용해서 공백기준으로 분리
	 * 3. 분리한 토큰의 개수를 출력
	 * 4. 분리된 토큰을 콘솔에 숫자를 붙여서 세로로 출력
	 * 	1. 안녕
	 * 	2. 하세요.
	 * 	3. 오늘은
	 * 	4. 분리된 문자열을 배열에 저장
	 */
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	
	int i = 0;
	StringTokenizer token = new StringTokenizer(str);
	
	String[] arr = new String[token.countTokens()];
	
	while(token.hasMoreTokens()) {
		arr[i] = token.nextToken();
		System.out.println(i+token.nextToken());
		i++;
	}
	System.out.println(Arrays.toString(arr));
	
	
	
	
	
	

}
}