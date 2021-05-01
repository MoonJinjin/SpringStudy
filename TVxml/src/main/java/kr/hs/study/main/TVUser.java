package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TV;
import kr.hs.study.beans.SamSungTV;
import kr.hs.study.beans.SonySpeaker;
import kr.hs.study.beans.AppleSpeaker;
import kr.hs.study.beans.LgTV;

public class TVUser {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		SamSungTV samsung = ctx.getBean("samsung",SamSungTV.class);
		samsung.setPrice(500000);
		System.out.println("SamsungTV�� "+samsung.getPrice()+"�� �Դϴ�.");
		samsung.powerOn();
		
		
		LgTV lg = ctx.getBean("lg",LgTV.class);
		System.out.println("LgTV�� "+lg.getPrice()+"�� �Դϴ�.");
		lg.powerOn();
		lg.powerOff();
		
		ctx.close();
	}
}
