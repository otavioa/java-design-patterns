package br.com.designpattern.creators.singleton;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void test() {
		Singleton singleton = Singleton.getDefaultInstance();
        Singleton anotherSingleton = Singleton.getInstance("ANOTRHER ONE");
        
        assertThat(singleton, equalTo(anotherSingleton));
        
        assertThat(singleton.getSomeValue().get(), equalTo("INSTANCE"));
        assertThat(anotherSingleton.getSomeValue().get(), equalTo("INSTANCE"));
	}

}
