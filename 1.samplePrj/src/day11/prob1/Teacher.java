package day11.prob1;

public class Teacher extends Person {
	private String subject;

	/* 상속관계가 부여됐을때는 default 생성자 함수를 포함하는게 좋다. */
	public Teacher() {
		super();
	}

	/* 파라미터 3개를 핸들링 할 수 있는 생성자 함수 */
	public Teacher(String name, int age, String subject) {
		/* 직접 셋팅 각각 3개를 쓸 걸 한줄로 함축 가능 */
		//super();
		//setName(name);
		//setAge(age);
		super(name, age);
		this.subject = subject;
	}
	

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Teacher(String subject) {
		super();
		this.subject = subject;
	}


	public void display(){
		System.out.printf("이   름: %s\t 나   이: %d\t 담당과목: %s%n",super.getName(),super.getAge(),subject);
	}
}
