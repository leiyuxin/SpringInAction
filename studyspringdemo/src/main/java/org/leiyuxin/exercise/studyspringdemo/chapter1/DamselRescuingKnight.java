package org.leiyuxin.exercise.studyspringdemo.chapter1;

public class DamselRescuingKnight implements Knight{
	private ResueDamselQuest quest;
	public DamselRescuingKnight() {
		this.quest = new ResueDamselQuest() { //耦合代码

			@Override
			public void embark() {
			}
		};

		Quest quest = this.quest;
	}

	public void embarkOnQuest() {
		quest.embark();
	}


}
