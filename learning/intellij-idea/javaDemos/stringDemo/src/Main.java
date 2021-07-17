import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String message = "Today weather is very beautiful";
        System.out.println(message);

        System.out.println("Item count: " + message.length());
        System.out.println("5.item: " + message.charAt(4));
        System.out.println(message.concat("!!!"));
        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("!"));
        char[] characters = new char[5];
        message.getChars(0,5,characters,0);
        System.out.println(characters);
        System.out.println(message.indexOf('a'));
        System.out.println(message.lastIndexOf('a'));

        String newMessage = message.replace(' ','-');
        System.out.println(newMessage);

        System.out.println(message.substring(3));
        System.out.println(message.substring(3,9));

        for (String word: message.split(" ")){
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        System.out.println(message.trim());
    }
}
