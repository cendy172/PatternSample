package com.liqing.command;

import org.junit.Before;
import org.junit.Test;

import com.liqing.receiver.Hottub;

public class HottubOffCommandTest extends BaseOutputTest
{

	private HottubOffCommand hottubOffCommand;

	@Override
	@Before
	public void setUp()
	{
		super.setUp();
		hottubOffCommand = new HottubOffCommand(new Hottub());
	}

	@Test
	public void shouldExecute()
	{
		hottubOffCommand.execute();
		assertOutPut("Hottub is cooling to 98 degrees");
	}
}
