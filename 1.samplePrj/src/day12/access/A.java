package day12.access;

public class A {
	/* ���ټ� ���� Ȯ�� */
	public String name1 = "A";			//public	��� ����
	protected String name2 = "A";		//protected �ٸ� ��Ű���� �ִ��� ����̶��
	String name3 = "A";					//default	���� ��Ű�� ����
	private String name4 = "A";			//private
	

}

class B{
	A a;	//AŸ�Կ� a����.
	void print(){
		System.out.println(a);	//same class���� ���̶� name4�� �Ⱥ���.
	}
}