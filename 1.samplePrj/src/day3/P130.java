package day3;

public class P130 {
	public static void main(String[] args) {
		int jumsu = 99; //유효성 검사에서 err. if로 유효성 검사를 진행.
		
		if(0 <= jumsu && jumsu <= 100){
			String result = (jumsu>=80)? "Pass":"No Pass"; // true일 경우 출력하며, else를 제외하고 아래 진행.
			System.out.println(jumsu+" : "+result);

		}else{
			System.out.println("점수 오류=> 확인하세요"); // false시 출력하고 아래 진행.
		}
		
		
		
		
		//char c = 0 <= jumsu && jumsu <= 100 ? 'O':'X' ; // char타입 c는 jumsu 범위내에 참이면 O, 아니면 X
		//조건: jumsu >=80 "pass" , 그렇지 않으면 "no pass"
		String result = (jumsu>=80)? "Pass":"No Pass";
		System.out.println(jumsu+" : "+result);
		
		//String d = 0 <= jumsu && jumsu <= 100 ? "O":"X" ; // String타입 c는 jumsu 범위내에 참이면 O, 아니면 X	
		int i = 100, j=200;
		int max = ( i > j ) ? i : j ; // 두수 중 큰 수가 max에 들어감.
		System.out.println("MAX : "+max);
		System.out.println("MAX : "+(( i > j ) ? i : j)); // 출력하는 값을 가진 data를 max가 아닌 3항연산을 활용.	
	}
}