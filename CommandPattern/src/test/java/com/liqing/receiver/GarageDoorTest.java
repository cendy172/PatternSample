package com.liqing.receiver;

import org.junit.Before;
import org.junit.Test;

import com.liqing.command.BaseOutputTest;

public class GarageDoorTest extends BaseOutputTest
{

	private GarageDoor garageDoor;

	@Override
	@Before
	public void setUp()
	{
		super.setUp();
		garageDoor = new GarageDoor("Garage door");
	}

	@Test
	public void shouldUp()
	{
		garageDoor.up();
		assertOutPut("Garage Door is Open");
	}

	@Test
	public void shouldDown()
	{
		garageDoor.down();
		assertOutPut("Garage Door is Closed");
	}

	@Test
	public void shouldStop()
	{
		garageDoor.stop();
		assertOutPut("Garage Door is Stoped");
	}

	@Test
	public void shouldLightOn()
	{
		garageDoor.lightOn();
		assertOutPut("Garage light is on");
	}

	@Test
	public void shouldLightOff()
	{
		garageDoor.lightOff();
		assertOutPut("Garage light is off");
	}
}
