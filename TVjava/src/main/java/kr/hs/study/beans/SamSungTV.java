package kr.hs.study.beans;

public class SamSungTV implements TV {
	public int price;
	
	
	public SamSungTV() {
		System.out.println("Samsung�� �⺻ ������");
	}

	public SamSungTV(int price) {
		this.price = price;
	}

	public void powerOn() {
		System.out.println("Samsung TV�� ������ �׽��ϴ�.");
	}

	public void powerOff() {
		System.out.println("Samsung TV�� ������ �����ϴ�.");
	}
}
