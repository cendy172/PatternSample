package com.liqing.fly;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * User: LiQing Date: 8/11/13 Time: 9:53 AM
 */
public class FlyRocketPoweredTest
{

	private ByteArrayOutputStream byteArrayOutputStream;
	private FlyRocketPowered flyRocketPowered;

	@Before
	public void setUp()
	{
		byteArrayOutputStream = new ByteArrayOutputStream();
		flyRocketPowered = new FlyRocketPowered();
		System.setOut(new PrintStream(byteArrayOutputStream));
	}

	@Test
	public void shouldDisplayRocketFly()
	{
		flyRocketPowered.fly();
		assertThat(byteArrayOutputStream.toString(), containsString("I'm flying with a rocket!"));
	}

	@After
	public void tearDown()
	{
		System.setOut(null);
	}
}
