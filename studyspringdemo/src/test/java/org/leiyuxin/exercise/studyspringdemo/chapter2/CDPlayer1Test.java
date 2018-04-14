package org.leiyuxin.exercise.studyspringdemo.chapter2;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayer1Test {
@Rule
public final SystemOutRule runle = new SystemOutRule().enableLog();

@Autowired
private MediaPlayer player;
@Autowired
private CompactDisc cd;
@Test
public void cdShouldNotBeNull() {
	assertNotNull(cd);
}

@Test
public void play() {
	player.work();
	String s = runle.getLog();
	System.out.println( s );
}

}
