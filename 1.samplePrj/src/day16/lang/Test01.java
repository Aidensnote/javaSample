package day16.lang;

public class Test01 {

	public static void main(String[] args) {
		Point p = new Point(1, 1);	//4
		System.out.println(p);
		p.close();					//10 자원반납. null하기전에 자원반납.
		p = null;					//5 gc에게 관리 호출. 9. null을 해야지만 자원반납 이뤄짐.
		
		
		//System.gc();				//6. gc호출, 메모리 예비율에 따라 작동함. - 관리가 들어가면 모든서비스 중지. 메모리관리만 작동.
		
		
		System.out.println("main end"); //7 확인.
		

	}
}

class Point implements Cloneable{		//1					//10  인터페이스 -able. implements Cloneable 내부적으로 마킹 처리를 해야한다. 
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
	
	@Override	//중복, 동일 비교.
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
	protected void finalize() throws Throwable {	//자바에선 거의 사용x
		super.finalize();
		System.out.println(getClass().getSimpleName()+"finalize() 수행");		//8 소멸자
		System.out.println("자원반납 코드");		//8 소멸자, 자바에선 사용 x, 호출 시점을 모름.
	}
	
	void close(){	//9 자원반납을 해야할 부분이 있으면 직접 코드를 만들어서 사용해야만함. 보통 클로즈 메소드를 활용한다.
		System.out.println(getClass().getSimpleName()+"finalize() 수행");	
		System.out.println("자원반납 코드");
	}
	
	@Override	//동일한 객체를 생성.
		protected Point clone() {	//7 throws CloneNotSupportedException 제거
			Point obj = null;	//4. 초기화 										//14 class인 Point로 해도 가능.
			
			try {
				obj = (Point)super.clone(); //6 캐스팅.	8. trycatch처리.			//15 캐스팅. 요즘 추세가 object를 사용해서 캐스팅을 하는 경우를 피하고 있음.
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			} 
			
			return obj; //5
		}
	
}
