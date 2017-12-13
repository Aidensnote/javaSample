package day8;

public class CalcTest {

	public static void main(String[] args) {
		
		System.out.println(Calc.add(55, 77)); //132
		System.out.println(Calc.add(55, 77)==132); //검증. 내용검증 ".eqauls(검증할 내용)", 값검증 "=="
		System.out.println(Calc.add(1, 7)); //값만 다르게 해서 add method 호출.
		System.out.println(Calc.add()); //add라는 메소드의 파라미터(매개변수)에 따라서 타입이나 변수를 기반으로 구별함.
		System.out.println(Calc.add(3.5,3.7)); //add라는 메소드의 파라미터(매개변수)에 따라서 타입으로 구별함.
		System.out.println(Calc.add(3,3.7)); // int+double을 프로모션해서 double+double 메소드로 수행.
		System.out.println(Calc.add(55,77,99)); // 메소드 오버로딩 = 한개의 메소드네임=Calc.add()에 여러개의 기능(method)이 가능하다.
		System.out.println("=======================");
		
		System.out.println(Calc.add(1,2,3,4,5,6,7,8,9,10)); // int타입이면(=int...a) 매개변수 갯수 상관없이 처리 가능.
		System.out.println(Calc.add()); // 주석처리한 부분을 제외해도 int...만 있으면 정수는 모두 처리 가능
	}
}
