/* 콜렉션 프레임워크 = 타입변환이 자유롭고 편리함 */
package day19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();			//1 제너릭 기반.
		for(int i=1;i<=77;i++){								//2
			stack.push(""+i);								//3 기본형을 자동 객체화 [오토박싱]
		}
		
		System.out.println(stack.pop());					//4.최상위 스택 뽑기. 자동리사이징.

		
		
		
		Queue<Integer> queue = new LinkedList<Integer>();	//5 queue 생성.
		for(int i=1;i<=10;i++){
			queue.offer(i);
		}
		System.out.println(queue.poll());					//6 빠져나오는게 가장 먼저들어간 값.
	}
	
}
