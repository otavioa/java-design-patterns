package br.com.designpattern.creators.builder;

public class Computer {

	private String description;
	private Cpu cpu;
	private Memory memory;
	private HD hd;

	protected Computer(String description, Cpu cpu, Memory memory, HD hd) {
		this.description = description;
		this.cpu = cpu;
		this.memory = memory;
		this.hd = hd;
	}

	public static ComputerBuilder builder() {
		return new ComputerBuilder();
	}

	public String getDescription() {
		return description;
	}

	public Cpu getCpu() {
		return cpu;
	}

	public Memory getMemory() {
		return memory;
	}

	public HD getHd() {
		return hd;
	}
	
}
