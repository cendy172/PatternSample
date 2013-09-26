package com.liqing.command;

import org.junit.Before;
import org.junit.Test;

import com.liqing.receiver.Light;

public class LightOnCommandTest extends BaseOutputTest
{

	private LightOnCommand lightOnCommand;

	@Override
	@Before
	public void setUp()
	{
		super.setUp();
		lightOnCommand = new LightOnCommand(new Light("light in bedroom"));
	}

	@Test
	public void shouldExecute()
	{
		lightOnCommand.execute();
		assertOutPut("Light is on");
	}
}
