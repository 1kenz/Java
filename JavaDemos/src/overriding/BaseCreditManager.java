package overriding;

public class BaseCreditManager {
    public final double calculate(double value) {  // not override this method because use final
        return value * 1.18;
    }
}
