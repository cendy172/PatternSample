package com.liqing.command;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.liqing.receiver.Hottub;

public class HottubOnCommandTest extends BaseOutputTest
{

	private HottubOnCommand hottubOnCommand;

	@Before
	public void setUp()
	{
		super.setUp();
		hottubOnCommand = new HottubOnCommand(new Hottub());
	}

	@Test
	public void shouldExecute()
	{
		hottubOnCommand.execute();

		assertOutPut("Hottub is heating to a steaming 105 degrees");
		assertOutPut("Hottub is bubbling!");
	}

	@After
	public void tearDown()
	{
		super.tearDown();
	}
}
