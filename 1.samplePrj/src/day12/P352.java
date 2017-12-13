package day12;

public class P352 {

	public static void main(String[] args) {
		/* 생성자의 private 처리 */
		//2. 생성자 함수 생성 = new하면 객체 생성.
		//new SingleTone();	//5. 밖에선 불가능.
		//new SingleTone();
		//new SingleTone();
		//new SingleTone();
		
		SingleTone.getInstance(); // 7. static에 올린 SingTone의 getInstance로 출력.
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
	}

}

//1. 클래스 생성.
class SingleTone{
	private static SingleTone s = new SingleTone();	// 4. 이 안에서는 객체 생성 가능. 7. private처리하고 static 메소드로 설계.
	private SingleTone(){							// 3. private 이 class 안에서만 객체 생성 가능. 밖에서는 불가능.
		System.out.println("SingleTone() 생성");
	}
	public static SingleTone getInstance(){ //6. getInstance 메소드를 호출하면 SingleTone의 주소를 출력. 싱글톤 기반의 객체관리법.
		return s;
	}
		
	
}