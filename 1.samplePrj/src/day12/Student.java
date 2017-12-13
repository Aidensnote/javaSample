package day12;

import day11.prob1.Person;

public class Student extends Object {	//extends Object�����Ǿ� �ִ� ����.
	
	//1. �������� , encapsulation.
	private String name;
	private int age;
	private int id;
	
	//2. ����Ʈ �ʱ�ȭ
	public Student() {
		super();	// �����ص� �����. �θ�� Object
	}
	//3. ������ �Լ�
	public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	//4. set&get
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//13. �������̵�
	@Override
		public String toString() {
			//return "Student["+name+","+age+","+id+"]";	//14. ����� ������ ���� Ÿ��(String)�� ���缭 ����. 7���� ��ä���� = ���������� �ڵ�. String = char�� �迭. ������¡,�Һ� = ���ϸ� ��ü ���� ����.
			
			//15. String builder,String Buffer�� ����Ѵ�.
			StringBuilder sb = new StringBuilder();			
			
			sb.append("Student[");							//16. ������ ��ü�� ������ ������ �����Ѵ�.
			sb.append(name);
			sb.append(",");
			sb.append(age);
			sb.append(",");
			sb.append(id);
			sb.append("]");
			return sb.toString();							// ����ο� return Ÿ���� ��ġ.
	}
	/* �������̵�.	toString�� �̿��ϴ°� ����. String�� �����ϴ�.
	@Override
	public boolean equals(Object obj) { // �θ��� ����� �״��. objectŸ��.
		return ((Student)obj).toString().equals(this.toString()); //instanceof Ȯ���ʿ�.
	} */
	
	@Override
	public boolean equals(Object obj) { 					// 1. �θ��� ����� �״��. objectŸ��.
		if(!(obj instanceof Student))	return false;		// 2. Ÿ��üũ. ��ġ���������� false. 
			Student data = (Student) obj;					// 3. ���۾� ����.
			if(id==data.id && age ==data.age && name.equals(data.name)){	// 4. ���� �� üũ. = �������̵�.
				return true;
			}
			return false;
	}
}
	