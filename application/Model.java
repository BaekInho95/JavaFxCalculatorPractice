package application;

public class Model {

	public double calculate(String operator, double x, double y) {
		double result = 0;
		if (operator.equals("+")) {
			result = x + y;
		}
		else if (operator.equals("-")) {
			result = x - y;
		}
		else if (operator.equals("*")) {
			result = x * y;
		}
		else if (operator.equals("/")) {
			result = x / y;
		}
		return result;
	}
}
