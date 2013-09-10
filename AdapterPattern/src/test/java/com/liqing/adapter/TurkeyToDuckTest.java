package com.liqing.adapter;

import org.junit.Before;
import org.junit.Test;

import com.liqing.duck.BaseOutputTest;
import com.liqing.turkey.WildTurkey;

public class TurkeyToDuckTest extends BaseOutputTest
{
	private TurkeyToDuck turkeyToDuck;

	@Before
	public void setUp()
	{
		super.setUp();
		turkeyToDuck = new TurkeyToDuck(new WildTurkey());
	}

	@Test
	public void shouldQuackWhenDuckAdapterGobble()
	{
		turkeyToDuck.quack();
		assertOutPut("Gobble gobble");
	}

	@Test
	public void shouldFlyLikeATurkeyWhenDuckAdapterFLy()
	{
		turkeyToDuck.fly();
		assertOutPut("I'm flying a short distance");
	}
}
