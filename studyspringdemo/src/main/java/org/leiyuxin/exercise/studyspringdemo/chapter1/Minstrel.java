package org.leiyuxin.exercise.studyspringdemo.chapter1;

import java.io.PrintStream;

public class Minstrel {
	private PrintStream stream;
	public Minstrel(PrintStream stream) {
		this.stream = stream;
	}
	public Minstrel() {
		// TODO Auto-generated constructor stub
	}
	public void singBeforeQuest() {
		stream.println("Fa  la la ,the knight is so brave! 探险之前调用");
	}

	public void singAfterQuest() {
		stream.println("Tee hee hee,the brave knight"+"did embark on a quest! 探险之后调用");
	}

}
