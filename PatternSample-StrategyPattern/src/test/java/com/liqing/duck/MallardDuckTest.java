package com.liqing.duck;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

/**
 * User: LiQing Date: 8/11/13 Time: 10:26 AM
 */
public class MallardDuckTest
{

	private MallardDuck mallardDuck;
	private ByteArrayOutputStream byteArrayOutputStream;

	@Before
	public void setUp()
	{
		mallardDuck = new MallardDuck();
		byteArrayOutputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteArrayOutputStream));
	}

	@Test
	public void shouldDisplayDuckType()
	{
        mallardDuck.display();
        assertThat(byteArrayOutputStream.toString(), containsString("I'm a real Mallard duck"));
	}

	@After
	public void tearDown()
	{
		System.setOut(null);

	}
}
