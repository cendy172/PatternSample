package com.liqing.component;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import org.junit.Before;
import org.junit.Test;

import com.liqing.BaseOutputTest;

public class PopcornPopperTest extends BaseOutputTest
{

	private PopcornPopper popcornPopper;

	@Override
	@Before
	public void setUp()
	{
		super.setUp();
		popcornPopper = new PopcornPopper("fake_popcorn_popper");
	}

	@Test
	public void shouldOnWhenTurnOn()
	{
		popcornPopper.on();
		assertOutPut("on");
	}

	@Test
	public void shouldOffWhenTurnOff()
	{
		popcornPopper.off();
		assertOutPut("off");
	}

	@Test
	public void shouldPopCornWhenNeedPopper()
	{
		popcornPopper.pop();
		assertOutPut("pop");
	}

	@Test
	public void shouldReturnDescriptionWhenToString()
	{
		String dimDescription = popcornPopper.toString();
		assertThat(dimDescription, containsString("fake_popcorn_popper"));
	}
}
