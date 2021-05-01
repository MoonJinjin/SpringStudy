package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean3;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
public class JavaConfig {
	// 200 55.55 林家蔼 2俺 林家蔼 2俺
	@Bean
	public TestBean3 java1() {
		TestBean3 t3 = new TestBean3(200, 55.55, new DataBean3(), new DataBean4());
		return t3;
	}
}
