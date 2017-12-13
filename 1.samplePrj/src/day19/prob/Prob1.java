package day19.prob;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prob1 {

	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000#";
		
//		Prob1.stringSplit(str, "#");									//2 ȣ�⹮���� ���� ���߰� �����ϴ�. Ŭ������������ ����. -1.(prob1) this�� ���ξȿ��� ���Ұ�=���� Ŭ�������� -2. �Ķ���� ���� -3 set����.
		Set<String> list = stringSplit(str, "#");						//5 ��� �Ϳ� ���� �޼ҵ��� ����ΰ� �����ȴ�. �Ű����� String2��, ������� setŸ�� = � ������� ȣ������ ������.
		System.out.println(list);
		
		Iterator<String> it = list.iterator();							//16 �������� �������� ����Ʈ ���� �۾�. substring���� ������ �����͸� set�� ����Ǿ��ٰ� list�� ����.
		while (it.hasNext()) {											//17 ���ĵ� ����Ʈ �о ���.
			String data = (String) it.next();
			System.out.println(data);
		}
		
	}
	//1 �޼ҵ� ����� �м�
	private static Set<String> stringSplit(String str, String string) {	//2 private = �ش� class������ ��밡��. static=�޸𸮿� �ȶ��� ȣ�Ⱑ��. static�� ������ ��ü new�� �����ؾ���. ����Ÿ��: Set<String> 
		Set<String> set = new HashSet<>();								//3 ��ȯ�� ������ �������� - ���߿� null�� �ּҰ� ��.	//6 set���� ����,����. = �����͸� ����.=�����. ������ �����۾� �غ�.
		int p = -1;														//8 ������ �˷��ִ� p ���� ����. (�ڸ��� �� �� ��ġ �ε���)
//		p = str.indexOf("#",p+1);										//9 p�� ���� ����.

		
//		set.add(str.substring(0,str.indexOf("#")));			//7 set�� �ֱ�->�ڸ���(0����str�� "#"����)
		
//		set.add(str.substring(0,p));						//10 set�� �ֱ�->�ڸ���(0����str�� "#"����)=p�� ����
//		set.add(str.substring(p+1,str.indexOf("#",p+1)));	//11 set�� �ֱ�->�ڸ���("#"���� p+1��ġ����)
//		set.add(str.substring(p+1,str.indexOf("#",p+1)));	//12 p���� 9���� ����
//		set.add(str.substring(p+1,str.indexOf("#",p+1)));

		do{															//14 do-while�� �ּ� 1ȸ. [�ݺ�ó����] ����.
			if(p+1>=str.length()) break;							//16 p�� 33�϶�(�������϶� �ݺ����� ���ϰ�.
			set.add(str.substring(p+1,p=str.indexOf("#",p+1)));		//13 p���� ���� ����� ��. �̰ɷ� ���� ������ �ݺ���. = �ݺ��� Ƚ���� �����ϸ� ��.
		}while(p != -1);											//15 p=-1 = index�� ���� ������. ���ܹ߻� p=33�̵Ǵ¼��� ������+1�� �Ǹ鼭 ����.
		return set;													//4 ���ϰ��� Set<String>�� ������ Ÿ��.
	}
}
