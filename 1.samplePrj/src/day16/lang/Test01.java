package day16.lang;

public class Test01 {

	public static void main(String[] args) {
		Point p = new Point(1, 1);	//4
		System.out.println(p);
		p.close();					//10 �ڿ��ݳ�. null�ϱ����� �ڿ��ݳ�.
		p = null;					//5 gc���� ���� ȣ��. 9. null�� �ؾ����� �ڿ��ݳ� �̷���.
		
		
		//System.gc();				//6. gcȣ��, �޸� �������� ���� �۵���. - ������ ���� ��缭�� ����. �޸𸮰����� �۵�.
		
		
		System.out.println("main end"); //7 Ȯ��.
		

	}
}

class Point implements Cloneable{		//1					//10  �������̽� -able. implements Cloneable ���������� ��ŷ ó���� �ؾ��Ѵ�. 
	private int x;	//2
	private int y;
	
	public Point() {	//3
		super();
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	@Override	//�ߺ�, ���� ��.
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "point [x=" + x + ", y=" + y + "]";
	}
	@Override
	protected void finalize() throws Throwable {	//�ڹٿ��� ���� ���x
		super.finalize();
		System.out.println(getClass().getSimpleName()+"finalize() ����");		//8 �Ҹ���
		System.out.println("�ڿ��ݳ� �ڵ�");		//8 �Ҹ���, �ڹٿ��� ��� x, ȣ�� ������ ��.
	}
	
	void close(){	//9 �ڿ��ݳ��� �ؾ��� �κ��� ������ ���� �ڵ带 ���� ����ؾ߸���. ���� Ŭ���� �޼ҵ带 Ȱ���Ѵ�.
		System.out.println(getClass().getSimpleName()+"finalize() ����");	
		System.out.println("�ڿ��ݳ� �ڵ�");
	}
	
	@Override	//������ ��ü�� ����.
		protected Point clone() {	//7 throws CloneNotSupportedException ����
			Point obj = null;	//4. �ʱ�ȭ 										//14 class�� Point�� �ص� ����.
			
			try {
				obj = (Point)super.clone(); //6 ĳ����.	8. trycatchó��.			//15 ĳ����. ���� �߼��� object�� ����ؼ� ĳ������ �ϴ� ��츦 ���ϰ� ����.
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			} 
			
			return obj; //5
		}
	
}
