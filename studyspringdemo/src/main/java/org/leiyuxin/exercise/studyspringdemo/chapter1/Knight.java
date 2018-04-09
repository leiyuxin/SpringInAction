package org.leiyuxin.exercise.studyspringdemo.chapter1;

public interface Knight {
	public default void embarkOnQuest() {
		System.out.println("default knight");
	}
}
