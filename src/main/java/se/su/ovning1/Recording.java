package se.su.ovning1;

public abstract class Recording extends Item implements PriceableWithVAT25 {
        
    private String artist;
    private int year;
    private int condition;
    private double price;

    protected Recording (String name, String artist, int year, int condition, double price){
        super(name);
        this.artist = artist;
        this.year = year;
        this.condition = condition;
        this.price = price;
    }

    public String getArtist(){
        return artist;
    }

/*     public String getType(){
        //
    } */

    public int getCondition(){

        // Sätt condition värde här. Får inte vara över 10 och inte under 0
        return condition;
    }

    public double getPrice(){
        //Sätt in ett sätt att beräkna i steg av tio beroende på condition
        return price;
    }

/*     public String toString(){

    } */

    public int getYear(){
        return year;
    }

    public abstract String getType();

    protected double getOriginalPrice(){
        return price;
    }


}
