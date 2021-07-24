import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // createFile ();
        getFileInfo ();
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
}
