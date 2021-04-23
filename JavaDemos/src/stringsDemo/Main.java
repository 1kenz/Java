package stringsDemo;

public class Main {
    public static void main(String[] args) {
        
        String message = "           Today is weather very beautiful.       ";
        System.out.println(message);
        
        // System.out.println("Item number " + message.length());
        // System.out.println("5. Item is " + message.charAt(4));
        // System.out.println(message.concat("Perfect!!!"));
        // System.out.println(message.startsWith("B"));
        // System.out.println(message.endsWith("."));
        // char[] chars = new char[5];
        // message.getChars(0, 5, chars, 0);
        // System.out.println(chars);
        // System.out.println(message.indexOf('a'));
        // System.out.println(message.lastIndexOf('b'));

        String newMessage = message.replace(' ', '-');
        System.out.println(newMessage);

        System.out.println(message.substring(2, 6));

        for(String word: message.split(" ")){
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        System.out.println(message.trim());



    }
}
