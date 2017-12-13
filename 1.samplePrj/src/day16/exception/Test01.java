package day16.exception;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("main start");	// 1

		String name = null;					// 2
		if(name !=null && name.length()>0)	// 3 보통 이런경우 exception을 처리하는것이 아니라 if구문으로 null point를 잡는다. 모든 예외를 trycatch로 처리하지않는다. 
		System.out.println(name.charAt(0)); // 2 unchecked exception (nullpoint) 발생. 
		
		try {
			Class.forName("day16.exception.Sample");		//4. trycatch필요. fullpath가 필요.
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("클래스 이름 확인 필요.");
		}
		
		System.out.println("main end");		// 1

	}
}


class Sample{ //5 샘플클레스 생성 = 패키지 네임이 필요. 에러 생성 안함.
	
}