package day8;

/**
 * 선언부 위에 주석다는 방법. (/** + 엔터)
 * @author student 		누가만들었는지
 * @since 2017 11.08	언제만들었는지
 *
 */
public class Employee {	//public 필수 
	
	/* 인스턴스 베리어블*/
	String name;	//이름
	String dept;	//부서
	String num;		//사번
	
	/* 생성자 함수 영역 생성 - 자동으로 호출 */
	public Employee (){
		
		/* 생성자에서 다른 생성자 호출하기-같은 이름- */
		//System.out.println("Employee 생성자 함수 ");
		this("000","사원명","OO부"); // first statement(맨윗줄)에만 허용된다.
		
		/* 기본적인 값으로 초기화, 코드중복
		this.num = "000";
		this.name = "사원명";
		this.dept = "oo부";
		*/
		
	}
	
	
	/* 파라미터 세개(name/num/dept)를 해결 할 수 있는 생성자 함수 생성 */
	public Employee (String num, String name, String dept){
		this.num = num;		//num = num;은 로컬베리어블로 인식. this.num은 맴버 베리어블.
		this.name = name; 
		this.dept = dept; 
	}
	
	
	/**
	 * Employee 정보 출력용 ~~~~ 매개변수(파라미터)의 용도들 설명
	 */
	
	/* 인스턴스 메소드 */
	public void display(){ //출력 메소드, public 필수
		System.out.printf("Employee[%s,%s,%s] %n",num,name,dept);
	}
	
	// 싱글라인 주석
	/*	멀티라인 주석	*/ 
}