package org.leiyuxin.exercise.studyspringdemo.chapter1;

public class BraveKnight implements Knight {
	private Quest quest;
	public BraveKnight(Quest quest) {//构造器注入 没有自行创建探险任务。
		this.quest = quest;
	}
	public void embarkOnQuest() {
		quest.embark();
	}
}
