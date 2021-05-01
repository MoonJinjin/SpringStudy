package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HelloEn;
import kr.hs.study.beans.HelloJp;
import kr.hs.study.beans.HelloKr;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		HelloKr obj1 = ctx.getBean("t1", HelloKr.class);
		obj1.Hello1();
		System.out.println("==================================");
		
		HelloJp obj2 = ctx.getBean("t2", HelloJp.class);
		obj2.bye1();
		obj2.bye2();
		obj2.bye3();
		System.out.println("==================================");
		
		HelloEn obj3 = ctx.getBean("t3", HelloEn.class);
		obj3.Hi2();
		obj2.bye2();
		System.out.println("==================================");
		
		ctx.close();
	}
}
