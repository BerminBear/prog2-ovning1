package se.su.ovning1;

public class Book extends Item implements PriceableWithVAT6 {

    private double price;
    private boolean bound;
    private String author;
    
    
   public Book(String name, String author, double price, boolean bound){
        super(name);
        this.author = author;
        this.price = price;
        this.bound = bound;
    }


    public String getType(){
        return "Book";
    }

    public double getPrice(){
        if (bound){
            return price *1.3;
        }
        return price;
    }

    public String toString(){
        return author;
    } 
}
