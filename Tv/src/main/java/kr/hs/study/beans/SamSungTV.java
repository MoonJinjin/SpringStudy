package kr.hs.study.beans;

public class SamSungTV implements TV {
	public void volumeUp() {
		System.out.println("Samsung TV�� ������ �������ϴ�.");
	}

	public void volumeDown() {
		System.out.println("Samsung TV�� ������ ������ϴ�.");
	}

	public void powerOn() {
		System.out.println("Samsung TV�� ������ �׽��ϴ�.");
	}

	public void powerOff() {
		System.out.println("Samsung TV�� ������ �����ϴ�.");
	}
}
