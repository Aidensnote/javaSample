/* 내림차순 & 오름차순 */
package util;

public class Array {	//클래스 선언부,클래스 정의부
	// int sort1;	변수 선언.
	// int[] sort;	배열 선언.
		
	public static int[] sort(int[] a){ //메소드(기능) 선언부. 리턴타입/리턴값 메소드네임(매개변수(object)-입력될 필요한 정보의 타입)
		// int[] data = a; //원본a가 data로 주사가 복사 되버림.
		int[] data = new int [a.length]; //원본a를 복사
		System.arraycopy(a, 0, data, 0, a.length); //원본주소를 data에 저장.
		
		for(int i=0;i<data.length-1;i++){ //0부터 i 순서 작을떄까지.
				for(int j=i+1;j<data.length;j++){ // 오름차순
					if(data[i] > data[j]){ //data의 기준i
						int temp = data[i]; //스와핑 필요 (임시값 필요)
						data[i] = data[j];
						data[j] = temp;
						
					}
				}
		}
		//sort 알고리즘 - 기능.
		return data; // return 생략상태, void가 아니므로 리턴값 필수. 메소드 수행 후 반환할 주소(변수)
	}	//구현부(동작/기능)
	
	/**
	 * 
	 * @param a
	 * @param descmode 의도 설명.
	 * @return
	 */
	public static int[] sort(int[] a,boolean descmode){ // 구분하는 descmode에 따라서 참/거짓 나눠서 출력.
		int[] data = new int [a.length];
		System.arraycopy(a, 0, data, 0, a.length); //원본주소를 data에 저장.
		
		for(int i=0;i<data.length-1;i++){
				for(int j=i+1;j<data.length;j++){
					if(data[i] > data[j]){
						int temp = data[i];
						data[i] = data[j];
						data[j] = temp;
						
					}
				}
		}
		return data;
	}
}
