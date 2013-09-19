package com.liqing.command;

import org.junit.Before;
import org.junit.Test;

import com.liqing.receiver.GarageDoor;

public class GarageDoorDownCommandTest extends BaseOutputTest
{

	private GarageDoorDownCommand garageDoorDownCommand;

	@Override
	@Before
	public void setUp()
	{
		super.setUp();
		garageDoorDownCommand = new GarageDoorDownCommand(new GarageDoor("garage door"));
	}

	@Test
	public void shouldBeDownWhenExecuteDownCommand()
	{
		garageDoorDownCommand.execute();
		assertOutPut("Garage Door is Closed");
	}
}
