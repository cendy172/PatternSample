package com.liqing.duck;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.liqing.BaseConsoleOutputTest;

/**
 * User: LiQing Date: 8/11/13 Time: 11:21 AM
 */
public class RubberDuckTest extends BaseConsoleOutputTest
{
	private RubberDuck rubberDuck;

	@Before
	public void setUp()
	{
		super.setUp();
		rubberDuck = new RubberDuck();
	}

	@Test
	public void shouldDisplayDuckType()
	{
		rubberDuck.display();
		shouldPrintCorrectContent("I'm a Rubber Duck!");
	}

	@After
	public void tearDown()
	{
		super.tearDown();
	}

}
