package day2;

public class Prob1_test0 {

	public static void main(String[] args) {
		System.out.println(1+2); // ���п��� 3
		System.out.println('1'+'2'); // �ƽ�Ű�ڵ� 99
		System.out.println("1"+"2"); // string 12
		System.out.println("~~ "+1+2); // string ~~12 (�յ� ���� �����ϱ� ���� string ��ȯ)
		System.out.println(1+2+"~~"); // �տ� ���� ���� ���� ��� 3�� string�� ~~
		System.out.println("Hello"+"java"+'!'); //HelloJava! ��� String ��ȯ.

		
		int $ystem = 0 , /* num#5 = 0, 7num = 0 ,*/ �ڹ� = 0 , /* new = 0, */  
					new_ = 0 , $MAX_NUM = 0 /*hello@com = 0*/;   
		
		System.out.printf("%d,%d,%d,%d %n",$ystem,$MAX_NUM,new_,�ڹ�);
	
		//byte b = 256;			- byte�� �ִ밡 127 ���Ĵ� -128
		//char c = '';			- char�� �������� ' ' ���� �Ѱ��� ���� ������(�����̽�����)
		String answer = "no";	//- char�� �������� ' ' ���� �Ѱ��� ��, ���ڹ����� ��� String�� ���.
		//float f = 3.14;		- float�� �������� �Ҽ��� ���ڿ� f�� ����Ѵ�.
		double d = 1.4e3f;
		System.out.println(d);
		
		
		
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65 
		System.out.println(y >= 5	||	 x < 0 	&& 	x > 2); //true||false�̹Ƿ� true ���.
		System.out.println('A' <= c && c <='Z'); // true�� ���.
		System.out.println( !('A' <= c && c <='Z') ); // true&&true�̹Ƿ� true, �տ� !�� false ���.
		System.out.println('C'-c); // 67-65                        
		System.out.println('5'-'0'); // ���� int�� 5                  
		System.out.println(c+1); // c='A'=65, +1 ���� ��� 66
		System.out.println(++c); // ++c�� �켱 +1�� ���Ѱ��� ���. 67=B
		System.out.println(c++); //	c++�� ��� �� +1�� ���� ���� ����. 67=B 
		System.out.println(c); // ������ ++1 �Ǽ� 68=C
		// c+1�� intŸ������ ��ȯ�ؼ� �����ϰ� ���, ++c�� ���� �����ϹǷ� �״�� char��Ÿ������ ��µȴ�. 
	}
}