package kr.hs.study.beans;

public class LgTV implements TV {
	public int price;
	
	public LgTV() {
		System.out.println("Lg의 기본 생성자");
	}

	public LgTV(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void powerOn() {
		// TODO Auto-generated method stub
		
	}

	public void powerOff() {
		// TODO Auto-generated method stub
		
	}
}
