public class Main {

    public static void main(String[] args) {
       /*
        TeacherCreditManager teacherCreditManager = new TeacherCreditManager ();
        System.out.println ( teacherCreditManager.calculate (1000) );
        */
        // polymorphism -- same signature
        BaseCreditManager[] creditManagers = new BaseCreditManager[]{new TeacherCreditManager (), new FarmerCreditManager (), new StudentCreditManager ()};
        for (BaseCreditManager creditManager: creditManagers){
            System.out.println ( creditManager.calculate (1000));
        }
    }
}
