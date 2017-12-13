package day2;

public class P95 {

	public static void main(String[] args) {
		//char x = 'a'; x값 초기화
		//int y = 7 + 8 * x;  int*char, char->아스키코드값 프로모션.
		//System.out.println(y);
		
		//double y = 7 + 8 * x;  int*char, char->아스키코드값 double프로모션.
		//System.out.println(y);
		
		float x = 'a'; //x값 초기화
		double y = 7 + 8 * x;
		System.out.printf("y= %10.2f %n",y); // 앞에 빈칸자릿수&소숫점 2개까지
		
		int i = 5, j = 5;
		System.out.println(i>j); // 동일한 값이므로 false.
		System.out.printf("i>j = %b %n",i>j); // 비교연산의 결과값 출력 결과는 true&false가 출력.
		System.out.printf("i= %d,j= %d %n",i,j); // 해당 값이 int이므로 %d
		System.out.printf("i= %d, j= %d : i==j => %s %n",i,j,i==j);
		System.out.printf("i= %d, j= %d %n",i,j);
		
		//System.out.println(i++); // 5 출력 후 증가
		//System.out.println(++i); // 6 증가 후 출력
		System.out.printf("i= %d,j= %d %n",i,j);
		
		int sum = 100;
		sum = sum+ (int)y; // y는 더블타입이므로 변환 후 연산.
		// sum += (int)y; 누적시키는 연산식
		System.out.println(sum);
		System.out.println(sum%10); // 10으로 나눈 나머지 값 출력. (몫이 아님)
		System.out.println(sum/10); // 10으로 나눈 몫 출력.
		
	}
}