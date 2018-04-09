package org.leiyuxin.exercise.studyspringdemo.chapter1;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {
	PrintStream stream;
	public SlayDragonQuest(PrintStream stream) {
		// TODO Auto-generated constructor stub
		this.stream = stream;
	}


	@Override
	public void embark() {
		// TODO Auto-generated method stub
		stream.println("Embarking on quest to slay the dragon!");
	}

}
