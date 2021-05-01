package kr.hs.study.beans;

public class SamSungTV implements TV {
	private int price;
	private SonySpeaker speaker;
	
	

	public SamSungTV() {
		super();
	}

	public SamSungTV(int price, SonySpeaker speaker) {
		super();
		this.setPrice(price);
		this.speaker = speaker;
	}

	public SonySpeaker getSony() {
		return speaker;
	}

	public void setSony(SonySpeaker speaker) {
		this.speaker = speaker;
	}

	public void powerOn() {
		System.out.println("Samsung TV의 전원을 켰습니다.");
	}

	public void powerOff() {
		System.out.println("Samsung TV의 전원을 껐습니다.");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
