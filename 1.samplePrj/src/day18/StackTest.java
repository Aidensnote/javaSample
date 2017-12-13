package day18;

import java.util.Arrays;

public class StackTest {

	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if (stack.isEmpty()) {
			System.out.println("스택이 비어있습니다.");
		}

		for (int i = 1; i <= 10; i++) {
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

class MyStack {
	int[] number;
	int size;
	int count;
	
	public MyStack() {
	}

	public MyStack(int[] number, int size, int count) {
		super();
		this.number = number;
		this.size = size;
		this.count = count;
	}


	public MyStack(int size) {
		super();
		if (size > 0) {
			this.size = size;
			this.number = new int[10];
		} else {
			this.size = 10;
			this.number = new int[10];
		}
	}

	public Boolean isEmpty() {
		if (this.number.length > 0)
			return true;
		else
			return false;
	}

	public void push(int number) {
		this.number[number - 1] = number;
		this.count++;
	}

	public Boolean isFull() {
		if (count == number.length)
			return true;
		else
			return false;
	}

	public int top() {
		return number[count - 1];
	}

	public int pop() {
		if (count > 0)
			return number[--count];
		else
			return -1;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + Arrays.hashCode(number);
		result = prime * result + size;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyStack other = (MyStack) obj;
		if (count != other.count)
			return false;
		if (!Arrays.equals(number, other.number))
			return false;
		if (size != other.size)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "MyStack [number=" + Arrays.toString(number) + ", size=" + size + ", count=" + count + "]";
	}
}