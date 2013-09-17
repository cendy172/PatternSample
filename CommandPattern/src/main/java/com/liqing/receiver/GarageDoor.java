package com.liqing.receiver;

public class GarageDoor
{
	private String location = "";

	public GarageDoor(String location)
	{
		super();
		this.location = location;
	}

	public void up()
	{
		System.out.println(location + "Garage Door is Open");
	}

	public void down()
	{
		System.out.println(location + "Garage Door is Closed");
	}

	public void stop()
	{
		System.out.println(location + "Garage Door is Stoped");
	}

	public void lightOn()
	{
		System.out.println(location + "Garage light is on");
	}

	public void lightOff()
	{
		System.out.println(location + "Garage light is off");
	}

}
