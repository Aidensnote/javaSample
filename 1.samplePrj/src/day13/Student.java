package day13;

public class Student {
	
	// 1. ��ĸ�����̼� - set get ���������� ��� �� �� ����.
	// protected = ��ӳ��� ��� ����.
	// default = ���� ��Ű�� ������ ����
	// public = ��� ����
	private String name;
	private int id;
	
	//2.������
	public Student() {
		super();
	}
	//3.�Ķ���� 2��¥�� ������
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//4. hash code �޼ҵ带 �������̵��� �̿��ؼ� equals �޼ҵ� ����.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)					// null�� �񱳺Ұ�
			return false;
		if (getClass() != obj.getClass())	// instanceof ��ſ� Ÿ��üũ.
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	//5. hashCode�� �̿��� �ߺ�üũ
	@Override
	public int hashCode() {					//�ߺ����� �������ʴ� �˰���.
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	//6. toString �޼ҵ� = display�޼ҵ� = ������ִ� �޼ҵ�. �������̵�.
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	
}
