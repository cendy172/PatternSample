package com.liqing.receiver;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.liqing.command.BaseOutputTest;

public class CeilingFanTest extends BaseOutputTest
{

	private CeilingFan ceilingFan;

	@Override
	@Before
	public void setUp()
	{
		super.setUp();
		ceilingFan = new CeilingFan("fake_ceilingFan_inBedroom");
	}

	@Test
	public void shouldBeHigh()
	{
		ceilingFan.high();
		assertOutPut(" ceiling fan is on high");
		assertThat(ceilingFan.getSpeed(), is(2));
	}

	@Test
	public void shouldBeMedium()
	{
		ceilingFan.medium();
		assertOutPut("ceiling fan is on medium");
		assertThat(ceilingFan.getSpeed(), is(1));
	}

	@Test
	public void shouldBeLow()
	{
		ceilingFan.low();
		assertOutPut("ceiling fan is on low");
		assertThat(ceilingFan.getSpeed(), is(0));
	}

	@Test
	public void shouldBeOff()
	{
		ceilingFan.off();
		assertOutPut(" ceiling fan is off");
	}

	@Test
	public void shouldCanGetSpeed()
	{
		assertThat(ceilingFan.getSpeed(), is(0));
	}
}
