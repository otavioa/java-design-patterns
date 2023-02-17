package br.com.designpattern.creators.factory;

public abstract class Season {

	static final Season SUMMER = new Summer();
	static final Season WINTER = new Winter();
	static final Season SPRING = new Spring();
	static final Season FALL = new Fall();
	
	public static final Season getSeasonFrom(int month) {
		return SeasonFactory.getSeasonFrom(month);
	}
	
	public abstract String getSeasonDescription();
}
