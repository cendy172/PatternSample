package com.liqing.component;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.liqing.BaseOutputTest;

public class TunerTest extends BaseOutputTest
{

	private Tuner tuner;

	@Before
	public void setUp()
	{
        super.setUp();
		tuner = new Tuner("fake_tuner", new Amplifier("fake_amplifier"));
	}

	@Test
	public void shouldPrintOnWhenTurnOn()
	{
		tuner.on();
		assertOutPut("on");
	}

	@Test
	public void shouldPrintOffWhenTurnOff()
	{
		tuner.off();
		assertOutPut("off");
	}

	@Test
	public void shouldOutputWhenSetFrequency()
	{
		tuner.setFrequency(0.5);
		assertOutPut("setting frequency to 0.5");
	}

	@Test
	public void shouldOutputWhenSetAm()
	{
		tuner.setAm();
		assertOutPut("setting AM mode");
	}

	@Test
	public void shouldOutputVolumeWhenSetFm()
	{
		tuner.setFm();
		assertOutPut("setting FM mode");
	}

	@Test
	public void shouldReturnDescriptionWhenToString()
	{
		String description = tuner.toString();
		assertThat(description, is("fake_tuner"));
	}
}
