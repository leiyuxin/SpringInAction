package org.leiyuxin.exercise.studyspringdemo.chapter1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
		//Knight knight = (Knight)context.getBean("knight"); 与下面的等价
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}
}
