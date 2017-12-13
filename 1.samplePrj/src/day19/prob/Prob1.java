package day19.prob;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prob1 {

	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000#";
		
//		Prob1.stringSplit(str, "#");									//2 호출문으로 선언문 유추가 가능하다. 클레스네임으로 접근. -1.(prob1) this는 메인안에서 사용불가=나의 클래스네임 -2. 파라미터 동일 -3 set구조.
		Set<String> list = stringSplit(str, "#");						//5 담는 것에 따라 메소드의 선언부가 결정된다. 매개변수 String2개, 결과값은 set타입 = 어떤 방식으로 호출할지 결정됨.
		System.out.println(list);
		
		Iterator<String> it = list.iterator();							//16 실질적인 데이터의 리스트 정렬 작업. substring으로 정리된 데이터를 set이 저장되었다가 list로 정렬.
		while (it.hasNext()) {											//17 정렬된 리스트 읽어서 출력.
			String data = (String) it.next();
			System.out.println(data);
		}
		
	}
	//1 메소드 선언부 분석
	private static Set<String> stringSplit(String str, String string) {	//2 private = 해당 class에서만 사용가능. static=메모리에 안띄우고 호출가능. static이 없으면 객체 new로 생성해야함. 리턴타입: Set<String> 
		Set<String> set = new HashSet<>();								//3 변환값 저장할 변수선언 - 나중엔 null에 주소가 들어감.	//6 set구조 생성,리턴. = 데이터를 찍음.=빈공간. 데이터 구축작업 준비.
		int p = -1;														//8 포지션 알려주는 p 변수 선언. (자르고 난 뒤 위치 인덱스)
//		p = str.indexOf("#",p+1);										//9 p의 값을 설정.

		
//		set.add(str.substring(0,str.indexOf("#")));			//7 set에 넣기->자르기(0부터str의 "#"까지)
		
//		set.add(str.substring(0,p));						//10 set에 넣기->자르기(0부터str의 "#"까지)=p로 변경
//		set.add(str.substring(p+1,str.indexOf("#",p+1)));	//11 set에 넣기->자르기("#"부터 p+1위치까지)
//		set.add(str.substring(p+1,str.indexOf("#",p+1)));	//12 p값이 9에서 멈춤
//		set.add(str.substring(p+1,str.indexOf("#",p+1)));

		do{															//14 do-while은 최소 1회. [반복처리문] 생성.
			if(p+1>=str.length()) break;							//16 p가 33일때(마지막일때 반복수행 못하게.
			set.add(str.substring(p+1,p=str.indexOf("#",p+1)));		//13 p값을 새로 어사인 됨. 이걸로 위에 문장이 반복됨. = 반복할 횟수만 지정하면 됨.
		}while(p != -1);											//15 p=-1 = index가 없을 때까지. 예외발생 p=33이되는순간 마지막+1이 되면서 예외.
		return set;													//4 리턴값은 Set<String>와 동일한 타입.
	}
}
