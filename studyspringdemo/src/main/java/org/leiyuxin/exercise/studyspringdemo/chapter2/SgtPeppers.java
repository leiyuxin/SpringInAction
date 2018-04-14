package org.leiyuxin.exercise.studyspringdemo.chapter2;

import org.springframework.stereotype.Component;

@Component(value="specialComponentName")       //这个注解表明该类会作为组件类，并告知Spring要为这个类创建bean
public class SgtPeppers implements CompactDisc {
	private String title = "Sgt. Pepper's Lonely Hears Club Band";
	private String artist = "The Beatles";
	@Override
	public void play() {
		System.out.println("Test 成功");
	}




}
