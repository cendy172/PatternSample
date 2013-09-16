package com.liqing.command;

import org.junit.Before;
import org.junit.Test;

import com.liqing.receiver.CeilingFan;

public class CeilingFanOffCommandTest extends BaseOutputTest
{

	private CeilingFanOffCommand ceilingFanOffCommand;

	@Before
	public void setUp()
	{
		super.setUp();
		ceilingFanOffCommand = new CeilingFanOffCommand(new CeilingFan("fake_ceilingFan_InBedroom"));
	}

	@Test
	public void shouldExecute()
	{
		ceilingFanOffCommand.execute();
		assertOutPut(" ceiling fan is off");
	}
}
