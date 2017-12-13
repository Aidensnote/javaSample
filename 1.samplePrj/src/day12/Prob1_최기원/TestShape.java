package day12.Prob1_최기원;

public class TestShape {

	public static void main(String[] args) {
		Shape [] shape = new Shape[2];
		
		shape[ 0 ]  = new Circle("원",10);
		shape[ 1 ] = new Rectangle("직사각형",10,20);
		
		for (int i = 0; i < shape.length; i++) {
			shape[ i ].calculationArea();	// 자식의 오버라이딩된 메소드로 자식의 데이터로 부모의 데이터 핸들링.
			shape[ i ].print();


	}
}
}