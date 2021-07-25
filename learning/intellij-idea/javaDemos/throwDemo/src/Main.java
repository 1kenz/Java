public class Main {

    // public static void main(String[] args){
    public static void main(String[] args) {
        AccountManager manager = new AccountManager ();
        System.out.println ( "Account Balance = " + manager.getBalance () );

        manager.deposit (100);
        System.out.println ( "Account Balance = " + manager.getBalance ()  );
        try {
            manager.withdraw (111);
        } catch (BalanceInsufficientException exception){
            System.out.println ( exception.getMessage ());
        }
        System.out.println ( "Account Balance = " + manager.getBalance ()  );

    }
}
