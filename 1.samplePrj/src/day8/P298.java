package day8;

public class P298 {

	public static void main(String[] args) {
		Car c1 = new Car("Red",4,"Auto"); // 5.��ä����,����,�ʱⰪ����.
		Car c2 = c1; //���� �ּҸ� ������, c1�� �ٲ�� �Ȱ��� �ٲ�. (�ݹ��̷��۷���)
		Car c3 = new Car(c1); // �޸𸮿� �ø��� �Ȱ��� ���� "����".

		c1.color = "Gray"; // 6.������ ����.
		System.out.println(c1.color); //����� �� ����
		System.out.println(c2.color); //����� ���� ���� �ּҸ� ����Ǿ� �����Ƿ� �Ȱ��� �����.
		System.out.println(c3.color); //�������� �ٸ� ������Ʈ.
	}
}

class Car{ // 1. Car Ŭ���� ����. ������+���
	String color;
	int door;
	String gearType;
	
	/* 3. ������ �Լ� ���� (Ŭ�������Ӱ� ����,this.�� ������ �ʱ�ȭ)*/
	Car(){} //�⺻������
	Car(String color,int door, String gearType){ //�ߺ����� ���� �ȿ� �Ű����� �ٸ���.
		this.color = color;
		this.door = door;
		this.gearType = gearType;
	}
	
	/*  4. �ٿ��� Car type���� ���� (c=�ּ�,c.color/c.door/c.gearType..) */
	Car(Car c){
		this(c.color,c.door,c.gearType); // �ߺ� �ذ�
		//this.color = c.color; ���� �ڵ� �ߺ� �߻�.
		//this.door = c.door;
		//this.gearType = c.gearType;
	}
	
	
	
	public void display(){	// 2. ����� ���÷��� �޼ҵ�
		System.out.printf("Car[%s,%d,%s] %n",color,door,gearType);
	}
}