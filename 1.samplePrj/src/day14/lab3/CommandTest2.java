/* Ŭ���� ���Ӹ����� ��� ���� if&switch ���� �Ⱦ��� ó�� */
package day14.lab3;

public class CommandTest2 {
	public static void main(String[] args) throws Exception{ //4 �����ͺ��̽� �����Ҷ� �غ�. L8�� args�� Ŭ���������� �ްڴٴ� �ǹ�.
		Command cmd = null; // 1

		Class cls = Class.forName(args[0]);	//3 args[0]���� ���°���
		cmd = (Command) cls.newInstance();	//4 ��ü ����
		
		cmd.exec(); // 2

	}
}

// throws Exception�� �������� �ڵ� �����̹Ƿ� �����ؾ��Ѵ�. "����ó��"