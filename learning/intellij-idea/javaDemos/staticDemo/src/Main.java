public class Main {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager ();
        Product product = new Product ();
        product.name = "Dell Laptop";
        product.price = 15000;
        product.id = 1;
        manager.add (product);

        // Not preferable because SOLID best practice
        DatabaseHelper.Crud.Delete ();
        DatabaseHelper.Connection.createConnection ();
    }
}
