package com.liqing.fly;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FlyNoWayTest
{

	private ByteArrayOutputStream byteArrayOutputStream;
	private FlyNoWay flyNoWay;

	@Before
	public void setUp()
	{
		byteArrayOutputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteArrayOutputStream));
		flyNoWay = new FlyNoWay();
	}

	@Test
	public void shouldDisplayNoFly()
	{
		flyNoWay.fly();
		assertThat(byteArrayOutputStream.toString(), containsString("I can't fly"));
	}

	@After
	public void tearDown()
	{
		System.setOut(null);
	}
}
