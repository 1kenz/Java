package overriding;

public class StudentCreditManager extends BaseCreditManager{
	
	// override-- if want to override use "final"
	public double calculate(double value) {
		return value * 1.10;
	}
	
}
