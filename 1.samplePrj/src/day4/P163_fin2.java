package day4;

public class P163_fin2 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++){
			for(int j=2;j<=9;j++){ //단, 2단부터 (시작점)
				System.out.printf(" %d*%d=%2d |",j,i,i*j); // x*y=z 이므로 %d(정수), %2d는 2자리수. 단이 먼저이므로 j 9까지 돌고 다음줄 넘어감=>i=2바뀌고 다시 j=1~9 반복. 루프는 i=9가 될때까지.
				
			}
			System.out.println();
		}
	}

}
