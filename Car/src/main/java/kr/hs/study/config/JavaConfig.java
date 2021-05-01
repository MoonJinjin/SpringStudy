package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.HyunDai;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
public class JavaConfig {
	@Bean
	public HyunDai java1() {
		HyunDai t1 = new HyunDai("car1", "black");
		return t1;
	}
}
