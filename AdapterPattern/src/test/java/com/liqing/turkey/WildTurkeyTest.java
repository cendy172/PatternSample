package com.liqing.turkey;

import org.junit.Before;
import org.junit.Test;

import com.liqing.duck.BaseOutputTest;

public class WildTurkeyTest extends BaseOutputTest
{

	private WildTurkey wildTurkey;

	@Override
	@Before
	public void setUp()
	{
		super.setUp();
		wildTurkey = new WildTurkey();
	}

	@Test
	public void shouldVoiceGobbleWhenGobbling()
	{
		wildTurkey.gobble();
		assertOutPut("Gobble gobble");
	}

	@Test
	public void shouldVoiceFlyWhenFlying()
	{
		wildTurkey.fly();
		assertOutPut("I'm flying a short distance");
	}
}
