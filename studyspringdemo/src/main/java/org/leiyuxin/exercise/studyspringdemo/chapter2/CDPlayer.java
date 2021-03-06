package org.leiyuxin.exercise.studyspringdemo.chapter2;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;
	@Autowired
	public CDPlayer(WhiteAlum cd) { // 当生成CDPlayer 的时候他会在bean 容器中找到这个类型的Bean这个Bean应该具有唯一性，针对构造器注入，当生成bean的时候如果有无参构造最先调用，否则调用其他构造
		this.cd = cd;
		System.out.println("带有WHiteAlum 的构造函数被调用");

	}
/*	public CDPlayer(SgtPeppers cd,String s) { // 当生成CDPlayer 的时候他会在bean 容器中找到这个类型的Bean这个Bean应该具有唯一性，针对构造器注入，当生成bean的时候如果有无参构造最先调用，否则调用其他构造,且构造函数是唯一的
		this.cd = cd;
	}
*/

	/*public CDPlayer() {
		// TODO Auto-generated constructor stub
		System.out.println("CDPlayer 无参数构造被调用");
	}*/

	@Override
	public void work() {
		cd.play();
		System.out.println("CDPlayer 工作了");

	}

	@Autowired(required = false) // 如果required 设置为false 意味着所需要的bean 可以不存在不会报错，如果有多个bean满足则会报错，设置false 小心空指针
	public void insertDisc(WhiteAlum cd) {
		this.cd = cd;
	}

/*	@Inject // 大多数情况下Inject 与Autowired 等价的但是，它没有 require的属性,注解Inject 与Autowried 修饰的方法最好有参数否则会出现警告
	public void insertDisc() {
		System.out.println("在检查到Autowired注解的时候调用此方法");
	}*/

}
