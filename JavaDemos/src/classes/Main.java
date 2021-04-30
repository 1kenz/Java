package classes;

public class Main {
    public static void main(String[] args) {
        // class => referance type
        CustomerManager customerManager = new CustomerManager();  // arrays, class => ref type stack(ref) - heap(data)
        // primitive types => stack (data)
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
    }
}
