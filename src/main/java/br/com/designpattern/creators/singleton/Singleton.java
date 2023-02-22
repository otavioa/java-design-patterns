package br.com.designpattern.creators.singleton;

import java.util.Optional;

public class Singleton {

	private static Singleton instance;
	private Optional<String> someValue;
	
	private Singleton(String someValue) {
		this.someValue = Optional.of(someValue);
	}
	
	public static Singleton getInstance(String someValue) {
		if(instance == null)
			instance = new Singleton(someValue);
		
		return instance;
	}
	
	public static Singleton getDefaultInstance() {
		return getInstance("INSTANCE");
	}
	
	public Optional<String> getSomeValue() {
		return someValue;
	}
	
}
