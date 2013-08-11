package com.liqing.fly;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.liqing.BaseConsoleOutputTest;

/**
 * User: LiQing Date: 8/11/13 Time: 9:57 AM
 */
public class FlyWithWingsTest extends BaseConsoleOutputTest
{

	private FlyWithWings flyWithWings;

	@Before
	public void setUp()
	{
		super.setUp();
		flyWithWings = new FlyWithWings();
	}

	@Test
	public void shouldDisplayFlyWithWings()
	{
		flyWithWings.fly();
		shouldPrintCorrectContent("I'm flying");
	}

	@After
	public void tearDown()
	{
		super.tearDown();
	}
}
