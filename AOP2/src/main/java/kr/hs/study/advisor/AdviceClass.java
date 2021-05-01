package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdviceClass {
	public void before() {
		System.out.println("before ȣ��");
	}
	public void after() {
		System.out.println("after ȣ��");
	}
	public int around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around ȣ��1");
		int a = (Integer) pjp.proceed();
		System.out.println("around ȣ��2");
		return a;
	}
	public void after_Throwing(Exception e) {
		System.out.println("after throwing ȣ��");
	}
}
