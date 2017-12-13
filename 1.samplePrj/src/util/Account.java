// ���¹�ȣ  , �ܰ�  , �Ա� , ���, ������ü, �����������
package util;

public class Account {
	//Ŭ���� ���� = ������, �޼ҵ�
	//1. ������: ���¹�ȣ-number / �ܰ�-money
	//2. �޼ҵ�: �Ա� / ��� / ������ü
	//3. �ڵ鸵�� �����Ϳ� �޼ҵ忡 ���� �з�&��Ƽ� �����Ѵ�.  
	
	String name;	//�̸�
	String num;		//���¹�ȣ
	int money;		//�ܰ�
	
	/*������ �Լ�*/
	public Account(){}
	public Account(String name,String num, int money){
		/* �ʱ�ȭ �۾� */
		this.name = name;
		this.num = num;
		this.money = money;
	}
	
	/* �Ա� ��� �޼ҵ� */
	public void deposit(int money){
		this.money += money;
		System.out.println("�Ա�: "+money+" �ܰ�: "+this.money); //this.money�� �Ϲ� money�� ����
	}
	
	/* ��� ��� �޼ҵ� */
	public void withDraw(int money){
		if(money>this.money){ //��ݱݾ��� �ܾ׺��� ū�� ��ȿ�� �˻�
			System.out.println("���� �ڵ� �ܰ����");
			return; //���� ���ϰ� �ٽ� ������. 
		}
		this.money -= money;
		System.out.println("���: "+money+" �ܰ�: "+this.money);
	}
	
	/* �ܰ� ��ȸ �޼ҵ� */
	public void display(){
		System.out.println("�����ȣ: "+num+","+name+" �ܰ�: "+this.money);
	}
	
	/* ������ü �޼ҵ� */
	/* �޼ҵ�� �ּҰ� �ʿ���=�ν��Ͻ� �޼ҵ� */
	public void transfer(Account to,int money){ //(Account ����) �ʿ�. (from,to,������) ���� �ʿ�.
		if(to == null){	//������ü�� ���¹�ȣ�� ��ȿ���� Ȯ��
			System.out.println("�������� Ȯ���ϼ���.");
			return;
		}
		if(this.money < money){ //�ܾ� ������ ����.
			System.out.println("�ܰ����");
			System.out.println("������ü����");
			return;
		}
		System.out.println("��� ���� ����");
		display();	//������� ����
		System.out.println("�Ա� ���� ����");
		to.display();	//�Ա����� ����
		System.out.println("---- ������ü ������ ----");
		withDraw(money);	//withDraw=���,this.withDraw,	from���忡�� ���
		to.deposit(money);		//deposit=�Ա�,this.deposit,		to���忡 �Ա�
		System.out.println("---- ������ü  �� �� ----");
	}
	/* ������ü �޼ҵ� */
	/* �޼ҵ�� �ּҰ� �ʿ���=�ν��Ͻ� �޼ҵ� */
	public void transfer(Account from, Account to,int money){ //(Account ����) �ʿ�. (from,to,������) ���� �ʿ�.
		if(from.money < money){
			System.out.println("�ܰ����");
			System.out.println("������ü����");
			return;
		}
		System.out.println("��� ���� ����");
		from.display();	//������� ����
		System.out.println("�Ա� ���� ����");
		to.display();	//�Ա����� ����
		System.out.println("---- ������ü ������ ----");
		from.withDraw(money);	//withDraw=���,this.withDraw,	from���忡�� ���
		to.deposit(money);		//deposit=�Ա�,this.deposit,		to���忡 �Ա�
		System.out.println("---- ������ü  �� �� ----");
	}
}
