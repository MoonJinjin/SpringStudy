package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Car;
import kr.hs.study.beans.HyunDai;
import kr.hs.study.config.JavaConfig;

public class main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		HyunDai hyundai = ctx.getBean("java1",HyunDai.class);
		System.out.println("АЁАн : "+hyundai.money(50000000));
		hyundai.order();
		hyundai.setName("avante");
		hyundai.setColor("blue");
		System.out.println("hyundai.name : " + hyundai.getName());
		System.out.println("hyundai.color : " + hyundai.getColor());
		
		
		
		ctx.close();
	}
}
