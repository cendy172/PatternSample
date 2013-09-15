package com.liqing.command;

import com.liqing.receiver.CeilingFan;

public class CeilingFanOnCommand implements Command
{

	private final CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan)
	{
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute()
	{
		this.ceilingFan.high();
	}
}
