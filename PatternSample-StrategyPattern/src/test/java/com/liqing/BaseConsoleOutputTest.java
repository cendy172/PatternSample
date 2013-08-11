package com.liqing;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * User: LiQing Date: 8/11/13 Time: 8:05 PM
 */
public class BaseConsoleOutputTest
{

	private ByteArrayOutputStream byteArrayOutputStream;

	public void setUp()
	{
		byteArrayOutputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteArrayOutputStream));
	}

	public void shouldPrintCorrectContent(String content)
	{
		assertThat(byteArrayOutputStream.toString(), containsString(content));
	}

	public void tearDown()
	{
		System.setOut(null);
	}
}
