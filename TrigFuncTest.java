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
		assertEquals(trig.sin(0), 0, 0.0001);
		assertEquals(trig.sin(p/2), 1, 0.0001);
		assertEquals(trig.sin(p), 0, 0.0001);
		assertEquals(trig.sin((3/4)*p), -1, 0.0001);
		
		/* Extra whole number results (All inputs are found between axes) */
		assertEquals(trig.sin(p/3), Math.sqrt(3)/2, 0.0001);
		assertEquals(trig.sin(p/6), 1/2, 0.0001);
		
		/* Greater than 2*pi set */
		assertEquals(trig.cos((5/2)*p), 1, 0.0001);
		assertEquals(trig.cos(3*p), 0, 0.0001);
		assertEquals(trig.cos((7/2)*p), -1, 0.0001);
		assertEquals(trig.cos(4*p), 0, 0.0001);
		
		/* Negative set */
		assertEquals(trig.sin(p/-2), -1, 0.0001);
		assertEquals(trig.sin(p/-6), -1/2, 0.0001);
	}

	@Test
	public void cosTest() {
		TrigFunc trig = new TrigFunc();
		double p = Math.PI;
		
		/* Axis values set (All inputs lie on the axes */
		assertEquals(trig.cos(0), 1, 0.0001);
		assertEquals(trig.cos(p/2), 0, 0.0001);
		assertEquals(trig.cos(p), -1, 0.0001);
		assertEquals(trig.cos((3/4)*p), 0, 0.0001);
		
		/* Extra whole number results (All inputs are found between axes) */
		assertEquals(trig.cos(p/3), 1/2, 0.0001);
		assertEquals(trig.cos(p/6), Math.sqrt(3)/2, 0.0001);
		
		/* Greater than 2*pi set */
		assertEquals(trig.cos((5/2)*p), 0, 0.0001);
		assertEquals(trig.cos(3*p), -1, 0.0001);
		assertEquals(trig.cos((7/2)*p), 0, 0.0001);
		assertEquals(trig.cos(4*p), 1, 0.0001);
		
		/* Negative set */
		assertEquals(trig.cos(-1*p), -1, 0.0001);
		assertEquals(trig.cos(p/-3), 1/2, 0.0001);
	}

	@Test
	public void tanTest() {
		TrigFunc trig = new TrigFunc();
		double p = Math.PI;
		
		/* Axis values set (All inputs lie on the axes */
		assertEquals(trig.tan(0), 0, 0.0001);
		assertEquals(trig.tan(p/2), 999999999, 0.0001);		// This is meant to identify an undefined result.
		assertEquals(trig.tan(p), 0, 0.0001);
		assertEquals(trig.tan((3/4)*p), 999999999, 0.0001);			// This is meant to identify an undefined result.
		
		/* Extra whole number results (All inputs are found between axes) */
		assertEquals(trig.tan(p/3), Math.sqrt(3), 0.0001);
		assertEquals(trig.tan(p/6), 1/Math.sqrt(3), 0.0001);
		
		/* Greater than 2*pi set */
		assertEquals(trig.tan(3*p), 0, 0.0001);
		assertEquals(trig.tan(4*p), 0, 0.0001);
		
		/* Negative set */
		assertEquals(trig.tan(p/-2), 999999999, 0.0001);		// This is meant to identify an undefined result.
		assertEquals(trig.tan(p/-6), 1/Math.sqrt(3), 0.0001);
	}

	@Test
	public void degToRad() {
		TrigFunc trig = new TrigFunc();
		double p = Math.PI;
		
		assertEquals(trig.degToRad(180), p, 0.0001);
		assertEquals(trig.degToRad(60), p/3, 0.0001);
		assertEquals(trig.degToRad(30), p/6, 0.0001);
		assertEquals(trig.degToRad(-180), -p, 0.0001);
		assertEquals(trig.degToRad(-60), -1*p/3, 0.0001);
	}

	@Test
	public void radToDeg() {
		TrigFunc trig = new TrigFunc();
		double p = Math.PI;
		
		assertEquals(trig.radToDeg(p), 180, 0.0001);
		assertEquals(trig.radToDeg(p/3), 60, 0.0001);
		assertEquals(trig.radToDeg(p/6), 30, 0.0001);
		assertEquals(trig.radToDeg(-1*p), -180, 0.0001);
		assertEquals(trig.radToDeg(-1*p/3), -60, 0.0001);
	}
}
