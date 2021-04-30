package classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Dell 7550 Laptop";
        product.description = "Dell i7 6700HQ processor";
        product.id = 1;
        product.price = 7000;
        product.stockAmount = 1;

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

    }
}
