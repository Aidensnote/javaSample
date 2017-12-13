package day18.Prob;

public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if (stack.isEmpty()) {
			System.out.println("������ ����ֽ��ϴ�.");
		}

		for (int i = 1; i <= 33; i++) {
			stack.push(i);
		}

		if (stack.isFull()) {
			System.out.println("������ ���� á���ϴ�.");
		}

		System.out.println("�ֻ��� ���� : " + stack.top());
		System.out.println("�ֻ������� ���� ���� : " + stack.pop());
		System.out.println("�ֻ������� ���� ���� : " + stack.pop());
		System.out.println("");
		System.out.println("== ���� ����Ʈ ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if (num != -1)
				System.out.println(num);
		}
	}
}

class MyStack { 			// 1
	int[] stack;			// 2
	int top = 0;

	public MyStack() {		 // 3 ����Ʈ + ����: �迭10��
		stack = new int[10];
	}

	public MyStack(int size) {	// 4 ������
		if (size < 0) { 		// 5 ����üũ
			stack = new int[10];
		} else {
			stack = new int[size];
		}
	}

	public boolean isEmpty() {					// 6
		return top == 0 ? true : false;			//10
	}

	public boolean isFull() {
//		if(top==stack.length){					//8
//			return true;
//		}else{
//			return false;
//		}
		return top == stack.length ? true : false;		//9
	}

	public void push(int data) {							
		if(isFull()){							//16 �������� ���. ����ó��.
//			arrays.copy	//17 resize (�߰� �迭����->ī��)
			return;
		}
			
		stack[top] = data;						//11
		top++;
		return;
	}

	public int pop() { 							//7
		if(isEmpty()){							//12 ��������� -1
			return -1;
		}
		return stack[--top];					//13 �ƴϸ� top�� ��ġ ������ ���. 13/15���̰� ����. --top�� ���� ����, top-1�� �ּ��� ����.
	}

	public int top() {							
		if(isEmpty()){							//14
			return -1;
		}
		return stack[top-1];					//15 top-1��ġ ����.
	}
}
