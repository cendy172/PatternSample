package com.liqing.quack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.liqing.BaseConsoleOutputTest;

/**
 * User: LiQing Date: 8/11/13 Time: 10:07 AM
 */
public class MuteQuackTest extends BaseConsoleOutputTest
{

	private MuteQuack muteQuack;

	@Before
	public void setUp()
	{
		super.setUp();
		muteQuack = new MuteQuack();
	}

	@Test
	public void shouldDisplayMute()
	{
		muteQuack.quack();
		shouldPrintCorrectContent("Silence");
	}

	@After
	public void tearDown()
	{
		super.tearDown();
	}
}
