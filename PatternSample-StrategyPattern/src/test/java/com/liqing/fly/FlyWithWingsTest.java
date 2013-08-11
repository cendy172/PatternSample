package com.liqing.fly;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * User: LiQing Date: 8/11/13 Time: 9:57 AM
 */
public class FlyWithWingsTest
{

	private ByteArrayOutputStream byteArrayOutputStream;
	private FlyWithWings flyWithWings;

	@Before
	public void setUp()
	{
		byteArrayOutputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteArrayOutputStream));
		flyWithWings = new FlyWithWings();
	}

	@Test
	public void shouldDisplayFlyWithWings()
	{
		flyWithWings.fly();
		assertThat(byteArrayOutputStream.toString(), containsString("I'm flying"));
	}

	@After
	public void tearDown()
	{
		System.setOut(null);

	}
}
