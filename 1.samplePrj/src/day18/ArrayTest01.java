package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ArrayTest01 {

	public static void main(String[] args) {
//		Student s = null; �л� ��ü �Ѱ�					//6

//		Student[] s = new Student[100]; �л� ��ü 100��		//7
//		s[0] = new Student();			�迭�� ��� index�� �ڵ鸵. ������ ���������� count�� �����ǰ� �� ������ null�� ���Եȴ�. �迭�� ������� �ڵ鸵�� ���� �߻� ���ɼ� ����(������Ʈ�ͼ���), �迭�� ��� �����, �߰� ������ ������ ����� = api ���� �����.


		
		
		List<Student> list = new ArrayList<Student>();			//29 ��� ��ü�� �θ��� Ÿ�� ����.
//		List<Student> list = new Vector<Student>();				//30 vector�ε� �����ϴ�. ��ũ�γ�����尡 �ɷ��ִ�.
//		ArrayList<Student> list = new ArrayList<Student>();		//8 ���ʸ�. object�� �ǵ��� ���Ѵ�. ���������� Student��ü ��Ƽ� �ڵ鸵. ���� object. collection�� Ÿ���� �ڵ鸵.
		list.add(new Student("�浿��",90,99)); 					//9 ���, StudentŸ�Ը� ����. �ߺ������. 
		list.add(new Student("�达",80,99)); 					  
		list.add(new Student("��",70,99)); 					 
		list.add(new Student("�ھ�",99,99));
		System.out.println(list);
		System.out.println("===================================");
		
		list.remove(0);											//10 ����(��ġ�ε���) 0��° �迭�� �����ǰ� �������� ������� �迭�� ũ�Ⱑ �����ȴ�.
		System.out.println(list);
		System.out.println("===================================");
		
		list.remove(new Student("�浿��",90,99));					//11 ����(object=�ּҰ� �ʿ���) = ������.
		System.out.println(list);
		System.out.println("===================================");
		
//		list.remove(list.get(2));								//12 ����(get�޼ҵ带 �Ἥ �ּҸ� ����), index�� ��� �ľ��ϱ� ����⿡ index�� �ڵ鸵�ϱ⿣ ������ ����.
//		System.out.println(list);								// �ߺ����� �ʴ� �� = [�����̸Ӹ�Ű] ������ �ʿ��ϴ�.
		System.out.println("===================================");
		
		//���ó�� = ��ȸ = for(){}. set = ��ġindex����= for(){}�Ұ�.
		
		
//		int delindex = -1;					//17
//		for(int i=0;i<list.size();i++){
//			Student data = list.get(i);		//13. data ������ avg�޼ҵ� ���ԵǾ�����.
//			data.avg();						//14. ��� �ּ�(data[i])�� ���� ������ �޼ҵ�(avg)�� �����ؼ� ����.
//			list.remove(i);					  15. remove�� �ϴ� ���� size�� �پ���, ����� �� �ڵ鸵�� ����� = for(){}�� ���� �۾��� ����. 
//			System.out.println(list.size());
//			
//			if(data.name.equals("�浿��")){	//16 ������ ������
//				delindex = i;
//			}
//		}
//		list.remove(delindex);				//18 ������ �ϳ� ����.
		System.out.println(list);
		System.out.println("===================================");
		
		
		
		//��ġ index�� ���¾ֵ� = ��ȸ�ϱ� �����.
//		for(Student data :list){			// 19 list ��� �迭,�ݷ��� ��� ����. ���������� �۵�. ��ȸ��,��¿����θ� ����Ѵ�. �����Ͱ� �ٲ��� �ʴ´�. = set������ ��ȸ�ϱ� ������� for(){}.
//			System.out.println(data);
//			data.avg();
//			list.remove(data);				   20 ������ �ٸ� ������� ����ؾ��Ѵ�. ���ܹ߻�.
//		}
//		System.out.println(list);
//		System.out.println("===================================");
//		
//		
		Iterator<Student> it = list.iterator();	// 21 ��ü���� ���� �����.
		while(it.hasNext()){					// 22 Ư�� ��Ұ� �ִٸ� = �����Ͱ� �ִ��� Ȯ��
			Student data =it.next(); 			// 23 �����Ͱ� ������. data�� ����.
			data.avg();
			if(data.name.equals("�浿��")){		// 25 �������� ("�浿��")
				it.remove();					// 26 ����.
			}
//			it.remove();						// 24 ��� ������
		}
		System.out.println(list);
		
//		System.out.println(list.contains(new Student("��",90,99)));		//25. contain = �ִ��� ������ ��. �����ϳ� true�� ��µ��� ����.
//		System.out.println(list.contains(new Student("�浿��",90,99)));	//26. ������ ������ false�� ���. = ������ �ľ�. = Student��ü�� equals�޼ҵ尡 �������̵� �������Ƿ� �񱳴ɷ� ����.
		
		
//		Arrays.sort(list.toArray());				//32 ��� �迭�� ó�� ����. �迭�� ����. err �߻�.
		Object[] temp = list.toArray();				//33 ���ʸ��� �������������Ƿ� object�� �ڵ鸵.

		
//		Student[] temp = (Student[]) list.toArray();	// -1 �迭�� �ڵ鸵
		Arrays.sort(temp);								// -2

		Student[] temp2 = new Student[list.size()];		// -3 �ƿ�ǲ �Ķ����.
		list.toArray(temp2);							// -4 temp2�� ��ǲ�ƿ�ǲ�� ����.						

		
		
		Collections.sort(list);						//36 collections�� ��ƿ�ϰ� ����� �� ����.
		
		
		for(Student data : list){					//31 sort = Ÿ��, ������ ���� ������ : �ݷ��� 
			System.out.println(data);
			System.out.println("------------------");
		}
		
		
		
		
		
	}
}

class Student implements Comparable<Student>{		//5 ����θ� ���� Ŭ������ Ư¡ Ȯ�� ����.	//33 implement comparable<student>�� �߰�.
	String name;	//1
	int ko;
	int math;
	int avg;
	
	public Student() {	//3 ����Ʈ
		super();
	}
		
	public Student(String name, int ko, int math) {	//3 avg�� �����Ǵ� ���� ���ؼ� ��������� �ϴ� �������̹Ƿ� ����  
		super();
		this.name = name;
		this.ko = ko;
		this.math = math;
	}
	
	

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		long temp;
//		temp = Double.doubleToLongBits(avg);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		result = prime * result + ko;
//		result = prime * result + math;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}

//	@Override										// 27 equals�� ��� ��ü �������̵�. = ������ �ݺ� false���.
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (Double.doubleToLongBits(avg) != Double.doubleToLongBits(other.avg))
//			return false;
//		if (ko != other.ko)
//			return false;
//		if (math != other.math)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ko;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override									// 28 avg�� ����� ��ü�̹Ƿ� �����ϰ� �����ؾ��Ѵ�.
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (ko != other.ko)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {					//4 ǥ���ϰ��� �ϴ� �κи� üũ.
		return "Student [name=" + name + ", avg=" + avg + "]";
	}
	

	public void avg(){							//2 ��� ��� �޼ҵ�
		avg = (int) ((ko+math)/2.);
	}

	@Override
	public int compareTo(Student o) {		//34 ���� �޼ҵ带 �ϼ�.
		return name.compareTo(o.name);				//35 �̸����� ��.
//		return avg - o.avg;							//35 ������� ��.
	}

}