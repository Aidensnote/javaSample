package day17;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		/* 사이즈 결정 = 리사이즈 불가 = 카운트변수로 배열관리를 해야함 = 일렬의 메모리를 할당 받으므로 엑서스 속도가 빠름 */ 
		int[] i;		//1 정수값 관리
		String[] s;		//2 문자열 관리
		Student[] ss;	//3 객체 배열 관리
		Object[] ob;	//4 모두 모아서 관리. 심지어 Object배열 안에는 배열 주소도 가능.
		
		
		
		/* 배열의 단점을 보안. 콜렉션 프레임워크 ArrayList = 리사이징 가능 = 카운터 변수가 자동 */ 
		ArrayList list1 = new ArrayList(); // 5 제너릭에서 타입을 설정하지않으면 Object를 모아서 관리.
		list1.add(new Student("홍씨",23));
		list1.add("hello java");
		System.out.println(list1.size());
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		((String)list1.get(1)).toUpperCase();	// 6. 다운캐스팅을 해야지만 uppercase가 가능하다. = 캐스팅.
		
		
		
		
		ArrayList<String> list2 = new ArrayList<String>(); // 5 제너릭. <>안에는 모든 데이터 타입 허용. 배열도 허용.
		for(int j=0;j<200;j++){			//6 배열을 계속 리사이징.
			list2.add("test "+j);
		}
		list2.add(3, "~~~~~~");			// 9 지정한 위치에 배열 더하기
		list2.remove(1);				// 10 지정한 위치 삭제
		list2.remove("test 0");			// 11 특정한 값을 삭제.

		System.out.println(list2);
		System.out.println(list2.size());	//12 배열 전체 크기.
		
		for(int j=0;j<list2.size();j++){	//7 size-카운팅
//			list2.get(j).substring(list2.get(j).length()-2);
//			System.out.println(list2.get(j).substring(list2.get(j).length()-3));
			System.out.println(list2.get(j).toUpperCase());	//8 대문자로변경
			
		}
		
		
		
		
		
		
		
	}
}
