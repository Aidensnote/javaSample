package day13.Prob1_ÃÖ±â¿ø;

public class ShapeTest {
	public static void main(String[] args) {
		Rectangle t1 = new Rectangle(5, 6);
		RectTriangle t2 = new RectTriangle(6, 2);

		Shape[] t3 = { t1, t2 };
		for (int i = 0; i < t3.length; i++) {
			System.out.println("area: " + t3[i].getArea());
			if (t3[i] instanceof Resizable) {
				((Resizable) t3[i]).resize(0.5);
				System.out.println("new area: " + t3[i].getArea());
			}
		}
	}
}