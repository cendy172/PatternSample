package com.liqing.component;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import org.junit.Before;
import org.junit.Test;

import com.liqing.BaseOutputTest;

public class TheaterLightsTest extends BaseOutputTest
{

	private TheaterLights lights;

	@Override
	@Before
	public void setUp()
	{
		super.setUp();
		lights = new TheaterLights("fake_theater_light");
	}

	@Test
	public void shouldOnWhenLightsOn()
	{
		lights.on();
		assertOutPut("on");
	}

	@Test
	public void shouldOffWhenLightOff()
	{
		lights.off();
		assertOutPut("off");
	}

	@Test
	public void shouldDimWhenLightDim()
	{
		lights.dim(2);
		assertOutPut("dimming to 2%");
	}

	@Test
	public void shouldReturnDescriptionWhenToString()
	{
		String dimDescription = lights.toString();
		assertThat(dimDescription, containsString("fake_theater_light"));
	}
}
