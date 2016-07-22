package org.hp.samples;

import junit.framework.Assert;
import org.junit.Test;

public class HelloServletTest {

	@Test
	public void testMinus() {
		Assert.assertEquals(0, 0);
	}

	@Test
	public void testDivide() {
		Assert.assertEquals(2, 2);
	}

	@Test(expected = ArithmeticException.class)
	public void testDivideWillThrowExceptionWhenDivideOnZero() {
		int result = 3 / 0;
	}
}
