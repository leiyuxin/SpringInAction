package org.leiyuxin.exercise.studyspringdemo.chapter1;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class BraveKnightTest {
	@Test
	public void knightShouldEmbarkOnQuest() {
		Quest mockQuest = mock(Quest.class);//创建mock quest
		BraveKnight knight = new BraveKnight(mockQuest);//注入mock quest
		knight.embarkOnQuest();
		verify(mockQuest,times(1)).embark();

	}
}
