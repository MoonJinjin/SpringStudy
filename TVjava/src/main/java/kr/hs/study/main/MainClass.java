package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TV;
import kr.hs.study.beans.SamSungTV;
import kr.hs.study.beans.SonySpeaker;
import kr.hs.study.beans.AppleSpeaker;
import kr.hs.study.beans.LgTV;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		SamSungTV samsung = ctx.getBean("samsung",SamSungTV.class);
		System.out.println("samsung : " + samsung);
		LgTV lg = ctx.getBean("lg", LgTV.class);
		SonySpeaker sony = ctx.getBean("sony", SonySpeaker.class);
		AppleSpeaker apple = ctx.getBean("apple", AppleSpeaker.class);
		
		ctx.close();
	}

}
