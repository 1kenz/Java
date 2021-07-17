public class Main {

    public static void main(String[] args) {
        String student1 = "Ken";
        String student2 = "Den";
        String student3 = "Men";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println("------------------------");

        String[] students = new String[3];
        students[0] = "Ken";
        students[1] = "Den";
        students[2] = "Men";

        for (int i=0; i<students.length; i++){
            System.out.println(students[i]);
        }
        System.out.println("---------------------");

        for(String student: students)
            System.out.println(student);
    }
}
