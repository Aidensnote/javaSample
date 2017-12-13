package day14.lab3;

public class CommandTest {
	public static void main(String[] args) {
		Command cmd = null; // 1

		
		/* 기능 구현 - 삭제와 등록의 기능 구현 위한 조건 = 기능 추가 => 코드변형 발생 = 확장이 불편함.
		if (args[0].equals("delete")) {
			cmd = new DeleteCommand();
		} else if (args[0].equals("update")) {	//8. 기능 구현을 위해서 수정이 불가피.
			cmd = new UpdateCommand();
		} else {
			cmd = new InsertCommand();
		}
		기능 확장이 어렵다.*/

		cmd.exec(); // 2
		cmd.newMethod();
	}
}
