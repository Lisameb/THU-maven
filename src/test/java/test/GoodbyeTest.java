package test;

import static org.junit.Assert.*;

import org.junit.Test;

import maven.Goodbye;

public class GoodbyeTest {

	@Test
	public void test() {
	
		Goodbye Goodbye = new Goodbye();
		assert(Goodbye.isAlive());
	}

}
