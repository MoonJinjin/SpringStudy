package kr.hs.study.beans;

public class SamSungTV implements TV {
	public void volumeUp() {
		System.out.println("Samsung TV의 볼륨을 높였습니다.");
	}

	public void volumeDown() {
		System.out.println("Samsung TV의 볼륨을 낮췄습니다.");
	}

	public void powerOn() {
		System.out.println("Samsung TV의 전원을 켰습니다.");
	}

	public void powerOff() {
		System.out.println("Samsung TV의 전원을 껐습니다.");
	}
}
