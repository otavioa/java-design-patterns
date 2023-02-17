package br.com.designpattern.creators.builder;


public class ComputerBuilder {

	private String description;
	private Cpu cpu;
	private Memory memory;
	private HD hd;

	public ComputerBuilder setDescription(String description) {
		this.description = description;
		return this;
	}

	public ComputerBuilder setCpu(Cpu cpu) {
		this.cpu = cpu;
		return this;
	}

	public ComputerBuilder setMemory(Memory memory) {
		this.memory = memory;
		return this;
	}

	public ComputerBuilder setHD(HD hd) {
		this.hd = hd;
		return this;
	}

	public Computer build() {
		return new Computer(description, cpu, memory, hd);
	}

}
