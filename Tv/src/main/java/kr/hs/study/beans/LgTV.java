package kr.hs.study.beans;

public class LgTV implements TV {
	public void volumeUp() {
		System.out.println("LG TV�� ������ �������ϴ�.");
	}

	public void volumeDown() {
		System.out.println("LG TV�� ������ ������ϴ�.");
	}

	public void powerOn() {
		System.out.println("LG TV�� ������ �׽��ϴ�.");
	}

	public void powerOff() {
		System.out.println("LG TV�� ������ �����ϴ�.");
	}
}
