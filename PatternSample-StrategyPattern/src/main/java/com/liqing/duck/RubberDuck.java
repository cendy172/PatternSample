package com.liqing.duck;

import com.liqing.fly.FlyNoWay;
import com.liqing.quack.Squeak;

public class RubberDuck extends Duck
{

	public RubberDuck()
	{
		super.flyBehavior = new FlyNoWay();
		super.quackBehavior = new Squeak();
	}

	@Override
	public void display()
	{
		System.out.println("I'm a Rubber Duck!");
	}

}
