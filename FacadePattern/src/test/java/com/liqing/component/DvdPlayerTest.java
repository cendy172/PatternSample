package com.liqing.component;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.liqing.BaseOutputTest;

public class DvdPlayerTest extends BaseOutputTest
{

	private DvdPlayer dvdPlayer;

	@Override
	@Before
	public void setUp()
	{
		super.setUp();
		dvdPlayer = new DvdPlayer("fake_dvdplayer", new Amplifier("fake_amplifier"));
	}

	@Test
	public void shouldPrintOnWhenTurnOn()
	{
		dvdPlayer.on();
		assertOutPut("on");
	}

	@Test
	public void shouldPrintOffWhenTurnOff()
	{
		dvdPlayer.off();
		assertOutPut("off");
	}

	@Test
	public void shouldOutputWhenEjectCD()
	{
		dvdPlayer.eject();
		assertOutPut("eject");
	}

	@Test
	public void shouldOutputWhenSetSurroundSound()
	{
		dvdPlayer.play("title");
		assertOutPut("playing \"title\"");
	}

	@Test
	public void shouldNotPlayingWhenNoTitle()
	{
		dvdPlayer.play(1);
		assertOutPut("can't play track 1, no dvd inserted");
	}

	@Test
	public void shouldPlayingWhenWithTitle()
	{
		dvdPlayer.play("title");
		dvdPlayer.play(1);
		assertOutPut("playing track 1");
	}

	@Test
	public void shouldOutputWhenSetTwoChannelAudio()
	{
		dvdPlayer.setTwoChannelAudio();
		assertOutPut("set two channel audio");
	}

	@Test
	public void shouldOutputWhenSetSurroundAudio()
	{
		dvdPlayer.setSurroundAudio();
		assertOutPut("set surround audio");
	}

	@Test
	public void shouldOutputWhenStop()
	{
		dvdPlayer.stop();
		assertOutPut("stopped");
	}

	@Test
	public void shouldOutputWhenPause()
	{
		dvdPlayer.pause();
		assertOutPut("paused");
	}

	@Test
	public void shouldReturnDescriptionWhenToString()
	{
		String description = dvdPlayer.toString();
		assertThat(description, is("fake_dvdplayer"));
	}
}
