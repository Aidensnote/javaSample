package day3;

public class Prob1_result {
	public static void main (String[] args){
		
		/*char c = 'a', d = 'A';
		System.out.println(c+" "+(int)c+" , "+d+"  "+(int)d); //�ƽ�Ű �ڵ尪 ��¹�
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));  �ҹ���-�빮�� ��Ģ Ȯ�� (�ƽ�Ű �ڵ� ���� ���� Ȯ��)
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));  �빮��->�ҹ��� +32
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));  �ҹ���->�빮�� -32
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));  for & while�� �ݺ��� �����Ѵ�.
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++)); */
		
		char ch = 'P';
		// char lowerCase = (ch+32); add casting�ʿ�
		// char lowerCase = (char)(ch+32); ��� ��Ģ�� ����Ǳ� ������ �빮���� ����� ���ǽ��� ������Ѿ� �Ѵ�.
		char lowerCase = ('A'<=ch&&ch<='Z') ? (char)(ch+32) : ch; // ('A'<=ch&&ch<='Z') �빮�ڸ� Ȯ���ϴ� ���ǽ�, ���θ���� �ڵ������� �۵�. char<->int
		System.out.print("ch:"+ch);
		System.out.println(" to lowerCase :"+lowerCase);
		System.out.println(" ========================= ");
		
		int num = -90; // int = ����/0/���, ������ �ּ� 2�� �ʿ�. ���ǽ� ? ���������� : (������ ������)
		String result = null; // �Ǻ��� ������� �� ���� ���� �ʱ�ȭ ����. �ּ���-null, ����ó���� ����.
		// result = () ? : ; �⺻�� ����
		// result = (num>0) ? "���" : ; 1�� ���� ����
		// result = (num>0) ? "���" :() ? : ; 2�� ���� ����
		result = (num>0) ? "���" : ((num<0) ? "����" : "0") ; //2�� ���� �ϼ�
		System.out.println(num+" : "+result);
		
		
		
	}
}
