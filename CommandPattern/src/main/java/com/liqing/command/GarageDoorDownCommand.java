package com.liqing.command;

import com.liqing.receiver.GarageDoor;

public class GarageDoorDownCommand implements Command
{
	private GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor)
	{
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute()
	{
		this.garageDoor.down();
	}
}
