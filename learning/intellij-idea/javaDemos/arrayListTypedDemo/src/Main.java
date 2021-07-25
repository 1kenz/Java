import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String> ();
        cities.add ("İstanbul");
        cities.add ("Ankara");
        cities.add ("İzmir");
        cities.add ("Aydın");

        // cities.remove ("Ankara");
        Collections.sort (cities);
        for (String city: cities){
            System.out.println ( city );
        }
    }
}
