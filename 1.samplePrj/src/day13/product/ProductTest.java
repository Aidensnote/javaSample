package day13.product;

public class ProductTest {
	public static void main(String[] args){
		Buyer buyer = new Buyer();
		
		buyer.buy(new Computer());
		buyer.buy(new TV());
		buyer.buy(new VCR());
		buyer.buy(new HP());
		buyer.buy(new Audio());
		
	}

}


class Product{
	int price;
	int point;
	
}


class TV extends Product{}
class Computer extends Product{}
class VCR extends Product{}
class HP extends Product{}
class Audio extends Product{}



class Buyer{
	int money;
	int point;
	
	
	
	/* �����ε� = ���Ÿ���� ����&�����϶� ���ŷο� = �θ�Ÿ������ �ڵ鸵*/
	/*
	void buy(TV t){
		money -= t.price;	// ����
		point += t.point;	// ���ʽ� ����
	}
	void buy(Computer c){
		money -= c.price;	// ����
		point += c.point;	// ���ʽ� ����
	}
	void buy(VCR v){
		money -= v.price;	// ����
		point += v.point;	// ���ʽ� ����
	}
	*/

	/* ���������� ������ = price,point�� �θ�Ÿ�Կ� ����. = �θ�Ÿ������ �ڵ鸵 �� �� �ְԲ� �������̵� �����ؾ߸� ��Ȱ��.*/
	void buy(Product t){
		money -= t.price;	// ����
		point += t.point;	// ���ʽ� ����
	}
	
}




