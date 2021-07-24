public class AccountManager
{
    private double balance;

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if (balance >= amount){
            balance = getBalance() - amount;
        } else {
            throw new Exception ( "Not sufficient money on your account" );
            // System.out.println ( "Not sufficient money on your account" );
        }
    }
    public double getBalance(){
        return balance;
    }
}
