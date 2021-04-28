package oopIntro;

public class Product {

    public Product() {  // Constructor 
        System.out.println("First Constructor, Instance create  started!");

    }

    int id;
    String name;
    double unitPrice;
    String detail;
    double discount;
    double unitPriceAfterDiscount;
    
    public Product(int id, String name, double unitPrice, String detail, double discount, double unitPriceAfterDiscount) {  // overloading
        this();
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
        this.discount = discount;
        System.out.println("Second Constructor, id number: " + id + " Instance created!");
        
    }

   
}
