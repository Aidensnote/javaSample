/* 제너릭 = 클래스의 객체 타입을 런타임에서 결정하는 것. jdk1.5부터 제공*/
package day17;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee<String,String> e2 = new Employee();	//3 String타입		//12 p의 타입설정
//		System.out.println(e2);
		e2.number = "2017";
//		Employee<int>							 4 object타입만 가능하다. 기본형은 불가능하다.
		
		Employee<Integer,Integer> e1 = new Employee(); //5 인티저가 들어갔으므로 int타입으로 변환.	//13 p의 타입설정
//		e1.number = "2015";						 6 불가능
//		System.out.println(e1);
		e1.number = 2015;						// 7 int타입만 가능.
		
		Employee e3 = new Employee();			//8 T에 대한 언급x
//		System.out.println(e3);
		e3.number = 2222;						//9 int / String 둘다 허용된다.
		e3.number = "444";						//10 obj-integer / obj-String 둘다 obj타입이라 가능.	// 14 모두다 obj타입.
		
		
		
		
		
	}
}


class Employee <T,P> {	//2 런타임에 결정한다는 의미. <임의의 타입> 형태.		//11 추가로 제너릭 생성. 
	String name;
	T number;	//1 T라는 클래스가 없지만 타입을 임의로 설정. 
	P age;
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + ", age=" + age + "]";
	}
	
}