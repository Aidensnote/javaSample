/* unchecked / checked ���� */
package day15.exception;

public class Test02 {
	public static void main(String[] args) {
		
		try{		//6
			Thread.sleep(5000);	//5. 1000:1�� �� 5�� ���� checked exception. try/catch�� ���ζ�� ����.
		}catch (InterruptedException e) {		//7
			e.printStackTrace();
		}
		
		System.out.println("START"); //3
		String name = null; //1
		if(name != null) //8 ���� null pont�� if�� ��´�.
			System.out.println(name.toString());	//2 name ���� .toString �߻�-�ּ�����. unchecked exception.
		

		System.out.println("END"); //4
	}
}
