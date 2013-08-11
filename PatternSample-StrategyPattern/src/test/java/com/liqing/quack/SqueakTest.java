package com.liqing.quack;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

/**
 * User: LiQing Date: 8/11/13 Time: 10:22 AM
 */
public class SqueakTest
{

	private ByteArrayOutputStream byteArrayOutputStream;
	private Squeak squeak;

	@Before
	public void setUp()
	{
		byteArrayOutputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteArrayOutputStream));
		squeak = new Squeak();
	}

    @Test
    public void shouldSqueakWhenDuckIsSqueak() {
        squeak.quack();
        assertThat(byteArrayOutputStream.toString(), containsString("Squeak"));
    }

    @After
	public void tearDown()
	{
		System.setOut(null);
	}
}
