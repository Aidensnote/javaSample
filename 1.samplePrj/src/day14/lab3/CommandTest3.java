/* Ŭ���� ���Ӹ����� ��� ���� if&switch ���� �Ⱦ��� ó�� */
package day14.lab3;

public class CommandTest3 {
	public static void main(String[] args) throws Exception{ //4 �����ͺ��̽� �����Ҷ� �غ�. L8�� args�� Ŭ���������� �ްڴٴ� �ǹ�.
		Command cmd = null; // 1

		cmd = new day14.lab3.DeleteCommand(); // ���� ����� Ÿ��. �ѹ� �޸𸮿� �ö󰡼� ���� �����ǹ��� ���. �������� �ƴ϶� ��Ÿ�ӿ� �����Ǳ� ���ϴ� �Ķ���ʹ� String type���̹Ƿ� �Ұ���.
	
		
		Class cls = Class.forName(args[0]);	//3 args[0]���� ���°��� forname Ŭ������ �̸��� String���� �Ѱܹ޴°�.=Ŭ������ �޸𸮸� ��Ÿ�ӿ� �����ϱ� ���ؼ�.
		Class cls1 = Class.forName("");		// ��Ÿ�ӿ��� �޸� �ּҰ� �����Ǳ� ������ �����Ͽ��� �������� ���Ѵ�.
		Class cls2 = Class.forName("day14.lab3.DeleteCommand");	// ��Ÿ�ӿ� ����. ���� ���� �߻�. ���� ���ε�.
		Class cls3 = Class.forName("day14.lab3.UpdateCommand");	// 
		Class cls4 = Class.forName("day14.lab3.DeleteComman");	// ��Ÿ�ӿ� ���� �ǹǷ� ��Ÿ�� ���� Ȯ�� �Ұ���.
		cmd = (Command) cls.newInstance();	//4 ��ü ����
		
		cmd.exec(); // 2

	}
}

// throws Exception�� �������� �ڵ� �����̹Ƿ� �����ؾ��Ѵ�. "����ó��"