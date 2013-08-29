package com.liqing.component;

public class Screen
{

	private final String description;

	public Screen(String description)
	{
		this.description = description;
	}

	public void up()
	{
		System.out.println(this.description + " going up");
	}

	public void down()
	{
		System.out.println(this.description + " going down");
	}

	@Override
	public String toString()
	{
		return this.description;
	}
}
