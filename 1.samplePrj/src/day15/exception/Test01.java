/* unchecked exception, ������ ��� ����ó�� �ϴٰ� ������ϴ� ���� �߻��� exception���� ó�� */
package day15.exception;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("Start");	//1	//+1

		//System.out.println(args[0].length());	//2 ������ ���� err. �����Ϸ��� �ɷ����� ����. ArrayIndexOutOfBounds Exception �߻�->���� ��ü �����ؼ� ��������.->��ƾ߸� �������ᰡ ������.
		
		try{	// 3
			System.out.println("try{");	//+2
			
			System.out.println(args[0].length());	//4 �������� ����.	//+3
			int num = Integer.parseInt(args[0]);	//7	err���� NumberFormatException
			System.out.println(10/num);				//13 err���� ArithmeticException.
			
			System.out.println("}");
		
		}catch (ArrayIndexOutOfBoundsException e) {	//5 ��Ȯ�ϰ� exception�� �����ؾ��Ѵ�. �پ��� exception�� �̰� �ϳ��� ����Ƽ��� �ȵȴ�. ������ �� �������Ѵ�.	//+4
			System.out.println("���� �� �� ���� �迭 �ε��� ���");	//6 �ش� err�� �˸´� �޼��� ���.	//+5
		
		}catch (NumberFormatException e) {			//8
			System.out.println("���ڷ� �Է����ּ���.");	//9
			System.out.println(e);					//10
			e.printStackTrace();					//11
			System.out.println(e.getMessage());		//12
			
		}catch (Exception e) {
			System.out.println("~~~~~~~~~~~~~~~~~~");	// ������ ���ܴ� ��� �� �κ����� �ذ�.
		
		}finally{	// ���ܰ� �߻��ǵ� �ȵǵ� ����Ǵ� ����,��.
			System.out.println("�ڿ��ݳ��� ���⿡ ~~~~~"); //���⿡ �ڿ��ݳ� �޼����� �־���ϴ� ����.
		}
	
		
		
		System.out.println("End");		//1	//+6
	}
}
