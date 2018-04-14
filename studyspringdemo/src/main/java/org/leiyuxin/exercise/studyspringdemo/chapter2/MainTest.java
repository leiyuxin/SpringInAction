package org.leiyuxin.exercise.studyspringdemo.chapter2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
		CompactDisc cd = context.getBean(CompactDisc.class);
		cd.play();
	}
}
