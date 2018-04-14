package org.leiyuxin.exercise.studyspringdemo.chapter2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfigBaseOnExplicit {

	@Bean
	public CompactDisc sgtPepers() {
		return new SgtPeppers();
	}

	/*@Bean void ss() {  Bean注解必须修饰有返回值的
		System.out.println("无返回值的Bean修饰");
	}*/
/*	@Bean CDPlayer cdPlayer() { //有依赖的装配 方式一,虽然每次都调用whiteAlum()这个方法但是它只返回一个是单例的,主要是被注解Bean修饰所有Spring会拦截
		return new CDPlayer(whiteAlum());
	}*/
	@Bean CDPlayer cdPlayer(WhiteAlum w) { //有依赖的装配 方式二
		return new CDPlayer(w);
		}
	@Bean CDPlayer cd1Player() { //有依赖的装配 方式二
		return new CDPlayer(whiteAlum());
		}
	@Bean WhiteAlum whiteAlum() {
		return new WhiteAlum();
	}
	@Bean String sss() {
		System.out.println("返回值String的Bean修饰");
		return "sss";
	}
	@Bean(name = "lyx")
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}

	@Bean
	public CompactDisc randomBeatlesCD() {
		int choice = (int) Math.floor(Math.random() * 3);
		if (choice == 0) {
			return new Revolver();
		} else if (choice == 1) {
			return new WhiteAlum();
		} else  {
			return new HardDaySNight();
		}
	}
}
