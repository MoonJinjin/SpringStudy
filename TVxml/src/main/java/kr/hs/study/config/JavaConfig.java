package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.AppleSpeaker;
import kr.hs.study.beans.LgTV;
import kr.hs.study.beans.SamSungTV;
import kr.hs.study.beans.SonySpeaker;

@Configuration
public class JavaConfig {
	
	@Bean
	@Lazy
	@Scope("prototype")
	public SamSungTV samsung() {
		SamSungTV samsung = new SamSungTV();
		samsung.powerOff();
		samsung.powerOn();
		return samsung;
	}
	
	@Bean
	@Lazy
	@Scope("prototype")
	public LgTV lg() {
		LgTV lg = new LgTV();
		System.out.println("LG TV는 " + lg.getPrice() + "원 입니다.");
		return lg;
	}
	
	@Bean
	@Lazy
	@Scope("prototype")
	public SonySpeaker sony() {
		SonySpeaker sony = new SonySpeaker();
		sony.volumeUp();
		return sony;
	}
	
	@Bean
	@Lazy
	@Scope("prototype")
	public AppleSpeaker apple() {
		AppleSpeaker apple = new AppleSpeaker();
		apple.volumeDown();
		return apple;
	}

}