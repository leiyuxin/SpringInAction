package org.leiyuxin.exercise.studyspringdemo.chapter2;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;

	public CDPlayer(CompactDisc cd) { // TODO Auto-generated constructor stub
		this.cd = cd;
	}

	public CDPlayer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		cd.play();
		System.out.println("CDPlayer 工作了");

	}

	@Autowired(required = false) // 如果required 设置为false 意味着所需要的bean 可以不存在不会报错，如果有多个bean满足则会报错，设置false 小心空指针
	public void insertDisc(WhiteAlum cd) {
		this.cd = cd;
	}

	@Inject // 大多数情况下Inject 与Autowired 等价的但是，它没有 require的属性
	public void insertDisc() {
		System.out.println("在检查到Autowired注解的时候调用此方法");
	}

}
