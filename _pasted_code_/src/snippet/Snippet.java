package snippet;

public class Snippet {
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
			//�����̳ʾ� �ϰ� ������ ��ü�߿� TESTBEAN.CLASSŸ���� ��ü�� ������ͼ� T1�� �־��
			/*
			 * Test t1 = ctx.getBean(TestBean.class); t1.method1();
			 */
			
			/*
			 * Test t1 = (Test) ctx.getBean("t1", TestBean.class); //t1.method1();
			 * System.out.println("t1: "+t1);
			 * 
			 * //t1 ��ü�� ������ͼ� t2�� �־� Test t2 = (Test) ctx.getBean("t1", TestBean.class);
			 * System.out.println("t2: "+t2); ctx.close();
			 */
			Test t2 = ctx.getBean("t2",TestBean2.class);
			ctx.close();
}

