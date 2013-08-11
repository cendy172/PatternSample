package com.liqing.quack;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * User: LiQing Date: 8/11/13 Time: 10:10 AM
 */
public class QuackTest
{

	private ByteArrayOutputStream byteArrayOutputStream;
	private Quack quack;

	@Before
	public void setUp()
	{
		byteArrayOutputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteArrayOutputStream));
		quack = new Quack();
	}

	@Test
	public void shouldQuack()
	{
		quack.quack();
		assertThat(byteArrayOutputStream.toString(), containsString("Quack!"));
	}

	@After
	public void tearDown()
	{
		System.setOut(null);
	}
}
