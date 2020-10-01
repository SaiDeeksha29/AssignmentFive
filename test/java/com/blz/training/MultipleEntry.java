package com.blz.training;

import java.util.Collection;
import java.util.Arrays;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MultipleEntry {

	private boolean Output;
	private String Input;

	@Before
	public void Initialize() {
		new UserRegistration();
	}

	public MultipleEntry(String Input, boolean Output) {
		this.Input = Input;
		this.Output = Output;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> emails() {
		return Arrays.asList(
				new Object[][] { { "abc@yahoo.com", true }, { "abc@.com.my", false }, { "abc.100@gmail.com", true } });
	}

	@Test
	public void testMultipleEntryTest() {
		System.out.println("Input : " + Input);
		assertEquals(Output, UserRegistration.emailCheck(Input));
	}
}
