/* �������̽��� ���߻�� */
package day14;

public class Test01 {
	public static void main(String[] args) {
		AA a = new AA();	//11 ��ü����.
		BB b = new BB();
		// a = b;	12. Ÿ�Ժ���ġerr. �׷��� �θ�Ÿ���� ���.
		
		A c = new AA();	//13. �θ�Ÿ������ �Ǵ� ���� AA, BB�Ѵ� ����.
		c = new BB();
		// c. 14. ������ �θ�Ÿ���� ���Ƽ� ����(�ڵ鸵) �����. = ���� �ʿ�.
		I d = new AA();	//13. �θ�Ÿ������ �Ǵ� ���� AA, BB�Ѵ� ����.
		// d. ��ΰ���.
		
		A[] aaa = { new AA(), new BB() };	//17 �� �θ��� Ÿ��.
		B[] bbb = { new AA(), new BB() };
		C[] ccc = { new AA(), new BB() };
		I[] iii = { new AA(), new BB() };	// extends�� Ÿ�� ���ս�Ų I�� implement. = ��� �� �� �ִ�.
		
		for(int i=0;i<aaa.length;i++){		//18 Ȯ�� for(){}
			aaa[i].a();	//a��				//19 ������ �θ�Ÿ���� ��� ������ �ڿ��� Ȱ��ȴ�.
			bbb[i].b();	//b��
			ccc[i].c(); //c��
			
			/* ��� ���� */					//20 Ÿ�� ������ ��Ų I�� implement�� ��� ��� �ڿ� �ڵ鸵 ����.
			iii[i].a();
			iii[i].b();
			iii[i].c();
			
		}
	}
}


//class AA extends Object implements A,B,C{ //7 extends ��������, �̿ϼ��Ǹ� �ȵ�=�߻�޼��� �� ����.
class AA extends Object implements I{ // 16 ���յ� I�� implement �ϳ��� �ϸ� �ȴ�.

	@Override	//8
	public void a() {	}
	
	@Override	//8
	public void b() {	}

	@Override	//8. �������̵�
	public void c() {	}
		
}


//class BB extends Object implements A,B,C{ //9
class BB extends Object implements I{ // 16 ���յ� I�� implement �ϳ��� �ϸ� �ȴ�.

	@Override	//10
	public void a() {	}	
	@Override	//10
	public void b() {	}
	@Override	//10
	public void c() {	}

	
}


/* �������̽� */
interface A{	//1
	void a();	//2 �߻�޼ҵ�
}
interface B{	//3
	void b();	//4 �߻�޼ҵ�
}
interface C{	//5
	void c();	//6 �߻�޼ҵ�
}


/* �������̽� ���߻�� ��Ƽ�̳ʸ��Ͻ� */
interface I extends A,B,C{ //15 I �ȿ� A,B,C��� �߻�޼ҵ带 ����. extends = ABC�� ���� ����.
	
}


