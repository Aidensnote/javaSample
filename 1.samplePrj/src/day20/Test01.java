package day20;

import java.util.List;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
		Student<String,Double> s1 = new Student("",6);			//5 ��ä�� ����	. <String,String>�� ����.		//10 <String,Double> ����Ŭ������ ���ش�. = ����ڽ�
		Student<String,Integer> s2 = new Student("",3);			//6 int�� integer�� ���� <String,integer(=int)> 
		
		List<String> l;					//7
		List<String> l2;
		
		
		Map<String, Student> m;			//8
		
		
		
		
		
		
		
	}
}


class Student<T,V extends Number> {				//1.Ŭ���� ����	//3 ���ʸ� ����		//9 Ÿ������ = �� �� ����.
	T name;
	V avg;						//2 ���� Ÿ�� ������ �����. double & int => ���ʸ�. ��Ÿ�ӿ��� ����. ObjectŸ���� ��� ����.
	
	public Student() {	}		//4 ����Ʈ+������+toString
	public Student(T name, V avg) {
		this.name = name;
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", avg=" + avg + "]";
	}
	
	
	
	
	
	
}