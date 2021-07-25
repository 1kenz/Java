import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // String,String -- Integer, String -- Integer, Integer
        HashMap<String, String> dictionary = new HashMap<String,String> (  );
        dictionary.put ("book","kitap");
        dictionary.put ("table","masa");
        dictionary.put ("computer","bilgisayar");
        System.out.println ( dictionary.size () );
        System.out.println ( "-------------------" );

        for (String item: dictionary.keySet ()){
            // System.out.println ( item );
            System.out.println ("Item-" + item + " Value-" + dictionary.get (item) );
        }
        System.out.println ( "-----------------" );

        dictionary.remove ("table");
        dictionary.clear ();

        System.out.println ( dictionary.get ("table") );
        System.out.println ( dictionary );
    }
}
