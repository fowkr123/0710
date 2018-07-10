package arrays;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		String [] subject = { "Java", "Oracle", "Web Front End",
				"Web Back End - Java", "Android", "IOS" };
		int [] score = { 97, 43, 59, 100, 70, 23 };
		
		//subject 정렬
		Arrays.sort(subject);
		System.out.println("subject의 정렬 후 : ");
		/*for(int i = 0; i < subject.length; i++) {
			System.out.println(subject[i]);
		}*/
		for(String temp : subject) {
			System.out.println(temp);
		}
		//Oracle의 위치검색
		int idx = Arrays.binarySearch(subject, "Oracle");
		System.out.println(idx);
		//Android의 위치검색
		idx = Arrays.binarySearch(subject, "Android");
		System.out.println(idx);
		
		//score 정렬
		Arrays.sort(score);
		
		for(int tomp : score) {
			System.out.println(tomp);
		}
		//100점의 위치검색
		idx = Arrays.binarySearch(score, 100);
		System.out.println(idx);
		//23점의 위치검색
		idx = Arrays.binarySearch(score, 23);
		System.out.println(idx);
	}

}
