import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // createFile ();
        // getFileInfo ();
        readFile ();
        writeFile ();
        readFile ();
    }

    public static void createFile(){
        File file = new File ("D:\\__coding\\Java\\learning\\intellij-idea\\javaDemos\\files\\students.txt");

        try {
            if (file.createNewFile ()){
                System.out.println ( "File created." );
            } else {
                System.out.println ( "File already exist." );
            }
        } catch (IOException exception){
            exception.printStackTrace ();
        }
    }

    public static void getFileInfo(){
        File file = new File ("D:\\__coding\\Java\\learning\\intellij-idea\\javaDemos\\files\\students.txt");
        if (file.exists ()){
            System.out.println ( "File name " + file.getName () );
            System.out.println ( "File path " + file.getAbsolutePath () );
            System.out.println ( "File can write " + file.canWrite () );
            System.out.println ( "File can read " + file.canRead () );
            System.out.println ( "File length (byte) " + file.length () );
        }
    }

    public static void readFile(){
        File file = new File ("D:\\__coding\\Java\\learning\\intellij-idea\\javaDemos\\files\\students.txt");
        try {
            Scanner reader = new Scanner (file);
            while (reader.hasNextLine ()){
                String line = reader.nextLine ();
                System.out.println ( line );
            }
            reader.close ();
        } catch (FileNotFoundException e) {
            e.printStackTrace ( );
        }

    }

    public static void writeFile(){
        try {
            FileWriter file = new FileWriter ("D:\\__coding\\Java\\learning\\intellij-idea\\javaDemos\\files\\students.txt", true);  //  true => append,
            BufferedWriter writer = new BufferedWriter (file);
            writer.newLine ();
            writer.write ("Steve");
            System.out.println ( "Write from file" );
            writer.close ();
        } catch (IOException exception) {
            exception.printStackTrace ( );
        }

    }
}
