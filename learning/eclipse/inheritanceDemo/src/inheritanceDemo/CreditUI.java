package inheritanceDemo;

public class CreditUI {
	
	// injection
	public void CalculateCredit(BaseCreditManager credit) {
		credit.Calculate();
	}
}
