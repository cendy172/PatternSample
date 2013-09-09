package com.liqing.quack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.liqing.BaseConsoleOutputTest;

/**
 * User: LiQing Date: 8/11/13 Time: 10:10 AM
 */
public class QuackTest extends BaseConsoleOutputTest
{

	private Quack quack;

	@Before
	public void setUp()
	{
		super.setUp();
		quack = new Quack();
	}

	@Test
	public void shouldQuack()
	{
		quack.quack();
		shouldPrintCorrectContent("Quack!");
	}

	@After
	public void tearDown()
	{
		super.tearDown();
	}
}
