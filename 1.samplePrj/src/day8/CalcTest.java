package day8;

public class CalcTest {

	public static void main(String[] args) {
		
		System.out.println(Calc.add(55, 77)); //132
		System.out.println(Calc.add(55, 77)==132); //����. ������� ".eqauls(������ ����)", ������ "=="
		System.out.println(Calc.add(1, 7)); //���� �ٸ��� �ؼ� add method ȣ��.
		System.out.println(Calc.add()); //add��� �޼ҵ��� �Ķ����(�Ű�����)�� ���� Ÿ���̳� ������ ������� ������.
		System.out.println(Calc.add(3.5,3.7)); //add��� �޼ҵ��� �Ķ����(�Ű�����)�� ���� Ÿ������ ������.
		System.out.println(Calc.add(3,3.7)); // int+double�� ���θ���ؼ� double+double �޼ҵ�� ����.
		System.out.println(Calc.add(55,77,99)); // �޼ҵ� �����ε� = �Ѱ��� �޼ҵ����=Calc.add()�� �������� ���(method)�� �����ϴ�.
		System.out.println("=======================");
		
		System.out.println(Calc.add(1,2,3,4,5,6,7,8,9,10)); // intŸ���̸�(=int...a) �Ű����� ���� ������� ó�� ����.
		System.out.println(Calc.add()); // �ּ�ó���� �κ��� �����ص� int...�� ������ ������ ��� ó�� ����
	}
}
