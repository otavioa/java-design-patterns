package br.com.designpattern.creators.factory;

import static br.com.designpattern.creators.factory.Season.FALL;
import static br.com.designpattern.creators.factory.Season.SPRING;
import static br.com.designpattern.creators.factory.Season.SUMMER;
import static br.com.designpattern.creators.factory.Season.WINTER;
import static java.util.Arrays.asList;

import java.util.List;

class SeasonFactory {

	private static final List<Season> seasonKeys = 
			asList(SUMMER, SUMMER, SUMMER, FALL, FALL, FALL, WINTER, WINTER, WINTER, SPRING, SPRING, SPRING);
	
	public static Season getSeasonFrom(int month) {
		return seasonKeys.get(month);
	}
	
}
