package com.liqing.duck;

import org.junit.Before;
import org.junit.Test;

public class MallardDuckTest extends BaseOutputTest
{

	private MallardDuck mallardDuck;

	@Before
	public void setUp()
	{
		super.setUp();
		mallardDuck = new MallardDuck();
	}

	@Test
	public void shouldVoiceQuackWhenQuacking()
	{
		mallardDuck.quack();
		assertOutPut("Quack");
	}

	@Test
	public void shouldVoiceFlyWhenFlying()
	{
		mallardDuck.fly();
		assertOutPut("I'm flying");
	}
}
