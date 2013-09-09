package com.liqing.duck;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;

public class BaseOutputTest
{

	private ByteArrayOutputStream byteArrayOutputStream;

	@Before
	public void setUp()
	{
		byteArrayOutputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteArrayOutputStream));
	}

	protected void assertOutPut(String on)
	{
		assertThat(byteArrayOutputStream.toString(), containsString(on));
	}

	@After
	public void tearDown()
	{
		System.setOut(null);
	}
}
