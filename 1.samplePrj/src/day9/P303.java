package day9;

public class P303 {
	public static void main(String[] args) {
		System.out.println("start");
		Product b1 = new Product();
		Product b2 = new Product();
		Product b3 = new Product();
		
		System.out.println(b1.serialNum);
		System.out.println(b2.serialNum);
		System.out.println(b3.serialNum);
		System.out.println("end");
		
		System.out.println(b1.count);
		System.out.println(b2.count);
		System.out.println(b3.count);
		
		System.out.println(Product.count);
	}
}

class Product{ //P306
	static int count = 0;
	int serialNum;
	
	
	/* 생성자함수보다 먼저 출력*/
	static{ //static 블락 1회성, 인스턴스 자원 접근불가.
		//System.out.println("static {   }"); //static 초기화 블락
		// serialNum = 0; err
		count = 0; //static 자원 핸들링.
	}
	
	/* 객채 생성 횟수만큼 생성자 함수 같으나 생성자 함수보다 먼저 = "초기화 블럭" */
	{
		//System.out.println("{ }"); //생성자보다 먼저. 인스턴스를 초기화하는 블락
		++count;			// 클래스 베리어블
		serialNum = count;	// 인스턴스 베리어블
	}
		
	public Product(){
		//System.out.println("BlockTest() 기본생성자");
		
	}
}