/* ���ٽ� ���� */
package day20;

public class Test06 {
	public static void main(String[] args) {
//		F1 f = null;	//6 ���� ����
//		f.max(44, 99);	//5 �ּ� ���ε� �ʿ�
		
		
		
		F1 f1 = new F1(){				//7. �͸� Ŭ������ �ڵ鸵

			@Override
			public int max(int a, int b) {
				return a > b ? a : b;	//8. ū�� ã�� 3�׿�����
			}
		};
		System.out.println(f1.max(44, 99));	//����
		
		
		
		F1 f2 = (int a, int b)->{			//9. ���ٽ�
			return a>b?a:b;					//10. ����Ÿ���� ()�ȿ� Ÿ�԰� ��ġ��Ű�� ����� �޼ҵ带 �ִ´�.
		};
		
		F1 f3 = (int a, int b)->a>b?a:b;	//11. �޼ҵ尡 ������ ��� return. {} ��������.
		
		
		System.out.println(f2.max(4, 9));	//����
		System.out.println(f3.max(8, 10));
		
		
	}
}

@FunctionalInterface		//2 ��ų� �������̽� = 1�� �ʿ�.
interface F1{				//1 ���ٽ� = �������̽� �ڵ鸵
	int	max(int a, int b); 	//3 ����Ÿ���� �ִ� �߻�޼ҵ� = ū�� ��.	
}

//4. Ŭ���� & �͸�Ŭ���� & ���ٽ����ε� ���� ����