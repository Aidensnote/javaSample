/* method ���� */
package day8;

public class Calc {

	/*
	public static int add(int a, int b){	//�������� public, intŸ��,(���Ǻ�), �ݺ��� �� �ֱ⿡ static�� �߰�.
		return a+b;							// { }-�ٵ�� �����(int)�� return�� Ÿ��(int)�� �����ϰ� ��Ī.
	}
	
	// ������ �����ϰų� �Ʒ��� �����ص� �ȴ�.
	//public static void main(String[] args) { // main+ctrl+space = main method ����.
	
	
	public static int add(){ //void�� �ƴ϶� int Ÿ�� return�� �ʿ�. (���;��ϴ� �����Ͱ� ����)
		return 0; //���� �޼ҵ���� add�� �������� err�� �߻����� �ʴ´�.
	}
	/* ������ ����� ���� �̸����� �Ű����� ����
	public static int add(int a, int b){	
		return a+b;							
	}
	
	
	// Ÿ���� ������� �����ϹǷ� �ߺ�err�� �߻����� ����
	public static double add(double a, double b){	
		return a+b;
	}
	
	// �Ű����� Ÿ��,������ �ٸ� = ���� = method overloading = �ϳ��� �޼ҵ� ���� �ȿ� �������� �޼ҵ尡 ����
	public static double add(int a, int b, int c){	
		return a+b+c;
	}
	*/
	
	/**
	 * ��ť���͸� �ϴ� �ּ� ���
	 * @param a ���ϰ��� �ϴ� ������
	 * @return	�հ谡 ���ϵ˴ϴ�.
	 */
	
	/*Ÿ�԰� ���� ���̿� ������[] �迭ǥ�ø� �� ��� = ������(int)�� ������ ó�� �� �� �ִ� �޼ҵ�*/
	public static int add(int...a){	// int[] �迭�� �ּҿ�û = "int ..." intŸ������ ������ �󸶵��� a�� �����ؼ� �ذ���.
		int sum = 0;
		for(int i=0;i<a.length;i++){// ...�� ����� �𸣹Ƿ� �ݺ��� for(){}���� �;��Ѵ�.
			sum += a[i];			//...�� �迭�� ó��.
		}
		return sum;
		}
	
	/*
	public static int add(char key,int...a){ //��������(���Ҽ� �ִ�=int...a)���� �ǵڷ� �����Ѵ�.
		int sum = 0;
		for(int i=0;i<a.length;i++){
			sum += a[i];			
		}
			return sum;					
	public static int add(int[]a){		������ �迭�� ó���Ǵ°��� Ȯ�� ����
		return 0;
	}
	*/
	public static double add(double a, double b){	
		return a+b;
	}
	
	}
