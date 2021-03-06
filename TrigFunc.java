public class TrigFunc {
	public double sin (double x) {
		double result = x;
		double term = 1;
		int termNum = 1;
		for (int i = 1; i<1000000; i++) {
			// Defining terms separately like this removes the need for factorial
			// Terms are based on Taylor's series given at: https://www.efunda.com/math/taylor_series/trig.cfm
			if (i == 1) {
				term *= ((-1)*(x*x*x))/((termNum + 1)*(termNum + 2));		// Pattern starts unevenly
			} else {
				term *= ((-1)*(x*x))/((termNum + 1)*(termNum + 2));
			}
			result += term;
			termNum += 2;
		}
		
		return result;
	}
	
	public double cos (double x) {
		double result = 1;
		double term = 1;
		int termNum = 0;
		for (int i = 0; i<1000000; i++) {
			// Defining terms separately like this removes the need for factorial
			// Terms are based on Taylor's series given at: https://www.efunda.com/math/taylor_series/trig.cfm
			term *= ((-1)*(x*x))/((termNum + 1)*(termNum + 2));
			result += term;
			termNum += 2;
		}
		
		return result;
	}
	
	public double tan (double x) {
		double p = Math.PI;
		if (x != 0 && (((x/(p/2)) % 2 == 1) || (x/(p/2)) % 2 == -1)) {
			return 999999999;				// This is the best way I could think to represent undefined.
		} else {
			// Trig identity sin(x)/cos(x) = tan(x)
			return (sin(x)/cos(x));
		}
	}
	
	public double degToRad (double x) {
		double p = Math.PI;
		double xRad = x*(p/180);
		return xRad;
	}
	
	public double radToDeg (double x) {
		double p = Math.PI;
		double xDeg = x*(180/p);
		return xDeg;
	}
}