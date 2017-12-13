package day20;

import java.util.HashMap;
import java.util.Map;

public class Test03 {
	public static void main(String[] args) {
	
		if (args.length == 0) {					//1
			System.out.println("delete update select insert 중 하나를 입력하세요.");
			return;
		}
		
		Map<String, Command> map = new HashMap<>();	//1
		map.put("delete", new DeleteCommand());	//2
		map.put("select", new SelectCommand());	//2
		map.put("update", new UpdateCommand());	//2
		map.put("insert", new InsertCommand());	//2
		
		Command command = map.get(args[0]);
		if(command == null){
			System.out.println(args[0]+"기능은 지원 되지 않습니다.");
			return;
		}
		command.exec();
	}
}
