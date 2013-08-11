package com.liqing.duck;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.liqing.BaseConsoleOutputTest;

/**
 * User: LiQing Date: 8/11/13 Time: 11:19 AM
 */
public class RedHeadDuckTest extends BaseConsoleOutputTest
{

	private RedHeadDuck redHeadDuck;

	@Before
	public void setUp()
	{
		super.setUp();
		redHeadDuck = new RedHeadDuck();
	}

	@Test
	public void shouldDisplayDuckType()
	{
		redHeadDuck.display();
		shouldPrintCorrectContent("I'm a real RedHead duck!");
	}

	@After
	public void tearDown()
	{
		super.tearDown();
	}

}
