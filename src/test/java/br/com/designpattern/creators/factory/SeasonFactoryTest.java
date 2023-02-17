package br.com.designpattern.creators.factory;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SeasonFactoryTest {

	@Test
	public void seasonSummer() {
		assertSeasonDescription(2, "Hey! I'm Summer, and i'm hot as hell :)");
	}
	
	@Test
	public void seasonFall() {
		assertSeasonDescription(5, "Making every tree naked!");
	}
	
	@Test
	public void seasonWinter() {
		assertSeasonDescription(7, "It's so cold in here!");
	}
	
	@Test
	public void seasonSpring() {
		assertSeasonDescription(11, "I'm not hot, but not cold too");
	}

	private void assertSeasonDescription(int month, String expectedMessage) {
		Season season = Season.getSeasonFrom(month);
		String seasonDescription = season.getSeasonDescription();
		
		assertThat(seasonDescription, equalTo(expectedMessage));
	}

}
