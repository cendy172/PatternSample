package com.liqing.receiver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.liqing.command.BaseOutputTest;

public class HottubTest extends BaseOutputTest
{

	private Hottub hottub;

	@Before
	public void setUp()
	{
		super.setUp();
		hottub = new Hottub();
	}

	@Test
	public void shouldBubblesOn()
	{
		hottub.on();

		hottub.bubblesOn();

		assertOutPut("Hottub is bubbling!");
	}

	@Test
	public void shouldBubblesOff()
	{
		hottub.off();

		hottub.bubblesOff();

		assertOutPut("Hottub is not bubbling!");
	}

	@Test
	public void shouldJetsOn()
	{
		hottub.on();

		hottub.jetsOn();

		assertOutPut("Hottub jets are on");
	}

	@Test
	public void shouldJetsOff()
	{
		hottub.off();

		hottub.jetsOff();

		assertOutPut("Hottub jets are off");
	}

	@Test
	public void shouldHeat()
	{
		hottub.heat();

		assertOutPut("Hottub is heating to a steaming 105 degrees");
	}

	@Test
	public void shouldCool()
	{
		hottub.cool();
		assertOutPut("Hottub is cooling to 98 degrees");
	}

	@After
	public void tearDown()
	{
		super.tearDown();
	}
}
