package abstract_classes;

import java.util.ArrayList;
import java.util.List;


abstract class Product 
{
    protected String name;

    public Product(String name) 
    {
        this.name = name;
    }

    public abstract double getPrice();
    public abstract String getDescription();
}



class ElectronicsProduct extends Product 
{
    private double price;
    private String brand;

    public ElectronicsProduct(String name, double price, String brand) 
    {
        super(name);
        this.price = price;
        this.brand = brand;
    }

    @Override
    public double getPrice() 
    {
        return price;
    }

    @Override
    public String getDescription() 
    {
        return "Electronics - " + name + " by " + brand;
    }
}



class ClothingProduct extends Product
{
    private double price;
    private String size;

    public ClothingProduct(String name, double price, String size)
    {
        super(name);
        this.price = price;
        this.size = size;
    }

    @Override
    public double getPrice() 
    {
        return price;
    }

    @Override
    public String getDescription() 
    {
        return "Clothing - " + name + " (Size: " + size + ")";
    }
}



class BookProduct extends Product 
{
    private double price;
    private String author;

    public BookProduct(String name, double price, String author) 
    {
        super(name);
        this.price = price;
        this.author = author;
    }

    @Override
    public double getPrice() 
    {
        return price;
    }

    @Override
    public String getDescription() 
    {
        return "Book - \"" + name + "\" by " + author;
    }
}



public class ProductMain
{
    public static void main(String[] args) 
    {
        List<Product> cart = new ArrayList<>();


        cart.add(new ElectronicsProduct("Smartphone", 15000, "Samsung"));
        cart.add(new ClothingProduct("T-Shirt", 799, "L"));
        cart.add(new BookProduct("Wings of Fire", 350, "A.P.J. Abdul Kalam"));
        
        double total = 0;

        System.out.println("Shopping Cart:\n");

        for (Product product : cart) 
        {
            System.out.println(product.getDescription());
            System.out.println("Price: ₹" + product.getPrice());
            System.out.println();
            total += product.getPrice();
        }

        System.out.println("Total Price: ₹" + total);
    }
}

