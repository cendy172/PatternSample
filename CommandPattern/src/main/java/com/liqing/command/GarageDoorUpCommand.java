package com.liqing.command;

import com.liqing.receiver.GarageDoor;

public class GarageDoorUpCommand implements Command
{
	private GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor)
	{
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute()
	{
		this.garageDoor.up();
	}
}
