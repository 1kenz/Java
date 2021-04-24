package oopIntro;

public class Product {

    public Product() {  // Constructor 
        System.out.println("First Constructor, Instance create  started!");

    }
    
    public Product(int id, String name, double unitPrice, String detail) {  // overloading
        this();
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
        System.out.println("Second Constructor, id number: " + id + " Instance created!");
        
    }

    int id;
    String name;
    double unitPrice;
    String detail;
}
