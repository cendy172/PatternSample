package com.liqing.command;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertThat;
import static org.junit.internal.matchers.StringContains.containsString;

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
