package com.liqing.component;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import org.junit.Before;
import org.junit.Test;

import com.liqing.BaseOutputTest;

public class ScreenTest extends BaseOutputTest
{

	private Screen fake_screen;

	@Override
	@Before
	public void setUp()
	{
		super.setUp();
		fake_screen = new Screen("fake_screen");
	}

	@Test
	public void shouldUpWhenUpTheScreen()
	{
		fake_screen.up();
		assertOutPut("going up");
	}

	@Test
	public void shouldDownWhenDownTheScreen()
	{
		fake_screen.down();
		assertOutPut("going down");
	}

	@Test
	public void shouldReturnDescriptionWhenToString()
	{
		String screenDescription = fake_screen.toString();
		assertThat(screenDescription, containsString("fake_screen"));
	}
}
