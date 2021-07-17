public class Calculate {
    public int Plus(int... numbers){
        int total = 0;
        for (int number: numbers){
            total += number;
        }
        return total;
    }

    public int Minus(int... numbers){
        int total = 0;
        for (int number: numbers){
            total -= number;
        }
        return total;
    }

    public int Multiply(int... numbers){
        int total = 1;
        for (int number: numbers){
            total *= number;
        }
        return total;
    }

    public float Divide(float number1,float number2){
        return number1 / number2;
    }
}
