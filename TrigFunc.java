public class TrigFunc {	
	public double sin (double x) {
		double result = x;
		double term = 1;
		int termNum = 1;
		for (int i = 1; i<10000; i++) {
			term *= ((-1)*(x*x))/((termNum + 1)*(termNum + 2));
			result += term;
		}
		
		return result;
	}
	
	public double cos (double x) {
		double result = 1;
		double term = 1;
		int termNum = 0;
		for (int i = 1; i<10000; i++) {
			term *= ((-1)*(x*x))/((termNum + 1)*(termNum + 2));
			result += term;
		}
		
		return result;
	}
	
	public double tan (double x) {
		return (sin(x)/cos(x));
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