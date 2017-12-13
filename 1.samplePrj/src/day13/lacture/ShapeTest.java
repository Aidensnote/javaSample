package day13.lacture;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shapes = { // 1
				new Rectangle(5, 6),
				new RectTriangle(6, 2)
				};

		for (int i = 0; i < shapes.length; i++) { // 2
			System.out.println("area:" + shapes[i].getArea()); //3
			if (shapes[i] instanceof Resizable) {	//5
				((Resizable) shapes[i]).resize(0.5); //4
				System.out.println("new area:" +shapes[i].getArea()); //6
			}
		}

	}

}
