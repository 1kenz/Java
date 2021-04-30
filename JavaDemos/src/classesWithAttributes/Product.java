package classesWithAttributes;

public class Product {
    
    
    public Product(int id, String name, String description, double price, int stockAmount, String code) {
        this.id = _id;
        this.name = _name;
        this.price = _price;
        this.

        System.out.println("Constructor with parameters run!");
    }
    
    public Product() {  // overloading
        System.out.println("Constructor without parameters run!");
    }

    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _code;

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }

    public String getCode() {
        return _code;
    }

    public void setCode(String code) {
        _code = code;
    }


}
