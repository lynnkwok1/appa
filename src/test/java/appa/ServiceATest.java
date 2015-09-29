package appa;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceATest {

	@Test
	public void testPlus() {
		IServiceA serviceA = new ServiceA();
		int result = serviceA.plus(10, 5);
		assertEquals(15, result);
	}

}
