package day4;

public class Test2 {
	public static void main(String[] args) {
		System.out.println(day4.Test1.Pi); // ���� ��Ű�� �ȿ� �ִ� Ŭ�������� ��θ� �������ָ� new�� �����ʾƵ� static�޸𸮴ܿ��� ��� �����ϴ�.
		System.out.println(Test1.Pi); // ���� ��Ű���� ��Ű�����丮�� �����ص� �ȴ�. 

		System.out.println(Byte.MAX_VALUE); // �ڹٿ��� �����ϴ� class. (java.lang.)Byte.MAX_VALUE �������ִ� ����.
		
		System.out.println(Math.PI); //MathŬ�����ȿ� pi���� �̹� �����ϰ� ����. 
	}
}