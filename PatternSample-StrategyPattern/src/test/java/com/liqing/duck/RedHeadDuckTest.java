package com.liqing.duck;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * User: LiQing Date: 8/11/13 Time: 11:19 AM
 */
public class RedHeadDuckTest
{

	private RedHeadDuck redHeadDuck;
	private ByteArrayOutputStream byteArrayOutputStream;

	@Before
	public void setUp()
	{
		redHeadDuck = new RedHeadDuck();
		byteArrayOutputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteArrayOutputStream));
	}

	@Test
	public void shouldDisplayDuckType()
	{
		redHeadDuck.display();
		assertThat(byteArrayOutputStream.toString(), containsString("I'm a real RedHead duck!"));
	}

	@After
	public void tearDown()
	{
		System.setOut(null);
	}

}
