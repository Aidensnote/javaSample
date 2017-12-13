package day16.lang;

public class Test04 {
	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(5,5),3);	//4
		//System.out.println(c1);		//5
		
		Circle c2 = (Circle) c1.clone();	//8
		c1.p.setX(99);						//10 같이 복사가 적용 되버림. p.459 주소형이 들어갈 경우 깊은 복사로 진행해야한다.
		System.out.println(c1);				//9
		System.out.println(c2);				//9
		
		

	}
}

class Circle implements Cloneable{	//1		//7복제능력 부여.
	Point p;	//2
	double r;
	
	public Circle() {	//3
		super();
	}
	public Circle(Point p, double r) {
		super();
		this.p = p;
		this.r = r;
	}
	public Point getP() {
		return p;
	}
	public void setP(Point p) {
		this.p = p;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		long temp;
		temp = Double.doubleToLongBits(r);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Circle other = (Circle) obj;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}
	
	@Override
		protected Circle clone(){	//1		//5
		Circle c = null;	//2
		try {
			c = (Circle)super.clone();	//3		//6
			
			Point p = c.p.clone(); 	//11
			c.p=p;					//12
			
		
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return c;	//4
		}
}