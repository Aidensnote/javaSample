package day13;

public class Student {
	
	// 1. 인캡슐레이션 - set get 영역에서만 사용 할 수 있음.
	// protected = 상속내에 사용 가능.
	// default = 같은 패키지 까지는 연결
	// public = 모두 공대
	private String name;
	private int id;
	
	//2.디폴드
	public Student() {
		super();
	}
	//3.파라미터 2개짜리 생성자
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//4. hash code 메소드를 오버라이딩을 이용해서 equals 메소드 생성.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)					// null은 비교불가
			return false;
		if (getClass() != obj.getClass())	// instanceof 대신에 타입체크.
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	//5. hashCode를 이용한 중복체크
	@Override
	public int hashCode() {					//중복값을 만들지않는 알고리즘.
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	//6. toString 메소드 = display메소드 = 출력해주는 메소드. 오버라이딩.
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	
}
