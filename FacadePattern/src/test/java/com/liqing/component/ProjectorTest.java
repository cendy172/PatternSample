package com.liqing.component;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import org.junit.Before;
import org.junit.Test;

import com.liqing.BaseOutputTest;

public class ProjectorTest extends BaseOutputTest
{

	private Projector projector;

	@Override
	@Before
	public void setUp()
	{
		super.setUp();
		projector = new Projector("fake_projector", new DvdPlayer("fake_dvdplayer", new Amplifier("fake_amplifier")));
	}

	@Test
	public void shouldOnWhenTurnOn()
	{
		projector.on();
		assertOutPut("on");
	}

	@Test
	public void shouldOffWhenTurnOff()
	{
		projector.off();
		assertOutPut("off");
	}

	@Test
	public void shouldBeWideScreenWhenSetWideScreenMode()
	{
		projector.wideScreenMode();
		assertOutPut("in widescreen mode (16x9 aspect ratio)");
	}

	@Test
	public void shouldBeTVWhenTurnToTVMode()
	{
		projector.tvMode();
		assertOutPut("in tv mode (4x3 aspect ratio)");
	}

	@Test
	public void shouldReturnDescriptionWhenToString()
	{
		String projectorDescription = projector.toString();
		assertThat(projectorDescription, containsString("fake_projector"));
	}
}
