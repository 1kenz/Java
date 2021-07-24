public class AccountManager
{
    private double balance;

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws BalanceInsufficientException {
        if (balance >= amount){
            balance = getBalance() - amount;
        } else {
            throw new BalanceInsufficientException ( "Not sufficient money on your account" );
            // System.out.println ( "Not sufficient money on your account" );
        }
    }
    public double getBalance(){
        return balance;
    }
}
