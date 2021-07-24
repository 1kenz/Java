package mathemathics;

public class Calculates {
    public void summary(int... numbers){
        int total = 0;
        for (Integer number: numbers){
            total += number;
        }
        System.out.println(total);
    }
}
