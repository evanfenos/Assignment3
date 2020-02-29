import static org.junit.Assert.*;

import org.junit.Test;

public class TrigFuncTest {
	/* 
		All tests include a delta since we are testing the equality of 2 floating point numbers
	   	any differences within the delta can be explained by a difference in the number of terms
	   	used in the Taylor series.
	*/
	
	@Test
	public void sinTest() {
		TrigFunc trig = new TrigFunc();
		double p = Math.PI;
		
		/* Axis values set (All inputs lie on the axes */
		assertEquals(trig.sin(0), Math.sin(0), 0.001);
		assertEquals(trig.sin(p/2), Math.sin(p/2), 0.001);
		assertEquals(trig.sin(p), Math.sin(p), 0.001);
		assertEquals(trig.sin((3/2)*p), Math.sin((3/2)*p), 0.001);
		
		/* Extra whole number results (All inputs are found between axes) */
		assertEquals(trig.sin(p/3), Math.sin(p/3), 0.001);
		assertEquals(trig.sin(p/6), Math.sin(p/6), 0.001);
		
		/* Greater than 2*pi set */
		assertEquals(trig.sin((5/2)*p), Math.sin((5/2)*p), 0.001);
		assertEquals(trig.sin(3*p), Math.sin(3*p), 0.001);
		assertEquals(trig.sin((7/2)*p), Math.sin((7/2)*p), 0.001);
		assertEquals(trig.sin(4*p), Math.sin(4*p), 0.001);
		
		/* Negative set */
		assertEquals(trig.sin(p/-2), Math.sin(p/-2), 0.001);
		assertEquals(trig.sin(p/-6), Math.sin(p/-6), 0.001);
		
		/* Small Number */
		assertEquals(trig.sin(0.0001), Math.sin(0.0001), 0.001);
	}

	@Test
	public void cosTest() {
		TrigFunc trig = new TrigFunc();
		double p = Math.PI;
		
		/* Axis values set (All inputs lie on the axes */
		assertEquals(trig.cos(0), Math.cos(0), 0.001);
		assertEquals(trig.cos(p/2), Math.cos(p/2), 0.001);
		assertEquals(trig.cos(p), Math.cos(p), 0.001);
		assertEquals(trig.cos((3/2)*p), Math.cos((3/2)*p), 0.001);
		
		/* Extra whole number results (All inputs are found between axes) */
		assertEquals(trig.cos(p/3), Math.cos(p/3), 0.001);
		assertEquals(trig.cos(p/6), Math.cos(p/6), 0.001);
		
		/* Greater than 2*pi set */
		assertEquals(trig.cos((5/2)*p), Math.cos((5/2)*p), 0.001);
		assertEquals(trig.cos(3*p), Math.cos(3*p), 0.001);
		assertEquals(trig.cos((7/2)*p), Math.cos((7/2)*p), 0.001);
		assertEquals(trig.cos(4*p), Math.cos(4*p), 0.001);
		
		/* Negative set */
		assertEquals(trig.cos(-1*p), Math.cos(-1*p), 0.001);
		assertEquals(trig.cos(p/-3), Math.cos(p/-3), 0.001);
		
		/* Small Number */
		assertEquals(trig.cos(0.0001), Math.cos(0.0001), 0.001);
	}

	@Test
	public void tanTest() {
		TrigFunc trig = new TrigFunc();
		double p = Math.PI;
		
		/* Axis values set (All inputs lie on the axes */
		assertEquals(trig.tan(0), Math.tan(0), 0.001);
		assertEquals(trig.tan(p/2), 999999999, 0.001);		// This is meant to identify an undefined result.
		assertEquals(trig.tan(p), Math.tan(p), 0.001);
		
		/* Extra whole number results (All inputs are found between axes) */
		assertEquals(trig.tan(p/3), Math.tan(p/3), 0.001);
		assertEquals(trig.tan(p/6), Math.tan(p/6), 0.001);
		
		/* Greater than 2*pi set */
		assertEquals(trig.tan(3*p), Math.tan(3*p), 0.001);
		assertEquals(trig.tan(4*p), Math.tan(4*p), 0.001);
		
		/* Negative set */
		assertEquals(trig.tan(p/-2), 999999999, 0.001);		// This is meant to identify an undefined result.
		assertEquals(trig.tan(p/-6), Math.tan(p/-6), 0.001);
		
		/* Small Number */
		assertEquals(trig.tan(0.0001), Math.tan(0.0001), 0.001);
	}

	@Test
	public void degToRad() {
		TrigFunc trig = new TrigFunc();
		double p = Math.PI;
		
		assertEquals(trig.degToRad(180), p, 0.001);
		assertEquals(trig.degToRad(60), p/3, 0.001);
		assertEquals(trig.degToRad(30), p/6, 0.001);
		assertEquals(trig.degToRad(-180), -p, 0.001);
		assertEquals(trig.degToRad(-60), -1*p/3, 0.001);
	}

	@Test
	public void radToDeg() {
		TrigFunc trig = new TrigFunc();
		double p = Math.PI;
		
		assertEquals(trig.radToDeg(p), 180, 0.001);
		assertEquals(trig.radToDeg(p/3), 60, 0.001);
		assertEquals(trig.radToDeg(p/6), 30, 0.001);
		assertEquals(trig.radToDeg(-1*p), -180, 0.001);
		assertEquals(trig.radToDeg(-1*p/3), -60, 0.001);
	}
}
