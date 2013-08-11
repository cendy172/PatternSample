package com.liqing.duck;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.liqing.BaseConsoleOutputTest;

/**
 * User: LiQing Date: 8/11/13 Time: 10:26 AM
 */
public class MallardDuckTest extends BaseConsoleOutputTest
{

	private MallardDuck mallardDuck;

	@Before
	public void setUp()
	{
		super.setUp();
		mallardDuck = new MallardDuck();
	}

	@Test
	public void shouldDisplayDuckType()
	{
		mallardDuck.display();
		shouldPrintCorrectContent("I'm a real Mallard duck");
	}

	@After
	public void tearDown()
	{
		super.tearDown();
	}
}
