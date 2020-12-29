package com.example.SpringFirst;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.example.SpringFirst.controller.Sample;

public class SampleTest {
	@InjectMocks
	Sample sample;

	@Before
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testAdd() {
		String result = sample.addition();
		assertEquals("1", result);
	}
}
