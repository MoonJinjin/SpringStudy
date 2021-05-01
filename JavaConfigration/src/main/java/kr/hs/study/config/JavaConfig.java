package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

@Configuration
public class JavaConfig {
	
	@Bean(name = "new", initMethod = "init", destroyMethod = "destroy")
	@Lazy
	@Scope("prototype")
	public TestBean1 java1() { // method 이름 java1이 bean의 id -> @Bean에서 name을 new로 정의했으므로 bean의 id는 new
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean
	public TestBean2 java2() {
		TestBean2 t2 = new TestBean2(10, "spring1", new DataBean2());
		return t2;
	}
	
	@Bean
	public TestBean2 java3() {
		TestBean2 t3 = new TestBean2();
		t3.setA(300);
		t3.setB("spring3");
		t3.setC(new DataBean2());
		return t3;
	}

}