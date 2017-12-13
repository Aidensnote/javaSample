package day18.Prob;

public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if (stack.isEmpty()) {
			System.out.println("스택이 비어있습니다.");
		}

		for (int i = 1; i <= 33; i++) {
			stack.push(i);
		}

		if (stack.isFull()) {
			System.out.println("스택이 가득 찼습니다.");
		}

		System.out.println("최상위 숫자 : " + stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
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

	public MyStack() {		 // 3 디폴트 + 조건: 배열10개
		stack = new int[10];
	}

	public MyStack(int size) {	// 4 생성자
		if (size < 0) { 		// 5 음수체크
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
		if(isFull()){							//16 가득차는 경우. 예외처리.
//			arrays.copy	//17 resize (추가 배열생성->카피)
			return;
		}
			
		stack[top] = data;						//11
		top++;
		return;
	}

	public int pop() { 							//7
		if(isEmpty()){							//12 비어있으면 -1
			return -1;
		}
		return stack[--top];					//13 아니면 top의 위치 내리고 출력. 13/15차이가 있음. --top은 값이 변경, top-1은 주소의 차이.
	}

	public int top() {							
		if(isEmpty()){							//14
			return -1;
		}
		return stack[top-1];					//15 top-1위치 꺼냄.
	}
}
