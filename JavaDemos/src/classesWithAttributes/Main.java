package classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Dell 7550 Laptop"); = ;
        product.setDescription("Dell i7 6700HQ processor");
        product.setId(1);
        product.setPrice(7000);
        product.setStockAmount(1);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

    }
}
