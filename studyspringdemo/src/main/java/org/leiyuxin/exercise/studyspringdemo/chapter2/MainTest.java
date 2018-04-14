package org.leiyuxin.exercise.studyspringdemo.chapter2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
		CompactDisc cd = context.getBean(CompactDisc.class);
		cd.play();
		context.close();
		ClassPathXmlApplicationContext contextXml = new ClassPathXmlApplicationContext("autoConfig.xml");
		cd = contextXml.getBean(CompactDisc.class);
		cd.play();
		context.close();
	}
}
