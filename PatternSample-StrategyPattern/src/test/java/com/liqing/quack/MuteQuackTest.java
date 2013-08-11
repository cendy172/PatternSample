package com.liqing.quack;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * User: LiQing Date: 8/11/13 Time: 10:07 AM
 */
public class MuteQuackTest
{

	private ByteArrayOutputStream byteArrayOutputStream;
	private MuteQuack muteQuack;

	@Before
	public void setUp()
	{
		byteArrayOutputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteArrayOutputStream));
		muteQuack = new MuteQuack();
	}

	@Test
	public void shouldDisplayMute()
	{
		muteQuack.quack();
		assertThat(byteArrayOutputStream.toString(), containsString("Silence"));
	}

	@After
	public void tearDown()
	{
		System.setOut(null);
	}
}
