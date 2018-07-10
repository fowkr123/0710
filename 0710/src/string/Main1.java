package string;

import java.util.ArrayList;
import java.util.HashMap;

enum GENDER {
	MAN, WOMAN;
}

public class Main1 {

	public static void main(String[] args) {
		int x = 200;
		int y = 100;
		
		//x200 y100형식의 문자열 만들기
		String str = String.format("x : %d, y : %d", x, y);
		System.out.println(str);
		
		String msg = "I like Java";
		//위의 문자열에서 java포함여부 확인 - 대소문자 구분없이
		//msg의 문자열을 공백을 기준으로 분할해서 하나씩 출력하기
		int idx = msg.toLowerCase().indexOf("java");
		if(idx >= 0) {
			System.out.println("Java가 존재합니다");
		}
		else {
			System.out.println("Java가 존재하지 않습니다");
		}
		String[] ar = msg.split(" ");
		for(int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		//msg의 3번째 부터 7번째 금지까지 출력하기(end index는 -1해주어야한다)
		String sub = msg.substring(3,8);
		System.out.println(sub);
		
		ArrayList <Integer> al = new ArrayList<>();
		HashMap<String, String> hm = new HashMap<>();
		
		//0이면 남자 1이면 여자
		int gender = 1;
		final int MAN = 0;

		if(gender == MAN) {
			
		}
		else {
			
		}	
	}
}
