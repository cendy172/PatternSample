package com.liqing.command;

import org.junit.Before;
import org.junit.Test;

import com.liqing.receiver.GarageDoor;

public class GarageDoorUpCommandTest extends BaseOutputTest
{

	private GarageDoorUpCommand garageDoorUpCommand;

	@Override
	@Before
	public void setUp()
	{
		super.setUp();
		garageDoorUpCommand = new GarageDoorUpCommand(new GarageDoor("garage door"));
	}

	@Test
	public void shouldUpGarageDoorWhenExecuteUpCommand()
	{
		garageDoorUpCommand.execute();
		assertOutPut("Garage Door is Open");
	}
}
