package day11.prob1;

public class Test_lecture {
	public static void main(String[] args) {
		
		// 1.Object s = new Student("�浿", 20, 1);
		// 2. s. Object Ÿ���� �Ұ����ϴ�.
		Object s = new Student("�浿", 20, 1);
		if(s instanceof Student)((Student)s).display(); // 3.Object Ÿ���� �Ұ����ϱ� ������ �ٿ�ĳ������ �ؾ��Ѵ�.

		/* 4. �ڹ��� ��� ��üŸ�� Object = �ݵ�� �ٿ�ĳ������ �ؾ߸� ����� �� �� �ִ�. = �ٿ�ĳ������ ������ Ÿ�Կ� �ڵ鸵�� ��ư� �����ϴ�. */
		s = "Hello";			// 5. String�� �θ�� Object�̹Ƿ� s�� �ٽ� Hello�� �ּҷ� �����Ѵ�.
		/* 7. instanceof�� Ÿ��üũ�Ҷ� ����ϴ� ������ */
		// �ٿ�ĳ���� ���� = Ÿ��üũ = instanceof ������ �ǽ�.
		if(s instanceof Student)((Student)s).display(); // 6. Object Ÿ���� �Ұ����ϱ� ������ �ٿ�ĳ����, �����Ϸ��� �ν� �Ұ�.
		
		
		String name = "OOO";
		Student s1 = new Student("�浿",20,1);
		Teacher t1 = new Teacher("ȫ��",40,"JAVA");
		Employee e1 = new Employee("ȫ�浿",44,"������");
		
		
		
		// 8. Object,Person �迭 ���� - ��Ӱ��踦 ���ϸ� �ϳ��� �迭�ȿ� ���� Ÿ���� ���� ���� ���� = �ڹ� ��Ʈ�����Ͼ
		Object[] obj1 = {name,s1,t1,e1};
		Person[] p = {s1,t1,e1,new Student("��浿",22,2)};		// 9. �ߺ��� err. person Ÿ�Կ� String ��ü�� �� �� ����. name�Ұ�.
		
		
		
		// ����: �پ缺, ����: ���ŷο�(ĳ���� �ݺ�)
		System.out.println("===================================================");
		/* 9. p�� ����Ű�� ���� ��� Ȯ��(Person Ÿ���� �迭) - p[0],p[1]...�� print�޼ҵ带 Ȱ�� �Ұ���. */
		for(int i=0;i<p.length;i++){
			//((Student)p[i]).display(); // 10. Student�ܿ� �ٸ� Ÿ�Ե鵵 ���ԵǾ� �����Ƿ� �ٸ� Ÿ���� �޼ҵ� ��� �Ұ���.
			if(p[i] instanceof Student)((Student)p[i]).display(); 	// 11. Student Ÿ����ġ Ȯ�� instanceof ����.
			if(p[i] instanceof Employee)((Employee)p[i]).display(); 	// 12. Employee Ÿ����ġ Ȯ�� instanceof ����.
			if(p[i] instanceof Teacher)((Teacher)p[i]).display(); 	// 13. Teacher Ÿ����ġ Ȯ�� instanceof ����.
		}
		System.out.println("===================================================");
		
		/* 10. �������̵��� �����Ͽ� �پ��� Ÿ���� �迭�� �ڽ��� �޼ҵ带 Ȱ�� �ϴ� ��. = �������̵��� ���ؼ� �ڽ��� �޼ҵ带 ���. */
		for(int i=0;i<p.length;i++){ // �迭�� �⺻ ����
			p[i].display(); // 11. �������̵� = ĳ���� ���� �޼ҵ� Ȱ�� = �θ�Ÿ�Կ��� �ڽĿ��� ������ = Person�� display�� �޼ҵ��� ����θ� �����ϰ� �߰�=�ڽ��� �޼ҵ带 Ȱ��.
		}
		System.out.println("===================================================");
		
		
		/* 12. �ڹ� ����������(������) = �޼ҵ�� �ϳ��ε� ���ε��Ǵ� Ÿ�Կ� ���� �پ��� ��� ���� */
		Person pp = s1;		// 13. Person,Employee,Student Ÿ�� �� ����.
		pp.display();		// 14. � ��ü�� ���ε� �Ǵ��Ŀ� ���� ��µǴ� �޼ҵ尡 �ٸ�.
	
		
		System.out.println("===================================================");
		// 15. obj���� Person Ÿ�Ը� ���. = ĳ���� �ʿ� = PersonŸ������ ĳ����(=�������̵� ������ �� ���ϱ��� �� �ʿ� ����)
		Object[] obj = {name,s1,t1,e1};
		for(int i =0;i<obj.length;i++)
			if(obj[i] instanceof Person)((Person)obj[i]).display();	// 16. ĳ���� �ʿ�, name�� String�̹Ƿ� err. instanceof�� Ÿ�� ��ġ�� ��츸 ���.
	}
}














