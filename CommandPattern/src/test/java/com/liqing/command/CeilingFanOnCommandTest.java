package com.liqing.command;

import org.junit.Before;
import org.junit.Test;

import com.liqing.receiver.CeilingFan;

public class CeilingFanOnCommandTest extends BaseOutputTest
{
	private CeilingFanOnCommand ceilingFanOnCommand;

	@Override
	@Before
	public void setUp()
	{
		super.setUp();
		ceilingFanOnCommand = new CeilingFanOnCommand(new CeilingFan("fake_ceilingFan_inBedroom"));
	}

	@Test
	public void shouldSetCeilingFanHighWhenExecuteCommand()
	{
        ceilingFanOnCommand.execute();
		assertOutPut("ceiling fan is on high");
	}
}
