package org.leiyuxin.exercise.studyspringdemo.chapter1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
		//Knight knight = (Knight)context.getBean("knight"); 与下面以class的方式等价
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();


		AnnotationConfigApplicationContext AnnotationContext = new AnnotationConfigApplicationContext(KnightConfig.class);
	  // String[] arrary = AnnotationContext.getBeanDefinitionNames("knight");
	    knight = AnnotationContext.getBean(BraveKnight.class);
	    knight.embarkOnQuest();
	    AnnotationContext.close();
	}
}
