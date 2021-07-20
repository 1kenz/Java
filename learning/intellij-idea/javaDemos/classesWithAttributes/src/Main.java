public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Dell Laptop");
        product.setPrice(10000);
        product.setStockAmount(7);

        Product product1 = new Product(2, "Laptop2","Asus Laptop",10000,7);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        productManager.Add(product1);

        // System.out.println(product.name);
    }
}
