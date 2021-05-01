package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Test;
import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//컨테이너의 설정파일을 읽어오고 객체 생성해서 ioc컨테이너에 보관
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		//컨테이너야 니가 생성한 객체중에 TESTBEAN.CLASS타입의 객체를 가지고와서 T1에 넣어라
		/*
		 * Test t1 = ctx.getBean(TestBean.class); t1.method1();
		 */
		
		/*
		 * Test t1 = (Test) ctx.getBean("t1", TestBean.class); //t1.method1();
		 * System.out.println("t1: "+t1);
		 * 
		 * //t1 객체를 가지고와서 t2에 넣어 Test t2 = (Test) ctx.getBean("t1", TestBean.class);
		 * System.out.println("t2: "+t2); ctx.close();
		 */
		Test t2 = ctx.getBean("t2",TestBean2.class);
		ctx.close();
	}

}
