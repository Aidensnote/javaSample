/* 이클립스 창에서 args 파라미터 값 옮기는 방법 */
package day5;

import java.util.Arrays;

public class P211 {

	public static void main(String[] args) { // args=입력하는 값이 배열로 생성, args=""상태인것. String의 배열 args.
		System.out.println(args.length);	 // args[0],,args[1],args[2]...형태.
		System.out.println(Arrays.toString(args));
		
		
		
		System.out.println("Main End");
	}

}
