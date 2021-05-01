package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdviceClass {
	public void before() {
		System.out.println("before 호출");
	}
	public void after() {
		System.out.println("after 호출");
	}
	public void around() {
		System.out.println("around 호출");
	}
	public void after_returning() {
		System.out.println("after_returning");
	}
	public void after_throwing() {
		System.out.println("after_throwing");
	}
}
