package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		// xml ????
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx1.getBean("obj1", TestBean1.class);
		System.out.println("t1 : " + t1);
		System.out.println("===============================================");
		
		ctx1.close();
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		TestBean1 t2 = ctx2.getBean("new", TestBean1.class);
		System.out.println("t2 : " + t2);		
		TestBean1 t3 = ctx2.getBean("new", TestBean1.class);
		System.out.println("t3 : " + t3);
		TestBean1 t4 = ctx2.getBean("new", TestBean1.class);
		System.out.println("t4 : " + t4);
		TestBean1 t5 = ctx2.getBean("new", TestBean1.class);
		System.out.println("t5 : " + t5);
		System.out.println("===============================================");
		
		TestBean2 t6 = ctx2.getBean("java2", TestBean2.class);
		System.out.println("t6.a : " + t6.getA());
		System.out.println("t6.b : " + t6.getB());
		System.out.println("t6.c : " + t6.getC());
		System.out.println("===============================================");
		
		TestBean2 t7 = ctx2.getBean("java3", TestBean2.class);
		System.out.println("t7.a : " + t7.getA());
		System.out.println("t7.b : " + t7.getB());
		System.out.println("t7.c : " + t7.getC());
		
		ctx2.close();
		
		//java ????
		
	}

}