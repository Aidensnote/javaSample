/* �ݷ��� �����ӿ�ũ = Ÿ�Ժ�ȯ�� �����Ӱ� ���� */
package day19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();			//1 ���ʸ� ���.
		for(int i=1;i<=77;i++){								//2
			stack.push(""+i);								//3 �⺻���� �ڵ� ��üȭ [����ڽ�]
		}
		
		System.out.println(stack.pop());					//4.�ֻ��� ���� �̱�. �ڵ�������¡.

		
		
		
		Queue<Integer> queue = new LinkedList<Integer>();	//5 queue ����.
		for(int i=1;i<=10;i++){
			queue.offer(i);
		}
		System.out.println(queue.poll());					//6 ���������°� ���� ������ ��.
	}
	
}
