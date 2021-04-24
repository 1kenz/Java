package oopIntro;

public class Product {

    public Product() {  // Constructor 
        System.out.println("Instance create started!");

    }
    
    public Product(int id, String name, double unitPrice, String detail) {  // overloading
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
        System.out.println("Instance created!");
        
    }

    int id;
    String name;
    double unitPrice;
    String detail;
}
