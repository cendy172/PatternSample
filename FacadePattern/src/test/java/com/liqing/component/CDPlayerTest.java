package com.liqing.component;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.liqing.BaseOutputTest;

public class CDPlayerTest extends BaseOutputTest
{

	private CDPlayer cdPlayer;

	@Override
	@Before
	public void setUp()
	{
		super.setUp();
		cdPlayer = new CDPlayer("fake_cdplayer", new Amplifier("fake_amplifier"));
	}

    @Test
    public void shouldPrintOnWhenTurnOn()
    {
        cdPlayer.on();
        assertOutPut("on");
    }

	@Test
	public void shouldPrintOffWhenTurnOff()
	{
		cdPlayer.off();
		assertOutPut("off");
	}

	@Test
	public void shouldOutputWhenEjectCD()
	{
		cdPlayer.eject();
		assertOutPut("eject");
	}

	@Test
	public void shouldOutputWhenSetSurroundSound()
	{
		cdPlayer.play("title");
		assertOutPut("playing \"title\"");
	}

	@Test
	public void shouldNotPlayingWhenNoTitle()
	{
		cdPlayer.play(1);
		assertOutPut("can't play track 1, no cd inserted");
	}

	@Test
	public void shouldPlayingWhenWithTitle()
	{
		cdPlayer.play("title");
		cdPlayer.play(1);
		assertOutPut("playing track 1");
	}

	@Test
	public void shouldOutputWhenStop()
	{
		cdPlayer.stop();
		assertOutPut("stopped");
	}

	@Test
	public void shouldOutputWhenPause()
	{
		cdPlayer.pause();
		assertOutPut("paused");
	}

	@Test
	public void shouldReturnDescriptionWhenToString()
	{
		String description = cdPlayer.toString();
		assertThat(description, is("fake_cdplayer"));
	}
}
