package com.liqing.adapter;

import com.liqing.duck.Duck;
import com.liqing.turkey.Turkey;

public class TurkeyToDuck implements Duck
{
	private final Turkey turkey;

	public TurkeyToDuck(Turkey turkey)
	{
		this.turkey = turkey;
	}

	@Override
	public void quack()
	{
		this.turkey.gobble();
	}

	@Override
	public void fly()
	{
		this.turkey.fly();
	}
}
