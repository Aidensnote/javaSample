/* heap�������� static ������ ����� ����. - �ν��Ͻ� �ڿ��� �ǵ��� �� ����.*/
package day7;

public class Calc {
	
	/* instance method = new�� �ؾ���. = ��ä�� �޸𸮿� ������� */
	public static int add(int a, int b){ //���� 2���� ���ϴ� �Լ�=�Ű�����(��ǲ�Ķ����) 2�� �ʿ�. void=�����x
		return a+b; //����Ÿ�԰� ���ϸżҵ��� Ÿ���� �����ؾ��Ѵ�. return�� ������ return;�� ������ �Ȱŷ� ����. return & void ���� �ϳ�.
	}
	/* �ߺ�-���������� ����� �����Ƿ� err
	public int add(int a, int b){ //���� 2���� ���ϴ� �Լ�=�Ű�����(��ǲ�Ķ����) 2�� �ʿ�. void=�����x
		return a+b; //����Ÿ�԰� ���ϸżҵ��� Ÿ���� �����ؾ��Ѵ�. return�� ������ return;�� ������ �Ȱŷ� ����. return & void ���� �ϳ�.
	}
	*/
	public static int sub(int a, int b){
		return a-b;
	}
	public static int multi(int a, int b){
		return a*b;
	}
	public static int div(int a, int b){
		return a/b;
	}
}
