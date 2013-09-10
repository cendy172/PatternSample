package com.liqing.adapter;

import org.junit.Before;
import org.junit.Test;

import com.liqing.duck.BaseOutputTest;
import com.liqing.duck.MallardDuck;

public class DuckToTurkeyTest extends BaseOutputTest
{
	private DuckToTurkey duckToTurkey;

	@Before
	public void setUp()
	{
		super.setUp();
		duckToTurkey = new DuckToTurkey(new MallardDuck());
	}

	@Test
	public void shouldFlyLikeADuckWhenTurkeyAdapterFly()
	{
		duckToTurkey.fly();
		assertOutPut("I'm flying");
	}

	@Test
	public void shouldLikeADuckQuackWhenTurkeyAdapterGobble()
	{
		duckToTurkey.gobble();
		assertOutPut("Quack");
	}
}
