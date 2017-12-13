package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student("홍길동",26);	//3
//		System.out.println(s);
		
		Student[] students = new Student[100];	//4 배열생성
		int count = 0;							//5 카운터가 100이 되면 리사이즈 해야한다.
			
		try(Scanner scanner = new Scanner(new File("studentdata.txt"))){	//6 ()안에는 closeable만 포함 가능하다.
			while(scanner.hasNextLine()){	//11
				String readLine = scanner.nextLine(); // 12 한줄 읽어서 저장.
				String[] data = readLine.split("/");	//13 쪼개기
				students[count] = new Student(data[0], Integer.parseInt(data[1]));	//14 배열에 주소 연결
				count++;		//15 카운팅	
			}
		
		}catch(Exception e){	//7 filenotfoundexception-일때만.
			if(e instanceof FileNotFoundException){	//8
				System.out.println("studentdata.txt 파일을 준비하세요.");	//9
			}else{
				e.printStackTrace();	//10
			}
		}finally{
		
		}
		
		
		try {	//18 trycatch
			Arrays.sort(students,0,count);	//17 기준이 없으므로 정렬 불가. 이런 규칙,순서를 제공하는것 [컴페러블 인터페이스] = 컴페러블 인터페이스 구현해야한다.  24. 꽉찬 배열만 분류. student에서 0부터 count까지(전체)
			
		} catch (ClassCastException e) {	//19 예외지정
			System.out.println("정렬 기준키 설정 필요");	//20메세지 출력.
		}
				
		for(int i=0;i<count;i++){	//11 카운터만큼 (배열이 들어간 만큼)
			System.out.println(students[i]);	//12
			System.out.println("-----------------------------");
//			System.out.println(Arrays.toString(students));
		}
		
		String[] i = {"j","a","f"};	//13 배열 
		Arrays.sort(i);	//14 배열 정렬
		System.out.println(Arrays.toString(i));	//15 출력
		
		
		System.out.println("main end");
	}
}

class Student implements Comparable<Student>{	//21 제너릭 구현. 제너릭이 없으면 object타입으로 생성, 제너릭 활용하면 class명이 타입이 된다.
	String name;	//1
	int age;

	public Student() {	//디폴트, 생성자,setget,toString,hashequal.
		super();
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override	//22 기준키를 설정해준다.
	public int compareTo(Student o) {
//		return age - o.age;	//23 앞에가 작으면 음수, 같으면 0, 크면 양수. 오름차순 
//		return o.age- age;	//24 앞에가 작으면 음수, 같으면 0, 크면 양수. 내림차순

//		return name.compareTo(o.name);	// 25 내가 가지고 온 name 과 o에서 가지고온 name 비교. 오름차순. 추가로 필요하면 2차 기준(0=같은이름)을 생성해야한다. int타입니다.
		int result = name.compareTo(o.name);	//26 조건 추가
		return (result!=0) ? result : age - o.age;	//27 3항 연산자를 활용한 출력. 
		
		
		
	}
}
