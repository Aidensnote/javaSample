package day14.lab3;

public class CommandTest {
	public static void main(String[] args) {
		Command cmd = null; // 1

		
		/* ��� ���� - ������ ����� ��� ���� ���� ���� = ��� �߰� => �ڵ庯�� �߻� = Ȯ���� ������.
		if (args[0].equals("delete")) {
			cmd = new DeleteCommand();
		} else if (args[0].equals("update")) {	//8. ��� ������ ���ؼ� ������ �Ұ���.
			cmd = new UpdateCommand();
		} else {
			cmd = new InsertCommand();
		}
		��� Ȯ���� ��ƴ�.*/

		cmd.exec(); // 2
		cmd.newMethod();
	}
}
