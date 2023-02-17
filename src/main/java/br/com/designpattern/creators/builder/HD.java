package br.com.designpattern.creators.builder;

public class HD {

	private String type;
	private int size;

	public HD(String type, int size) {
		this.type = type;
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public int getSize() {
		return size;
	}
	
	@Override
	public String toString() {
		return "HD: " + getType() + " Size: " + getSize();
	}
	
}
