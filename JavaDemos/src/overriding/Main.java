package overriding;

public class Main {
    public static void main(String[] args) {
        // TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        // System.out.println(teacherCreditManager.calculate(10000));

        BaseCreditManager[] creditManager = new BaseCreditManager[]{new TeacherCreditManager(), new FarmerCreditManager(), new StudentCreditManager()};
        for(BaseCreditManager creditManager: creditManagers) {
            result = creditManager.calculate(10000);
            System.out.println(result);
        }


    }
}
