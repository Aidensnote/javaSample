package day3;

public class P113 {

	public static void main(String[] args) {
		int i=10, j=10; // 메모리 stack영역
		System.out.println(i==j); // i와 j가 같은지 확인 수식. (기본형은 ==)
		
		String name1 = new String("hello"); //메모리 heap영역(객체생성) new를 쓰면서 생성 (주소가 a)
		String name2 = new String("hello"); //메모리 heap영역(객체생성) new를 쓰면서 생성 (주소가 b), 위와 아래의 주소가 다르다.
		String name3 = name1; // 주소를 name1과 동일하게 간다. 
		System.out.println("name1==name2 => ? " + (name1==name2)); // 뒤에 산술연산이 우선이므로 비교연산 내용에 ()를 붙인다. 주소가 다르므로 false 출력. 
		System.out.println("name1==name3 => ? " + (name1==name3)); // 주소가 같으므로 true가 출력.
		System.out.println("name1.equals(name2) => ? " + name1.equals(name2)); // name1의 string클래스 안에 equals메소드를 호출하여 값을 비교한다.
		System.out.println("name1.equals(name3) => ? " + name1.equals(name3)); // 동일한 주소에서 비교를 하게되므로 true가 출력된다.
		System.out.println("============================="); // 나눔 선
		
		/* new를 쓰지도, 쓰지않을수도 있는 String의 특징 */
		String s1 = "java"; // new와 new 하지않으면 메모리의 영역의 차이, 주소만 생성(string), 데이터만 관리하는 코드영역에 생성 혹은 연결.
		String s2 = "java"; // new와 new 하지않으면 메모리의 영역의 차이, 이미 생성된 주소로 연결(재생성하지 않는다), 데이터만 관리하는 코드영역에 생성 혹은 연결.
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2)); // 값의 비교, boolean 타입으로 출력
		System.out.println(s1.length()); // 문자열의 길이, int 타입으로 출력
		System.out.println(s1.charAt(0)); // 문자열의 (순서), char 타입으로 출력
		// System.out.println(s1.charAt(4)); length보다 chatAt의 값은 작아야 한다. 이상일 경우 err 발생.
	}
}