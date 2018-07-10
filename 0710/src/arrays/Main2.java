package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// 인스턴스 배열 만들기 - 3개 저장할 수 있는 배열을 생성
		// 아직은 모두 null
		Game[] games = new Game[3];
		// 인스턴스생성
		games[0] = new Game();
		// 값을 채웁니다.
		games[0].setCreatedate("2018-07-10");
		games[0].setJob("검사");
		games[0].setMoney(2134000);
		games[0].setLevel(21);
		games[0].setNickname("지존검사");

		// 인스턴스생성
		games[1] = new Game();
		// 값을 채웁니다.
		games[1].setCreatedate("2018-05-09");
		games[1].setJob("마법사");
		games[1].setMoney(9834);
		games[1].setLevel(78);
		games[1].setNickname("마법사1짱");

		// 인스턴스생성
		games[2] = new Game();
		// 값을채웁니다
		games[2].setCreatedate("20140610");
		games[2].setJob("도적");
		games[2].setMoney(192300);
		games[2].setLevel(192);
		games[2].setNickname("수리검의맛");

		// 키보드의 값을 입력받기 위한 스캐너 인스턴스생성
		Scanner sc = new Scanner(System.in);

		while(true) {
			//비교할 Comparator 변수를 만들고
			Comparator <Game> comparator;
			// 메뉴 메세지
			System.out.println("--================--");
			System.out.println("0.종료");
			System.out.println("1.현재 월드의 레벨 랭킹");
			System.out.println("2.현재 월드의 머니 랭킹");
	
			int inuser = sc.nextInt();
			
			if(inuser == 0) {
				break;
			}	
			else if (inuser == 1) {
				// 배열의 데이터를 정렬
				// 기본적으로 정렬을 하려면 각 데이터의 크기를 비교할 수 있어야합니다.
				// java에서 크기 비교를 하는 메소드는
				// Comparable 인터페이스의 compare 메소드입니다.
				// 직접 만든 클래스의 경우는 클래스에 comprable 인터페이스를
				// implements 하던가 Comparable 인터페이스를 implements한
				// 인스턴스를 같이 대입해야합니다.
				
				//Comparator 인터페이스를 implements한 인스턴스 만들기
				comparator = new Comparator() {
					
					@Override
					public int compare(Object o1, Object o2) {
						//오브젝트는 형변환을 해주어야 하기 때문에 데이터 형변환을 한다.
						Game first = (Game)o1;
						Game second = (Game)o2;
						//문자열과 데이트는 comfareTo를 이용하여 크기 비교하고, int형은 뺄셈을 이용하여 크기를 비교한다.
						return second.getLevel() - first.getLevel();
					}			
				};
				Arrays.sort(games, comparator);
				System.out.println("--====================--");
				for (Game game : games) {
					System.out.println(game);
				}
				System.out.println("--====================--");
			}
			else if(inuser == 2) {
				comparator = new Comparator() {		
					@Override
					public int compare(Object o1, Object o2) {
						//데이터 형변환
						Game first = (Game)o1;
						Game second = (Game)o2;
						return second.getMoney() - first.getMoney();
					}			
				};
				Arrays.sort(games, comparator);
				System.out.println("--====================--");
				for (Game game : games) {
					System.out.println(game);
				}
				System.out.println("--====================--");
			}
		}
		sc.close();
	}

}
