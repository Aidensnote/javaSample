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
	
	
	
	/* 오버로딩 = 구매목록이 증거&감소일때 번거로움 = 부모타입으로 핸들링*/
	/*
	void buy(TV t){
		money -= t.price;	// 지불
		point += t.point;	// 보너스 증가
	}
	void buy(Computer c){
		money -= c.price;	// 지불
		point += c.point;	// 보너스 증가
	}
	void buy(VCR v){
		money -= v.price;	// 지불
		point += v.point;	// 보너스 증가
	}
	*/

	/* 폴리모피즘 다형성 = price,point가 부모타입에 있음. = 부모타입으로 핸들링 할 수 있게끔 오버라이딩 유도해야만 원활함.*/
	void buy(Product t){
		money -= t.price;	// 지불
		point += t.point;	// 보너스 증가
	}
	
}




