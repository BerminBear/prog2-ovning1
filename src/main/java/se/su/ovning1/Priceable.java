package se.su.ovning1;

public interface Priceable {


public double getPrice();

public double getVAT();

public default double getPriceWithWAT(){
        return 0.0;
    }
}
