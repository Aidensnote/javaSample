package day2;

public class P28 {

	public static void main(String[] args) {
		// float f = 55.8; err
			float f = 55.8f;
			System.out.println(f); 
			System.out.printf("f= %f",f); // P36�� �����ȣ
			System.out.printf("f= %5.2f",f); //  %d���� %f�Ǽ� %s����
			System.out.println("f= "+f);// ��������
			System.out.printf("f= %5.2f %n",f); // (%n �ٳѱ��)
			System.out.println("==========="); // (������)
			System.out.println(5/2); // ����������
			System.out.println(5/2+","+(5/2.)); // �������� "" �Ǽ�����
			// byte b =128; err
			byte b = (byte)128;
			//b=b+1; err Ÿ�Ժ���ġ.
			/*
			b=(byte)(b+1);
			System.out.println(b);
			char c = 'A'; //''���̿� �� ������ �Ұ�.
			System.out.println(c);
			int n = 'c';
			System.out.println(n);
			char r = '0'; //''���̿� �� ������ �Ұ�.
			System.out.println(r);
			*/
			
			
			char c = 'A';
			System.out.println(c+","+(int)c);
			int n = c+1;
			System.out.println((char)n+","+n);
			
			

	}

}
