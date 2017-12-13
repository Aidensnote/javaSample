/* 데이터 값 스와핑 */
package day2;

public class P24 {

	public static void main(String[] args) {
		int x = 600;
		int y = 700;
		int tmp = 0;
		
		/* 직접 교환은 불가능하므로 임시(temp)를 둔다*/
		tmp = x; // 임시값을 x에 넣고
		x = y; // y값을 x에 넣고
		y = tmp; // temp값을 y에 넣어서 교환시킨다.
		System.out.printf("x= %d , y = %d %n ",x,y);

	}

}
