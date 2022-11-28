package calc;

public class Calculadora {
	public double soma(double x, double y) {
		return x + y;
	}
	
	public double sub(double x, double y) {
		return x - y;
	}
	
	public double mult(double x, double y) {
		return x * y;
	}
	
	public double div(double x, double y) {
		if(y == 0) {
			return 0;
		}
		
		return x / y;
	}
}
