package com.liqing.duck;

import com.liqing.fly.FlyBehavior;
import com.liqing.quack.QuackBehavior;

public abstract class Duck
{

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck()
	{
	}

	public void setFlyBehavior(FlyBehavior flyBehavior1)
	{
		this.flyBehavior = flyBehavior1;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior1)
	{
		this.quackBehavior = quackBehavior1;
	}

	public abstract void display();

	public void performFly()
	{
		this.flyBehavior.fly();
	}

	public void performQuack()
	{
		this.quackBehavior.quack();
	}

	public void swim()
	{
		System.out.println("All ducks float, event decoys");
	}

}
