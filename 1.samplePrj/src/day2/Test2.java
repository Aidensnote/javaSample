package day2;

import java.util.Date;
//import java.sql.Date; �̸��� �����Ƿ� �ΰ� �� �ɼ� ����. �Ѱ����� full path�� �ɾ�����Ѵ�.

public class Test2 {
	public static void main(String[] args) {

		Date now = new Date(); //java.lang�� Date�� ����. java.util�� �ְ�, Date�� ���۷���.
		System.out.println(now);
		
		/* ���۷��� ��ä���� (.���丮 ����) */
		System.out.println(now.getYear()); // ��ü�Ȱ� �־ ���� '����������Ƽ��api'
		
		//Date today;
		//�ʱ�ȭ �ʿ� System.out.println(today);, null�� �ʱ�ȭ ��Ų��.
		java.sql.Date today = null; // ���� �ٸ� full path ����.
		System.out.println(today); // null�� ���丮�� �����Ƿ� .�� ������� �ʴ´�. null type exception.
		
		now = null; //�̰ŷ� ����� �޸𸮸� �������� �����ؼ� �ڸ���.
	}
}