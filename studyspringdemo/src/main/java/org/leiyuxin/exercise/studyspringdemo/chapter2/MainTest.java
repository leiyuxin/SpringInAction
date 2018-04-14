package org.leiyuxin.exercise.studyspringdemo.chapter2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		// 通过自动配置，隐式生成Bean
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
		// CompactDisc cd = context.getBean(CompactDisc.class);
		// CompactDisc cd = (CompactDisc) context.getBean("sgtPeppers");//Spring为bean
		// ID:实际类名首字母小写
		CompactDisc cd = (CompactDisc) context.getBean("specialComponentName");
		cd.play();

		System.out.println(context.getBean("lyx"));
		System.out.println(context.getBeanDefinitionCount());
		context.close();

		// 通过java 配置 显示生成bean;
		context = new AnnotationConfigApplicationContext(CDPlayerConfigBaseOnExplicit.class);
		cd = (CompactDisc) context.getBean("lyx");
		cd.play();
		System.out.println(cd);
		System.out.println(context.getBeanDefinitionCount());
		context.close();

		ClassPathXmlApplicationContext contextXml = new ClassPathXmlApplicationContext("autoConfig.xml");
		cd = (CompactDisc) contextXml.getBean("randomBeatlesCD");
		cd.play();

		System.out.println(contextXml.getBean(CDPlayerConfigBaseOnExplicit.class));
		context.close();
	}
}
