package day16.lang;

public class Test03 {

	public static void main(String[] args) {
		Point p1 = new Point(1,1);	//1
		System.out.println(p1);		//2
		
		
		Point p2 = (Point) p1.clone();	//3. P456  9.object라서 다운캐스팅 필요
		p1.setX(99);					//12 데이터 변경.
		System.out.println(p2);			//11 정상출력.
		System.out.println(p1);			//13 변경을 해도 클론(복사)한 내용은 그대로 출력. 영향력x
		

	}
}
