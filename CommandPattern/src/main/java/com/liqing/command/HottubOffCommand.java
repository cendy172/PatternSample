package com.liqing.command;

import com.liqing.receiver.Hottub;

public class HottubOffCommand implements Command
{
	private Hottub hottub;

	public HottubOffCommand(Hottub hottub)
	{
		this.hottub = hottub;
	}

	@Override
	public void execute()
	{
		this.hottub.cool();
		this.hottub.off();
	}

}
