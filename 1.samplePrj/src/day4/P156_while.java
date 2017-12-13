/* 1.7ver 이후 swich구문에 String타입이 입력 가능하다. */
package day4;

import java.util.Scanner;

public class P156_while {

	public static void main(String[] args) {
		String command;
		
		Scanner scanner = new Scanner(System.in);

		// 메뉴 뿌리는곳
		while (true) { // 반복시작위치
			System.out.println("****** 명령선택 ******");
			System.out.println("");
			System.out.println("1. insert(등록) \n");
			System.out.println("2. delete(삭제) \n");
			System.out.println("3. update(수정) \n");
			System.out.println("4. quit(종료) \n");
			System.out.println("******************** \n\n");
			System.out.println("수행할 명령을 선택하세요! "); // 입력 가이드 출력.
			System.out.print("1 2 3 4 중 하나를 선택하세요.. _ ");

			command = scanner.nextLine();

			/* 유효성 검사 */

			switch (command) {
			case "1":
				System.out.println("등록작업을 수행합니다.");
				break;
			case "2":
				System.out.println("삭제작업을 수행합니다.");
				break;
			case "3":
				System.out.println("수정작업을 수행합니다.");
				break;
			case "4":
				System.out.println("프로그램 종료합니다.");
				System.exit(0); // 프로그램 종료
			default:
				System.out.println("1,2,3,4 중 하나를 선택하세요.");
			}
			// 종료시점 다시 올려야 한다.

		}
	}
}