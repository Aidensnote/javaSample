package day20;

import java.util.Vector;

public class Prob_Lt {
	Vector<String>  moveToVector(String datas[]){	//1. 리턴타입 , 메소드 명
		if(datas.length==0||datas==null){			//14 예외처리
			System.out.println("처리할 데이터가 필요합니다.");	//15 예외시 출력 메세지
			return null;							//16 리턴 시켜서 다시 실행하게 해야함.
		}
		Vector<String> data = new Vector<String>();	//2. 객채생성. 1.5ver이후로 제너릭을 넣어주지 않아도 되었으나 넣어주는게 일반적이다.
//		for(int i=0;i<datas.length;i++){			//4. 배열=for()
		for(int i=datas.length-1;i>=0;i--){			//6. 역순이므로 조건 변경
			data.add(datas[i]);						//5. 앞에서부터 순서대로 add. = 순서대로 집어넣는것.
		}
		return data;								//3. 리턴타입 일치
	}
	public static void main(String[] args){			// 7 메인생성
		Prob1 p = new Prob1();						// 8 객채생성
		String[] d = {"1","2","3","4","5"};			// 10 베열생성 후 넘겨주기
//		p.moveToVector(args);						// 9 String의 배열
		Vector<String> list = p.moveToVector(d);	// 11 리스트를 생성 후 넣기
//		Vector<String> list = p.moveToVector(null);	// 13 null 넣을경우, d=null일 경우 예외발생 = 예외처리 필수
		System.out.println(list);					// 12 출력
	}
}


