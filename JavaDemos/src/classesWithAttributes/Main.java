package classesWithAttributes;

public class Main {
    public static void main(String[] args) {

        Product product = new Product(1, "Dell 7550 Laptop", "Dell i7 6700HQ processor", 7000, 1);

        // Product product = new Product();
        // product.setId(1);
        // product.setName("Dell 7550 Laptop"); = ;
        // product.setDescription("Dell i7 6700HQ processor");
        // product.setPrice(7000);
        // product.setStockAmount(1);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

    }
}
