package day10;

public class Test02 {

	public static void main(String[] args) {
		Fish f = new Fish();
		f.breath();						//�������̵� ������ ���� Ȯ�� �� �������̵� �����ϸ� �����.
		
		Animal ff = new Fish();			//�θ�Ÿ������ ����.
		ff.breath();					//���� �޼��带 ȣ���ص� �ڽ� �޼��尡 ȣ���.
	
		Animal a;						// ���� �ϳ��� animal,dog,fish ��� ��ü�� ���� �� �ִ�.
	}
}