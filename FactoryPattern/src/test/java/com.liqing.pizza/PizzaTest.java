package com.liqing.pizza;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PizzaTest
{

	private ByteArrayOutputStream byteArrayOutputStream;
	private FakePizza fakePizza;

	@Before
	public void setUp()
	{
		byteArrayOutputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteArrayOutputStream));
		fakePizza = new FakePizza();
	}

	@Test
	public void shouldReturnName()
	{
		fakePizza.setName("fake pizza");

		String name = fakePizza.getName();

		assertThat(name, containsString("fake pizza"));
	}

	@Test
	public void shouldCutPizzaWhenNeedCut()
	{
		fakePizza.cut();
		assertThat(byteArrayOutputStream.toString(), containsString("Cutting the pizza into diagonal slices"));
	}

	@Test
	public void shouldBoxPizzaWhenNeedBox()
	{
		fakePizza.box();

		assertThat(byteArrayOutputStream.toString(), containsString("Place pizza in official PizzaStore box"));
	}

	@Test
	public void shouldPrintPizzaType()
	{
		fakePizza.setName("fake pizza");
		String pizzaDescription = fakePizza.toString();
		assertThat(pizzaDescription, containsString("---- fake pizza ----"));
	}

	@Test
	public void shouldBakePizzaWhenNeedBake()
	{
		fakePizza.bake();

		assertThat(byteArrayOutputStream.toString(), containsString("Bake for 25 minutes at 350"));
	}

	@After
	public void tearDown()
	{
		System.setOut(null);
	}

	private class FakePizza extends Pizza
	{

		@Override
		public void prepare()
		{

		}
	}
}
