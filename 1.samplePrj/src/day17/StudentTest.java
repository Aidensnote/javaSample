package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student("ȫ�浿",26);	//3
//		System.out.println(s);
		
		Student[] students = new Student[100];	//4 �迭����
		int count = 0;							//5 ī���Ͱ� 100�� �Ǹ� �������� �ؾ��Ѵ�.
			
		try(Scanner scanner = new Scanner(new File("studentdata.txt"))){	//6 ()�ȿ��� closeable�� ���� �����ϴ�.
			while(scanner.hasNextLine()){	//11
				String readLine = scanner.nextLine(); // 12 ���� �о ����.
				String[] data = readLine.split("/");	//13 �ɰ���
				students[count] = new Student(data[0], Integer.parseInt(data[1]));	//14 �迭�� �ּ� ����
				count++;		//15 ī����	
			}
		
		}catch(Exception e){	//7 filenotfoundexception-�϶���.
			if(e instanceof FileNotFoundException){	//8
				System.out.println("studentdata.txt ������ �غ��ϼ���.");	//9
			}else{
				e.printStackTrace();	//10
			}
		}finally{
		
		}
		
		
		try {	//18 trycatch
			Arrays.sort(students,0,count);	//17 ������ �����Ƿ� ���� �Ұ�. �̷� ��Ģ,������ �����ϴ°� [���䷯�� �������̽�] = ���䷯�� �������̽� �����ؾ��Ѵ�.  24. ���� �迭�� �з�. student���� 0���� count����(��ü)
			
		} catch (ClassCastException e) {	//19 ��������
			System.out.println("���� ����Ű ���� �ʿ�");	//20�޼��� ���.
		}
				
		for(int i=0;i<count;i++){	//11 ī���͸�ŭ (�迭�� �� ��ŭ)
			System.out.println(students[i]);	//12
			System.out.println("-----------------------------");
//			System.out.println(Arrays.toString(students));
		}
		
		String[] i = {"j","a","f"};	//13 �迭 
		Arrays.sort(i);	//14 �迭 ����
		System.out.println(Arrays.toString(i));	//15 ���
		
		
		System.out.println("main end");
	}
}

class Student implements Comparable<Student>{	//21 ���ʸ� ����. ���ʸ��� ������ objectŸ������ ����, ���ʸ� Ȱ���ϸ� class���� Ÿ���� �ȴ�.
	String name;	//1
	int age;

	public Student() {	//����Ʈ, ������,setget,toString,hashequal.
		super();
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override	//22 ����Ű�� �������ش�.
	public int compareTo(Student o) {
//		return age - o.age;	//23 �տ��� ������ ����, ������ 0, ũ�� ���. �������� 
//		return o.age- age;	//24 �տ��� ������ ����, ������ 0, ũ�� ���. ��������

//		return name.compareTo(o.name);	// 25 ���� ������ �� name �� o���� ������� name ��. ��������. �߰��� �ʿ��ϸ� 2�� ����(0=�����̸�)�� �����ؾ��Ѵ�. intŸ�Դϴ�.
		int result = name.compareTo(o.name);	//26 ���� �߰�
		return (result!=0) ? result : age - o.age;	//27 3�� �����ڸ� Ȱ���� ���. 
		
		
		
	}
}
