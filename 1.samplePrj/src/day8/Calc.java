/* method 제작 */
package day8;

public class Calc {

	/*
	public static int add(int a, int b){	//공유가능 public, int타입,(조건부), 반복될 수 있기에 static을 추가.
		return a+b;							// { }-바디부 선언부(int)와 return의 타입(int)를 동일하게 매칭.
	}
	
	// 별도로 생성하거나 아래에 제작해도 된다.
	//public static void main(String[] args) { // main+ctrl+space = main method 생성.
	
	
	public static int add(){ //void가 아니라서 int 타입 return이 필요. (들어와야하는 데이터값 조건)
		return 0; //같은 메소드네임 add가 있음에도 err가 발생하지 않는다.
	}
	/* 구별할 방법이 없음 이름동일 매개변수 동일
	public static int add(int a, int b){	
		return a+b;							
	}
	
	
	// 타입을 기반으로 구별하므로 중복err가 발생하지 않음
	public static double add(double a, double b){	
		return a+b;
	}
	
	// 매개변수 타입,갯수가 다름 = 가능 = method overloading = 하나의 메소드 네임 안에 여러개의 메소드가 존재
	public static double add(int a, int b, int c){	
		return a+b+c;
	}
	*/
	
	/**
	 * 도큐멘터리 하는 주석 방법
	 * @param a 더하고자 하는 데이터
	 * @return	합계가 리턴됩니다.
	 */
	
	/*타입과 변수 사이에 여러개[] 배열표시를 할 경우 = 정수값(int)을 여러개 처리 할 수 있는 메소드*/
	public static int add(int...a){	// int[] 배열의 주소요청 = "int ..." int타입으로 정수값 얼마든지 a로 취합해서 해결함.
		int sum = 0;
		for(int i=0;i<a.length;i++){// ...는 몇개인지 모르므로 반복인 for(){}문이 와야한다.
			sum += a[i];			//...은 배열로 처리.
		}
		return sum;
		}
	
	/*
	public static int add(char key,int...a){ //가변인자(변할수 있는=int...a)경우는 맨뒤로 가야한다.
		int sum = 0;
		for(int i=0;i<a.length;i++){
			sum += a[i];			
		}
			return sum;					
	public static int add(int[]a){		동일한 배열로 처리되는것을 확인 가능
		return 0;
	}
	*/
	public static double add(double a, double b){	
		return a+b;
	}
	
	}
