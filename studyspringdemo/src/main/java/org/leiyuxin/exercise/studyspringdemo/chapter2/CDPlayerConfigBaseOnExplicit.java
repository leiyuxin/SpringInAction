package org.leiyuxin.exercise.studyspringdemo.chapter2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfigBaseOnExplicit {

	@Bean
	public CompactDisc sgtPepers() {
		return new SgtPeppers();
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
