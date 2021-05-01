package kr.hs.study.beans;

public class SonySpeaker implements Speaker {
	public void volumeUp() {
		System.out.println("Sony Speaker의 볼륨을 높였습니다.");
	}

	public void volumeDown() {
		System.out.println("Sony Speaker의 볼륨을 낮췄습니다.");
	}
}
