package day13.test;

public interface Drawable {					// 1. �������̽��� ~~able�� ���̻縦 ���δ�. �������: final +
	public abstract void draw();			// 2. ����θ� �ְ� �ٵ�� ���� = �߻�(abstract), �ٵ��{}�� ���� err. = �ڵ����� abstract ����. = �ν��Ͻ� �޼ҵ� �Ұ�. = �߻�޼ҵ常 ��������.
	
}

interface Colorable{
	void drawColor();			// 3. �������̽��� ����θ� ����.
}