package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap();		//18 key값을 기준으로 정렬.
//		Map<String, String> map = new HashMap<>();		//1 키값은 중복이 안됨 = 중복되는 종류는 불가하다.= 유니크(유일) 해야한다.
		map.put("korea01", "1234");						//2 키값이 중복되면 뒤에 오는 것으로 오버라이트 되버린다.
		map.put("japan01", "1234");						//3 벨류값이 중복은 상관 없다.
		map.put("china02", "5678");
		map.put("canada03", "91011");						
		map.put("usa04", "121314");
		map.put("java05", "151617");
		map.put("php06", "181920");
		map.put("asp07", "212223");
		map.put("c++08", "242526");
		map.put("c#09", "272829");
		map.put("oracle10", "303132");
//		System.out.println(map);						//4 키캆과 벨류값은 =으로 연결시켜서 출력된다.
		
//		System.out.println(map.get("java01"));			//5 키값에 연결된 밸류값을 출력시켜줌. = 키값을 알아야 밸류값을 가져올 수 있다.
//		System.out.println(map.get("java02"));			//6 겟메소드로 목록만 바뀌면 된다 = 키값 순환
//		System.out.println(map.get("java03"));			
//		System.out.println(map.get("java04"));			
//		System.out.println(map.get("java05"));			
//		System.out.println(map.get("java06"));			
//		System.out.println(map.get("java07"));			
//		System.out.println(map.get("java08"));
		
//		System.out.println(map.keySet());				//8 map에 있는 key값만 출력
//		Set<String>keys = map.keySet();					//9 key이름만 keys에 저장.
		
//		//새로나온 for() / iterator 둘 중 택1
//		Iterator<String> it = keys.iterator();			//10 key값 리스트 출력.
//		while (it.hasNext()) {
//			String keyName = (String) it.next();		//11 key값에 따라 keyName에 pw 매칭되서 저장된다.
//			System.out.println("ID:"+keyName+" , pw:"+map.get(keyName));
//			
//		}
		while(true){									//17 로그인 할때까지 반복.
			System.out.println(" 로그인 처리 ");			//12 id/pw 필요.
			Scanner scanner = new Scanner(System.in);	//13 키보드로 입력
			System.out.print("ID: _");
			String id = scanner.nextLine();
			System.out.print("\npw: _");
			String pw = scanner.nextLine();
			
			if(map.containsKey(id)){						//14 id 존재함
				if(map.get(id).equals(pw)){					//14 id/pw 일치시
					System.out.println("로그인 성공입니다.");	//14 출력 메소드.
					break;									//17 빠져나오는 종료 시점 = 정상 로그인.
				}else{
					System.out.println("비밀번호를 다시 확인하세요.");	//15 id/pw불일치
				}
			}else{											//16 id 존재 안함
				System.out.println("ID가 존재하지 않습니다.");	//16 if 시작으로 리턴.
			}
		}
		System.out.println("====== 서비스 목록 ======");	//14 id/pw까지 매칭 완료시 출력.
		
		
		
		Set<String>keys = map.keySet();					//19 key값으로 오름차순 정렬해서 출력. 
		Iterator<String> it = keys.iterator();			
		while (it.hasNext()) {
			String keyName = (String) it.next();		
			System.out.println("ID:"+keyName+" , pw:"+map.get(keyName));
		
		
		
	}
}
}