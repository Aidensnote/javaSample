package day3;

public class P130 {
	public static void main(String[] args) {
		int jumsu = 99; //��ȿ�� �˻翡�� err. if�� ��ȿ�� �˻縦 ����.
		
		if(0 <= jumsu && jumsu <= 100){
			String result = (jumsu>=80)? "Pass":"No Pass"; // true�� ��� ����ϸ�, else�� �����ϰ� �Ʒ� ����.
			System.out.println(jumsu+" : "+result);

		}else{
			System.out.println("���� ����=> Ȯ���ϼ���"); // false�� ����ϰ� �Ʒ� ����.
		}
		
		
		
		
		//char c = 0 <= jumsu && jumsu <= 100 ? 'O':'X' ; // charŸ�� c�� jumsu �������� ���̸� O, �ƴϸ� X
		//����: jumsu >=80 "pass" , �׷��� ������ "no pass"
		String result = (jumsu>=80)? "Pass":"No Pass";
		System.out.println(jumsu+" : "+result);
		
		//String d = 0 <= jumsu && jumsu <= 100 ? "O":"X" ; // StringŸ�� c�� jumsu �������� ���̸� O, �ƴϸ� X	
		int i = 100, j=200;
		int max = ( i > j ) ? i : j ; // �μ� �� ū ���� max�� ��.
		System.out.println("MAX : "+max);
		System.out.println("MAX : "+(( i > j ) ? i : j)); // ����ϴ� ���� ���� data�� max�� �ƴ� 3�׿����� Ȱ��.	
	}
}