package se.su.ovning1;

public class LongPlay extends Recording {
    
    public LongPlay(String name, String artist, int year, int condition, double price){
        super(name, artist, year, condition, price);
    }

    public String getType(){
        return "LP";
    }

    public double getPrice(){

        double standardPrice = super.getPrice();

        return price * (condition/10) + (2025 - year) * 5;
    }


}
