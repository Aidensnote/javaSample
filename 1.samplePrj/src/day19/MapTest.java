package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap();		//18 key���� �������� ����.
//		Map<String, String> map = new HashMap<>();		//1 Ű���� �ߺ��� �ȵ� = �ߺ��Ǵ� ������ �Ұ��ϴ�.= ����ũ(����) �ؾ��Ѵ�.
		map.put("korea01", "1234");						//2 Ű���� �ߺ��Ǹ� �ڿ� ���� ������ ��������Ʈ �ǹ�����.
		map.put("japan01", "1234");						//3 �������� �ߺ��� ��� ����.
		map.put("china02", "5678");
		map.put("canada03", "91011");						
		map.put("usa04", "121314");
		map.put("java05", "151617");
		map.put("php06", "181920");
		map.put("asp07", "212223");
		map.put("c++08", "242526");
		map.put("c#09", "272829");
		map.put("oracle10", "303132");
//		System.out.println(map);						//4 Ű���� �������� =���� ������Ѽ� ��µȴ�.
		
//		System.out.println(map.get("java01"));			//5 Ű���� ����� ������� ��½�����. = Ű���� �˾ƾ� ������� ������ �� �ִ�.
//		System.out.println(map.get("java02"));			//6 �ٸ޼ҵ�� ��ϸ� �ٲ�� �ȴ� = Ű�� ��ȯ
//		System.out.println(map.get("java03"));			
//		System.out.println(map.get("java04"));			
//		System.out.println(map.get("java05"));			
//		System.out.println(map.get("java06"));			
//		System.out.println(map.get("java07"));			
//		System.out.println(map.get("java08"));
		
//		System.out.println(map.keySet());				//8 map�� �ִ� key���� ���
//		Set<String>keys = map.keySet();					//9 key�̸��� keys�� ����.
		
//		//���γ��� for() / iterator �� �� ��1
//		Iterator<String> it = keys.iterator();			//10 key�� ����Ʈ ���.
//		while (it.hasNext()) {
//			String keyName = (String) it.next();		//11 key���� ���� keyName�� pw ��Ī�Ǽ� ����ȴ�.
//			System.out.println("ID:"+keyName+" , pw:"+map.get(keyName));
//			
//		}
		while(true){									//17 �α��� �Ҷ����� �ݺ�.
			System.out.println(" �α��� ó�� ");			//12 id/pw �ʿ�.
			Scanner scanner = new Scanner(System.in);	//13 Ű����� �Է�
			System.out.print("ID: _");
			String id = scanner.nextLine();
			System.out.print("\npw: _");
			String pw = scanner.nextLine();
			
			if(map.containsKey(id)){						//14 id ������
				if(map.get(id).equals(pw)){					//14 id/pw ��ġ��
					System.out.println("�α��� �����Դϴ�.");	//14 ��� �޼ҵ�.
					break;									//17 ���������� ���� ���� = ���� �α���.
				}else{
					System.out.println("��й�ȣ�� �ٽ� Ȯ���ϼ���.");	//15 id/pw����ġ
				}
			}else{											//16 id ���� ����
				System.out.println("ID�� �������� �ʽ��ϴ�.");	//16 if �������� ����.
			}
		}
		System.out.println("====== ���� ��� ======");	//14 id/pw���� ��Ī �Ϸ�� ���.
		
		
		
		Set<String>keys = map.keySet();					//19 key������ �������� �����ؼ� ���. 
		Iterator<String> it = keys.iterator();			
		while (it.hasNext()) {
			String keyName = (String) it.next();		
			System.out.println("ID:"+keyName+" , pw:"+map.get(keyName));
		
		
		
	}
}
}