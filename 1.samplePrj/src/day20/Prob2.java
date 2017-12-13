package day20;

import java.util.Iterator;
import java.util.Vector;
import day12.Student;

public class Prob2 extends Object {		//1 Ŭ���� ����: ������ ������� ����. -����� ����: ��ӿ���, �������̽���������.
	Student s1;							//2 ������ Ÿ�� ����+������. �ۺ��ϱ� ������ import�� ���.
	Vector<Integer> nums;
	
	


	public Prob2() {
		super();
	}
	
	public Prob2(Vector<Integer> nums) {
		super();
		this.nums = nums;
	}

	public Prob2(Student s1, Vector<Integer> nums) {
		super();
		this.s1 = s1;
		this.nums = nums;
	}

	public void print(){	//3 �޼���=���. void = ���ϵڿ� ������ x. 
//		System.out.println("~~~~1");	// ������ �Ʒ��� ó���ȴ�.
//		System.out.println("~~~~2");	// �ݺ�= �ݺ�ó���� for()
//		System.out.println("~~~~3");	// ��ŵ = ��� if()
		
		if(s1 !=null){					// 8 ����
			System.out.println("s1");	//
		}
		if(nums != null){ 				// 8 ����
			System.out.println("nums");	 
		}
		return;
	}
	
	
	/** ����ȭ�� ���� �ּ�
	 * 
	 */
	public int sum (){	//4 ���ϰ� ���� = return�ڿ� ������� int�� �ʿ�
		int sum=0;		//6 ���� ������ؼ� �켱 ����.
		
		Iterator<Integer> it = nums.iterator();	//���ʸ����� ����=iterator
		while (it.hasNext()) {					//��ȸ=while
			Integer d = (Integer) it.next();	//integer�ε� int�� �����ϴµ� ����x = ����ڽ�
			sum +=d;
		}
		return sum;		//5 ���ϰ��� �켱 ����
	}

	@Override
	public String toString() {
		return "Prob2 [s1=" + s1 + ", nums=" + nums + "]";
	}
}