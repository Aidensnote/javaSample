package day4;

public class P163_fin {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++){
			for(int j=2;j<=9;j++){ //단, 2단부터 (시작점)
				// if(j==5) break;  특정조건을 주고 break문장을 추가하면 해당{}를 종료되고 빠져나옴. 5단일때 {}을 빠져나가고 그 이후 단수는 처리가 안된다. 그리고서 i++(1~9)로 진행되버린다.
				// if(j==5) continue; 특정조건(j==5)에서 진행하지않고 재진입(점프) 해버린다. 결국 5단 제외
				
				System.out.printf(" %d*%d=%2d |",j,i,i*j); // x*y=z 이므로 %d(정수), %2d는 2자리수. 단이 먼저이므로 j 9까지 돌고 다음줄 넘어감=>i=2바뀌고 다시 j=1~9 반복. 루프는 i=9가 될때까지.
				
			}
			System.out.println();
		}
	}

}
