package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestBean {

	public TestBean() {
		System.out.println("TestBean�� �⺻������");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init Method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy Method");
	}

}
