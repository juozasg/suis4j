package org.suis4j;

import java.util.*;

import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;


public class OperationTest
{

	@Test
	public void testOperation()
	{
		Operation o = new Operation();
		Message input = o.input();
		Message output = o.output();
	}
}