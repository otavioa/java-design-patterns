package br.com.designpattern.creators.builder;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class ComputerBuilderTest {

	@Test
	public void buildAComputer() {
		Computer computer = Computer.builder()
				.setDescription("Gamer PC")
				.setCpu(new Cpu("Core i7"))
				.setMemory(new Memory(2048))
				.setHD(new HD("SSD", 256))
				.build();
		
		assertThat(computer.getDescription(), equalTo("Gamer PC"));
		assertThat(computer.getCpu().getDescription(), equalTo("Core i7"));
		assertThat(computer.getMemory().getGbSize(), equalTo(2048));
		assertThat(computer.getHd().toString(), equalTo("HD: SSD Size: 256"));
	}

}
