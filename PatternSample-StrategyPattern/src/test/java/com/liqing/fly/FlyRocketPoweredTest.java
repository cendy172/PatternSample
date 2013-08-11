package com.liqing.fly;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.liqing.BaseConsoleOutputTest;

/**
 * User: LiQing Date: 8/11/13 Time: 9:53 AM
 */
public class FlyRocketPoweredTest extends BaseConsoleOutputTest
{

	private FlyRocketPowered flyRocketPowered;

	@Before
	public void setUp()
	{
		super.setUp();
		flyRocketPowered = new FlyRocketPowered();
	}

	@Test
	public void shouldDisplayRocketFly()
	{
		flyRocketPowered.fly();
		shouldPrintCorrectContent("I'm flying with a rocket!");
	}

	@After
	public void tearDown()
	{
		super.tearDown();
	}

}
