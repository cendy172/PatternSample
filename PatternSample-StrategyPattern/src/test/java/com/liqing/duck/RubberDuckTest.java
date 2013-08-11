package com.liqing.duck;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * User: LiQing Date: 8/11/13 Time: 11:21 AM
 */
public class RubberDuckTest
{
	private ByteArrayOutputStream byteArrayOutputStream;
	private RubberDuck rubberDuck;

	@Before
	public void setUp()
	{
		rubberDuck = new RubberDuck();
		byteArrayOutputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteArrayOutputStream));
	}

	@Test
	public void shouldDisplayDuckType()
	{
		rubberDuck.display();
		assertThat(byteArrayOutputStream.toString(), containsString("I'm a Rubber Duck!"));
	}

	@After
	public void tearDown()
	{
		System.setOut(null);
	}

}
