package day4;

public class P167 {

	public static void main(String[] args) {
		
		int count = 0;
		while(count<5){ // ()���ǵ��� �ݺ�
			System.out.println("Hello java");
			count++; // ������ ������
		}
		
		boolean flag = true;
		while(flag){
			System.out.println("~~~~~~~"); //���ѷ��� 
			//if(count==5) flag = !flag; // ���¿� ���� flag������ �ڵ鸵�� �Ѵ�.
			if(count==5) break; // ����(count==5)�϶� ����.
		}
		System.out.println("Main End");
	}

}
