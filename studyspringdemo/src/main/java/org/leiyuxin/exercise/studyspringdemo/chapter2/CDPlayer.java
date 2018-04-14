package org.leiyuxin.exercise.studyspringdemo.chapter2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;
	/*
	 * public CDPlayer(CompactDisc cd) { // TODO Auto-generated constructor stub
	 * this.cd = cd; }
	 */
	@Override
	public void work() {
		cd.play();
		System.out.println("CDPlayer 工作了");

	}
	@Autowired
	public void insertDisc(CompactDisc cd) {
		this.cd = cd;
	}

	@Autowired
	public void insertDisc() {
		System.out.println("在检查到Autowired注解的时候调用此方法");
	}
}
