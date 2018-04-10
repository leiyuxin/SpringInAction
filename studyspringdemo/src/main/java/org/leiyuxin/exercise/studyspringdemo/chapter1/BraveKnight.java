package org.leiyuxin.exercise.studyspringdemo.chapter1;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.wiring.BeanConfigurerSupport;

public class BraveKnight extends BeanConfigurerSupport implements Knight,InitializingBean {
	private Quest quest;
	public BraveKnight(Quest quest) {//构造器注入 没有自行创建探险任务。
		this.quest = quest;
	}
	public void embarkOnQuest() {
		quest.embark();
	}
/*	@Override
	public void afterPropertiesSet() {

		System.out.println("InitializingBean interface  afterProertiesSet");

	}*/
}
