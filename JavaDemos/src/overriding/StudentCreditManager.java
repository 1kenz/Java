package overriding;

public class StudentCreditManager extends BaseCreditManager {
    public double calculate(double value) {
        result = value * 1.10;
        return result;
    }
}
