package day3;

public class P113 {

	public static void main(String[] args) {
		int i=10, j=10; // �޸� stack����
		System.out.println(i==j); // i�� j�� ������ Ȯ�� ����. (�⺻���� ==)
		
		String name1 = new String("hello"); //�޸� heap����(��ü����) new�� ���鼭 ���� (�ּҰ� a)
		String name2 = new String("hello"); //�޸� heap����(��ü����) new�� ���鼭 ���� (�ּҰ� b), ���� �Ʒ��� �ּҰ� �ٸ���.
		String name3 = name1; // �ּҸ� name1�� �����ϰ� ����. 
		System.out.println("name1==name2 => ? " + (name1==name2)); // �ڿ� ��������� �켱�̹Ƿ� �񱳿��� ���뿡 ()�� ���δ�. �ּҰ� �ٸ��Ƿ� false ���. 
		System.out.println("name1==name3 => ? " + (name1==name3)); // �ּҰ� �����Ƿ� true�� ���.
		System.out.println("name1.equals(name2) => ? " + name1.equals(name2)); // name1�� stringŬ���� �ȿ� equals�޼ҵ带 ȣ���Ͽ� ���� ���Ѵ�.
		System.out.println("name1.equals(name3) => ? " + name1.equals(name3)); // ������ �ּҿ��� �񱳸� �ϰԵǹǷ� true�� ��µȴ�.
		System.out.println("============================="); // ���� ��
		
		/* new�� ������, ������������ �ִ� String�� Ư¡ */
		String s1 = "java"; // new�� new ���������� �޸��� ������ ����, �ּҸ� ����(string), �����͸� �����ϴ� �ڵ念���� ���� Ȥ�� ����.
		String s2 = "java"; // new�� new ���������� �޸��� ������ ����, �̹� ������ �ּҷ� ����(��������� �ʴ´�), �����͸� �����ϴ� �ڵ念���� ���� Ȥ�� ����.
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2)); // ���� ��, boolean Ÿ������ ���
		System.out.println(s1.length()); // ���ڿ��� ����, int Ÿ������ ���
		System.out.println(s1.charAt(0)); // ���ڿ��� (����), char Ÿ������ ���
		// System.out.println(s1.charAt(4)); length���� chatAt�� ���� �۾ƾ� �Ѵ�. �̻��� ��� err �߻�.
	}
}