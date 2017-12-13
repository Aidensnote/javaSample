package day8;

public class P298 {

	public static void main(String[] args) {
		Car c1 = new Car("Red",4,"Auto"); // 5.객채생성,선언,초기값설정.
		Car c2 = c1; //같은 주소를 연결함, c1이 바뀌면 똑같이 바뀜. (콜바이레퍼런스)
		Car c3 = new Car(c1); // 메모리에 올리고 똑같이 값을 "복제".

		c1.color = "Gray"; // 6.데이터 변경.
		System.out.println(c1.color); //변경된 값 저장
		System.out.println(c2.color); //변경된 값의 같은 주소를 연결되어 있으므로 똑같이 변경됨.
		System.out.println(c3.color); //원본과는 다른 오브젝트.
	}
}

class Car{ // 1. Car 클래스 생성. 데이터+기능
	String color;
	int door;
	String gearType;
	
	/* 3. 생성자 함수 생성 (클래스네임과 동일,this.로 데이터 초기화)*/
	Car(){} //기본생성자
	Car(String color,int door, String gearType){ //중복방지 위해 안에 매개변수 다르게.
		this.color = color;
		this.door = door;
		this.gearType = gearType;
	}
	
	/*  4. 줄여서 Car type으로 생성 (c=주소,c.color/c.door/c.gearType..) */
	Car(Car c){
		this(c.color,c.door,c.gearType); // 중복 해결
		//this.color = c.color; 위와 코드 중복 발생.
		//this.door = c.door;
		//this.gearType = c.gearType;
	}
	
	
	
	public void display(){	// 2. 출력할 디스플레이 메소드
		System.out.printf("Car[%s,%d,%s] %n",color,door,gearType);
	}
}