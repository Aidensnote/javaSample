/* unchecked / checked 차이 */
package day15.exception;

public class Test02 {
	public static void main(String[] args) {
		
		try{		//6
			Thread.sleep(5000);	//5. 1000:1초 총 5초 멈춤 checked exception. try/catch로 감싸라고 지시.
		}catch (InterruptedException e) {		//7
			e.printStackTrace();
		}
		
		System.out.println("START"); //3
		String name = null; //1
		if(name != null) //8 보통 null pont는 if로 잡는다.
			System.out.println(name.toString());	//2 name 쓰면 .toString 발생-주소찍힘. unchecked exception.
		

		System.out.println("END"); //4
	}
}
