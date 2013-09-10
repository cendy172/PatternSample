package com.liqing.adapter;

import com.liqing.duck.Duck;
import com.liqing.turkey.Turkey;

public class DuckToTurkey implements Turkey
{
	private final Duck duck;

	public DuckToTurkey(Duck duck)
	{
		this.duck = duck;
	}

	@Override
	public void gobble()
	{
		this.duck.quack();
	}

	@Override
	public void fly()
	{
		this.duck.fly();
	}
}
