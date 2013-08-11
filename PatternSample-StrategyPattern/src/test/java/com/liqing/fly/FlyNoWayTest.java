package com.liqing.fly;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.liqing.BaseConsoleOutputTest;

public class FlyNoWayTest extends BaseConsoleOutputTest
{

	private FlyNoWay flyNoWay;

	@Before
	public void setUp()
	{
        super.setUp();
		flyNoWay = new FlyNoWay();
	}

	@Test
	public void shouldDisplayNoFly()
	{
		flyNoWay.fly();
		shouldPrintCorrectContent("I can't fly");
	}

    @After
    public void tearDown() {
        super.tearDown();
    }
}
