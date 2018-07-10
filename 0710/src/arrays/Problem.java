package arrays;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// 만원 단위 금액을 입력받아서 오만원과 만원짜리를 몇 장 지급해야하는지
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요 : ");
		int money = sc.nextInt();
		int o = money / 50000;
		int m = money % 50000 / 10000;
		System.out.printf("오만원 : %d, 만원 : %d", o, m);
	}

}
