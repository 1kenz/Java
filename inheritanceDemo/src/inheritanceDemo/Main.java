package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		// TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
		// teacherCreditManager.Calculate();
		
		
		// polymorphism
		CreditUI creditUI = new CreditUI();
		creditUI.CalculateCredit(new ArmyCreditManager());
		creditUI.CalculateCredit(new TeacherCreditManager());
		}

}
