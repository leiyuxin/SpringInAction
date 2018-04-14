package org.leiyuxin.exercise.studyspringdemo.chapter2;

//import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component(value = "specialComponentName") // 这个注解表明该类会作为组件类，并告知Spring要为这个类创建bean
// @Named("specialComponentName") //Named 与Component 注解是等价的 Named 使用的java依赖注入规范
// 推荐使用Component
public class SgtPeppers implements CompactDisc {
	private String title = "Sgt. Pepper's Lonely Hears Club Band";
	private String artist = "The Beatles";

	@Override
	public void play() {
		System.out.println("SgtPeppers play 成功");
	}

}
