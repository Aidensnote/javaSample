package day2;

public class P95 {

	public static void main(String[] args) {
		//char x = 'a'; x�� �ʱ�ȭ
		//int y = 7 + 8 * x;  int*char, char->�ƽ�Ű�ڵ尪 ���θ��.
		//System.out.println(y);
		
		//double y = 7 + 8 * x;  int*char, char->�ƽ�Ű�ڵ尪 double���θ��.
		//System.out.println(y);
		
		float x = 'a'; //x�� �ʱ�ȭ
		double y = 7 + 8 * x;
		System.out.printf("y= %10.2f %n",y); // �տ� ��ĭ�ڸ���&�Ҽ��� 2������
		
		int i = 5, j = 5;
		System.out.println(i>j); // ������ ���̹Ƿ� false.
		System.out.printf("i>j = %b %n",i>j); // �񱳿����� ����� ��� ����� true&false�� ���.
		System.out.printf("i= %d,j= %d %n",i,j); // �ش� ���� int�̹Ƿ� %d
		System.out.printf("i= %d, j= %d : i==j => %s %n",i,j,i==j);
		System.out.printf("i= %d, j= %d %n",i,j);
		
		//System.out.println(i++); // 5 ��� �� ����
		//System.out.println(++i); // 6 ���� �� ���
		System.out.printf("i= %d,j= %d %n",i,j);
		
		int sum = 100;
		sum = sum+ (int)y; // y�� ����Ÿ���̹Ƿ� ��ȯ �� ����.
		// sum += (int)y; ������Ű�� �����
		System.out.println(sum);
		System.out.println(sum%10); // 10���� ���� ������ �� ���. (���� �ƴ�)
		System.out.println(sum/10); // 10���� ���� �� ���.
		
	}
}