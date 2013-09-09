package com.liqing.quack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.liqing.BaseConsoleOutputTest;

/**
 * User: LiQing Date: 8/11/13 Time: 10:22 AM
 */
public class SqueakTest extends BaseConsoleOutputTest
{

	private Squeak squeak;

	@Before
	public void setUp()
	{
		super.setUp();
		squeak = new Squeak();
	}

	@Test
	public void shouldSqueakWhenDuckIsSqueak()
	{
		squeak.quack();
		shouldPrintCorrectContent("Squeak");
	}

	@After
	public void tearDown()
	{
		super.tearDown();
	}
}
