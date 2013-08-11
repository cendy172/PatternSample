package com.liqing.duck;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.liqing.BaseConsoleOutputTest;
import com.liqing.fly.FlyBehavior;
import com.liqing.quack.QuackBehavior;

/**
 * User: LiQing Date: 8/11/13 Time: 10:31 AM
 */
public class DuckTest extends BaseConsoleOutputTest
{
	private Duck duck;

	@Mock
	private FlyBehavior flyBehavior;
	@Mock
	private QuackBehavior quackBehavior;

	@Before
	public void setUp()
	{
		super.setUp();
		MockitoAnnotations.initMocks(this);
		duck = new FakeDuck(flyBehavior, quackBehavior);
	}

	@Test
	public void shouldFlyWhenDuckIsFlying()
	{
		duck.performFly();
		verify(flyBehavior, times(1)).fly();
	}

	@Test
	public void shouldQuackWhenDuckIsQuacking()
	{
		duck.performQuack();
		verify(quackBehavior, times(1)).quack();
	}

	@Test
	public void shouldSwimWhenDuckIsInWater()
	{
		duck.swim();
		shouldPrintCorrectContent("All ducks float, event decoys");
	}

	@After
	public void tearDown()
	{
		super.tearDown();
	}

	private class FakeDuck extends Duck
	{

		private FakeDuck(FlyBehavior flyBehavior1, QuackBehavior quackBehavior1)
		{
			setFlyBehavior(flyBehavior1);
			setQuackBehavior(quackBehavior1);
		}

		@Override
		public void display()
		{

		}
	}
}
