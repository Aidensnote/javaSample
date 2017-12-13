package day4;

public class Test2 {
	public static void main(String[] args) {
		System.out.println(day4.Test1.Pi); // 같은 패키지 안에 있는 클래스네임 경로를 지정해주면 new를 하지않아도 static메모리단에서 사용 가능하다.
		System.out.println(Test1.Pi); // 같은 패키지면 패키지디렉토리를 제거해도 된다. 

		System.out.println(Byte.MAX_VALUE); // 자바에서 제공하는 class. (java.lang.)Byte.MAX_VALUE 생략되있는 상태.
		
		System.out.println(Math.PI); //Math클래스안에 pi값을 이미 제공하고 있음. 
	}
}