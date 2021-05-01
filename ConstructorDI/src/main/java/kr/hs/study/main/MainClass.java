package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.DataBean;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestUser;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		// 자바코드로 obj1이라는 객체 생성해서 멤버변수 값을 출력
		TestBean1 obj1 = new TestBean1();
		obj1.prData();
		System.out.println("=======================");
		
		TestBean1 obj2 = ctx.getBean("t2", TestBean1.class);
		obj2.prData();
		System.out.println("=======================");
		
		TestBean1 obj3 = ctx.getBean("t3", TestBean1.class);
		obj3.prData();
		System.out.println("=======================");
		
		TestBean1 obj4 = ctx.getBean("t4", TestBean1.class);
		obj4.prData();
		System.out.println("=======================");
		
		TestBean1 obj5 = ctx.getBean("t5", TestBean1.class);
		obj5.prData();
		System.out.println("=======================");
		
		TestBean2 obj6 = ctx.getBean("t6", TestBean2.class);
		DataBean d1 = new DataBean();
		obj6.prData();
		System.out.println("=======================");
		
		/**
		TestUser obj7 = ctx.getBean("testUser", TestUser.class);
		obj7.prData();
		System.out.println("=======================");
		**/
		 		
		TestBean3 obj8 = ctx.getBean("t7", TestBean3.class);
		System.out.println("obj8.data1 : " + obj8.getData1());
		System.out.println("obj8.data2 : " + obj8.getData2());
		System.out.println("=======================");
		
		ctx.close();
	}

}
