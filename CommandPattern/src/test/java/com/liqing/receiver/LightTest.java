package com.liqing.receiver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.liqing.command.BaseOutputTest;

public class LightTest extends BaseOutputTest
{

	private Light light;

	@Before
	public void setUp()
	{
		super.setUp();
		light = new Light("light in bed room");
	}

	@After
	public void tearDown()
	{
		super.tearDown();
	}

	@Test
	public void shouldOn()
	{
		light.on();
		assertOutPut("Light is on");
	}

	@Test
	public void shouldOff()
	{
		light.off();
		assertOutPut("Light is off");
	}
}
