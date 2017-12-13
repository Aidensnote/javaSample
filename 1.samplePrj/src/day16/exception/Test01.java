package day16.exception;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("main start");	// 1

		String name = null;					// 2
		if(name !=null && name.length()>0)	// 3 ���� �̷���� exception�� ó���ϴ°��� �ƴ϶� if�������� null point�� ��´�. ��� ���ܸ� trycatch�� ó�������ʴ´�. 
		System.out.println(name.charAt(0)); // 2 unchecked exception (nullpoint) �߻�. 
		
		try {
			Class.forName("day16.exception.Sample");		//4. trycatch�ʿ�. fullpath�� �ʿ�.
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("Ŭ���� �̸� Ȯ�� �ʿ�.");
		}
		
		System.out.println("main end");		// 1

	}
}


class Sample{ //5 ����Ŭ���� ���� = ��Ű�� ������ �ʿ�. ���� ���� ����.
	
}