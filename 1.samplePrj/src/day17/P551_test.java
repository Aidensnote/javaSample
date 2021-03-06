package day17;

import java.io.File;
import java.text.MessageFormat;
import java.util.Scanner;

public class P551_test {
	public static void main(String[] args) {
		String tableName = "CUST_INFO";
		String fileName = "data4.txt";
		String msg = "INSERT INTO"+tableName+"VALUES ({0},{1},{2},{3});";	// insert문을 file기반으로 제작.
		String pattern = "{0},{1},{2},{3}";
		MessageFormat mf = new MessageFormat(pattern);
		
		try(Scanner s = new Scanner(new File(fileName))){
			while(s.hasNextLine()){
				String line = s.nextLine();
				Object[] objs = mf.parse(line);
				System.out.println(MessageFormat.format(msg, objs));
		}
		
		
		
			
		}
		s.close();
	}
}
