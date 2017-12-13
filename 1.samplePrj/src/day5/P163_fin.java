package day5;

public class P163_fin {

	public static void main(String[] args) {
		OUT: for(int i=1;i<=9;i++){
			 for(int j=2;j<=9;j++){ //단, 2단부터 (시작점)
				// if(j==5) break OUT; 라벨링 작업. 블락에 이름을 붙이고 해당 부분에서 연산을 중지해버린다.
				// if(j==5) break
				// if(j==5) continue; 특정조건(j==5)에서 진행하지않고 재진입(점프) 해버린다. 결국 5단 제외
				// if(j==5) continue; 특정조건(j==5)에서 진행하지않고 재진입(점프) 해버린다. 결국 5단 제외
				
				System.out.printf(" %d*%d=%2d |",j,i,i*j); // x*y=z 이므로 %d(정수), %2d는 2자리수. 단이 먼저이므로 j 9까지 돌고 다음줄 넘어감=>i=2바뀌고 다시 j=1~9 반복. 루프는 i=9가 될때까지.
				
			}
			System.out.println();
		}
	}

}
