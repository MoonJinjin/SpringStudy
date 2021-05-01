package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TV;
import kr.hs.study.beans.SamSungTV;
import kr.hs.study.beans.LgTV;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		SamSungTV t1 = ctx.getBean("t1",SamSungTV.class);
		t1.powerOn();
		t1.volumeDown();
		
		LgTV t2 = ctx.getBean("t2",LgTV.class);
		t2.powerOn();
		t2.volumeUp();
		t2.powerOff();
		
		ctx.close();
	}

}
