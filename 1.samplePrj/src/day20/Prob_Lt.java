package day20;

import java.util.Vector;

public class Prob_Lt {
	Vector<String>  moveToVector(String datas[]){	//1. ����Ÿ�� , �޼ҵ� ��
		if(datas.length==0||datas==null){			//14 ����ó��
			System.out.println("ó���� �����Ͱ� �ʿ��մϴ�.");	//15 ���ܽ� ��� �޼���
			return null;							//16 ���� ���Ѽ� �ٽ� �����ϰ� �ؾ���.
		}
		Vector<String> data = new Vector<String>();	//2. ��ä����. 1.5ver���ķ� ���ʸ��� �־����� �ʾƵ� �Ǿ����� �־��ִ°� �Ϲ����̴�.
//		for(int i=0;i<datas.length;i++){			//4. �迭=for()
		for(int i=datas.length-1;i>=0;i--){			//6. �����̹Ƿ� ���� ����
			data.add(datas[i]);						//5. �տ������� ������� add. = ������� ����ִ°�.
		}
		return data;								//3. ����Ÿ�� ��ġ
	}
	public static void main(String[] args){			// 7 ���λ���
		Prob1 p = new Prob1();						// 8 ��ä����
		String[] d = {"1","2","3","4","5"};			// 10 �������� �� �Ѱ��ֱ�
//		p.moveToVector(args);						// 9 String�� �迭
		Vector<String> list = p.moveToVector(d);	// 11 ����Ʈ�� ���� �� �ֱ�
//		Vector<String> list = p.moveToVector(null);	// 13 null �������, d=null�� ��� ���ܹ߻� = ����ó�� �ʼ�
		System.out.println(list);					// 12 ���
	}
}


