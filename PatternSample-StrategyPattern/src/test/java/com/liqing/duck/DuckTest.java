package com.liqing.duck;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.liqing.fly.FlyBehavior;
import com.liqing.quack.QuackBehavior;

/**
 * User: LiQing Date: 8/11/13 Time: 10:31 AM
 */
public class DuckTest
{
	private Duck duck;
	private ByteArrayOutputStream byteArrayOutputStream;

	@Mock
	private FlyBehavior flyBehavior;
	@Mock
	private QuackBehavior quackBehavior;

	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
		duck = new FakeDuck(flyBehavior, quackBehavior);
		byteArrayOutputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteArrayOutputStream));
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
		assertThat(byteArrayOutputStream.toString(), containsString("All ducks float, event decoys"));
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
