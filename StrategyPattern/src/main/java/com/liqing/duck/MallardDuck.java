package com.liqing.duck;

import com.liqing.fly.FlyWithWings;
import com.liqing.quack.Quack;

public class MallardDuck extends Duck
{

	public MallardDuck()
	{
		super.flyBehavior = new FlyWithWings();
		super.quackBehavior = new Quack();
	}

	@Override
	public void display()
	{
		System.out.println("I'm a real Mallard duck");
	}

}
