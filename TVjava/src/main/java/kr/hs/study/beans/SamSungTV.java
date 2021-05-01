package kr.hs.study.beans;

public class SamSungTV implements TV {
	public int price;
	
	
	public SamSungTV() {
		System.out.println("Samsung의 기본 생성자");
	}

	public SamSungTV(int price) {
		this.price = price;
	}

	public void powerOn() {
		System.out.println("Samsung TV의 전원을 켰습니다.");
	}

	public void powerOff() {
		System.out.println("Samsung TV의 전원을 껐습니다.");
	}
}
