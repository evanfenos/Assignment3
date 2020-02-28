public class TrigFunc {	
	public double sin (double x) {
		double result = x;
		double term = 1;
		for (int i = 1; i<1000000; i++) {
			term *= ((-1)*(x*x))/((i + 1)*(i + 2));
			result += term;
		}
		
		return result;
	}
	
	public double cos (double x) {
		double result = 1;
		double term = 1;
		for (int i = 1; i<1000000; i++) {
			term *= ((-1)*(x*x))/((i + 1)*(i + 2));
			result += term;
		}
		
		return result;
	}
	
	public double tan (double x) {
		double p = Math.PI;
		if (x != 0 && x % (p/2) == 0) {
			return 999999999;				// This is the best way I could think to represent undefined.
		} else {
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