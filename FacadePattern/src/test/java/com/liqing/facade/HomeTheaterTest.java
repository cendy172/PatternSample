package com.liqing.facade;

import static org.mockito.Mockito.inOrder;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.liqing.BaseOutputTest;
import com.liqing.component.*;

public class HomeTheaterTest extends BaseOutputTest
{

	private HomeTheater homeTheater;
	@Mock
	private Amplifier amp;
	@Mock
	private Tuner tuner;
	@Mock
	private DvdPlayer dvd;
	@Mock
	private CDPlayer cd;
	@Mock
	private Projector projector;
	@Mock
	private TheaterLights lights;
	@Mock
	private Screen screen;
	@Mock
	private PopcornPopper popper;
	private InOrder verifyOrder;

	@Before
	public void setUp()
	{
		super.setUp();
		MockitoAnnotations.initMocks(this);
		homeTheater = new HomeTheater(amp, tuner, dvd, cd, projector, screen, lights, popper);
		verifyOrder = inOrder(amp, tuner, dvd, cd, projector, screen, lights, popper);
	}

	@Test
	public void shouldOpenAllComponentsWhenWatchMovie()
	{
		homeTheater.watchMovie("fake_name");
		assertOutPut("Get ready to watch a movie...");
		verifyOrder.verify(popper).on();
		verifyOrder.verify(popper).pop();
		verifyOrder.verify(lights).dim(10);
		verifyOrder.verify(screen).down();
		verifyOrder.verify(projector).on();
		verifyOrder.verify(projector).wideScreenMode();
		verifyOrder.verify(amp).on();
		verifyOrder.verify(amp).setDvd(dvd);
		verifyOrder.verify(amp).setSurroundSound();
		verifyOrder.verify(amp).setVolume(5);
		verifyOrder.verify(dvd).on();
		verifyOrder.verify(dvd).play("fake_name");
	}

	@Test
	public void shouldTurnOffComponentsWhenEndMovie()
	{
		homeTheater.endMovie();
		assertOutPut("Shutting movie theater down...");
		verifyOrder.verify(popper).off();
		verifyOrder.verify(lights).on();
		verifyOrder.verify(screen).up();
		verifyOrder.verify(projector).off();
		verifyOrder.verify(amp).off();
		verifyOrder.verify(dvd).stop();
		verifyOrder.verify(dvd).eject();
		verifyOrder.verify(dvd).off();
	}

	@Test
	public void shouldTurnOnComponentsWhenListenToCD()
	{
		homeTheater.listenToCd("fake_name");
		assertOutPut("Get ready for an audiopile experence...");
		verifyOrder.verify(lights).on();
		verifyOrder.verify(amp).on();
		verifyOrder.verify(amp).setVolume(5);
		verifyOrder.verify(amp).setCd(cd);
		verifyOrder.verify(amp).setStereoSound();
		verifyOrder.verify(cd).on();
		verifyOrder.verify(cd).play("fake_name");
	}

	@Test
	public void shouldTurnOffComponentsWhenEndListenToCD()
	{
		homeTheater.endCd();
		assertOutPut("Shutting down CD...");
		verifyOrder.verify(amp).off();
		verifyOrder.verify(amp).setCd(cd);
		verifyOrder.verify(cd).eject();
		verifyOrder.verify(cd).off();
	}

	@Test
	public void shouldTurnOnComponentsWhenListenToRadio()
	{
		homeTheater.listenToRadio(86.7);
		assertOutPut("Tuning in the airwaves...");
		verifyOrder.verify(tuner).on();
		verifyOrder.verify(tuner).setFrequency(86.7);
		verifyOrder.verify(amp).on();
		verifyOrder.verify(amp).setVolume(5);
		verifyOrder.verify(amp).setTuner(tuner);
	}

	@Test
	public void shouldTurnOffComponentsWhenEndListenToRadio()
	{
		homeTheater.endRadio();
		assertOutPut("Shutting down the tuner...");
		verifyOrder.verify(tuner).off();
		verifyOrder.verify(amp).off();
	}
}
