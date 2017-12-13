/* ���յ� �ڵ鸵�� ���� = ���ϵ� ��� (��������) = �������̽�  */
package day14.lab2;

public class TVTest02 {
	public static void main(String[] args) {
		
		/* �������̽��� Ÿ���� ��ġȭ ��Ų�� LTV, STV ��� ȣ�� �����ϴ� */
		// ����� = ����ü, ����ü�� ���� ������ �ȴ�.
		TV user = new LTV(); //5 TVŸ�� = �������̽�
		user.poweron();
		user.poweroff();
		System.out.println("=======================");
		
		TV user1 = new STV(); //5 TVŸ�� = �������̽�
		user1.poweron();
		user1.poweroff();
		System.out.println("=======================");
		
		
		/* ������ key ���� ���� ����ü�� ���ϴ� ���� = ����(��Ȳ)�� ���� ��ü ���� = SPRING���� ���� */
		TV user2 = null;
		if(args[0].equals("p")){
			user2 = new PTV();
		}else if(args[0].equals("s")){
			user2 = new STV();
		}else{
			user2 = new LTV();
		}
		user2.poweron();
		user2.poweroff();
	}
}




interface TV{	//1. �߻�޼ҵ�, ���̳� ����ƽ ������� ����. �������̽� ����.
	void poweron();		//2. ���� �Ӷ� ��ġ�� �޼ҵ�
	void poweroff();	//2. ���� ���� ��ġ�� �޼ҵ�
}




class LTV implements TV{	//3 ���� ����� ������ Ŭ����

	@Override		//4 ������ �������̵�.
	public void poweron() {
		System.out.println(getClass().getSimpleName()+"poweron()");	//getClass.getName = ���̸�
		
	}

	@Override		//4
	public void poweroff() {
		System.out.println(getClass().getSimpleName()+"poweroff()");	//getClass.getName = ���̸�
	}		
}

class STV implements TV{	//3 ���� ����� ������ Ŭ����

	@Override		//4
	public void poweron() {
		System.out.println(getClass().getSimpleName()+"poweron()");
	}

	@Override		//4
	public void poweroff() {
		System.out.println(getClass().getSimpleName()+"poweroff()");
	}		
}
class PTV implements TV {	//3 ���� ����� ������ Ŭ����
	
	@Override		//4
	public void poweron() {
		System.out.println(getClass().getSimpleName()+"poweron()");
	}
	
	@Override		//4
	public void poweroff() {
		System.out.println(getClass().getSimpleName()+"poweroff()");
	}		
}


/* ���� ����� ���� TV = implement�� �������� ���
class PTV {	
	
	@Override		//4
	public void poweron() {
		System.out.println(getClass().getSimpleName()+"poweron()");
	}
	
	@Override		//4
	public void poweroff() {
		System.out.println(getClass().getSimpleName()+"poweroff()");
	}		
}
 */