package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdviceClass {
	public void before() {
		System.out.println("before ȣ��");
	}
	public void after() {
		System.out.println("after ȣ��");
	}
	public void around() {
		System.out.println("around ȣ��");
	}
	public void after_returning() {
		System.out.println("after_returning");
	}
	public void after_throwing() {
		System.out.println("after_throwing");
	}
}
