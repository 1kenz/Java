package arrays;

public class Main {
    public static void main(String[] args) {
     
        String student1 = "John";
        String student2 = "Mike";
        String student3 = "Adam";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
       
        System.out.println("---------------------------------------");

        String[] students = new String[3];
        students[0] = "John";
        students[1] = "Mike";
        students[2] = "Adam";


        // foreach
        for(int i=0; i<students.length; i++){
            System.out.println(students[i]);
        }
        System.out.println("---------------------------------------");

        for (String student : students) {
            System.out.println(student);
        }
    }
}
