package se.su.ovning1;

import java.util.List;
import java.util.ArrayList;

public class Order {
    
    private static long counter;
    private long orderNumber;
    private List<Item> items;

    public Order(Item... items){
        this.orderNumber = counter++;
        this.items = List.of(items);

    }


    public double getTotalValue(){
        
        return price;
    }

    public double getTotalValuePlusVAT(){
        return price;
    }

    public String getReceipt(){
        //return name + " "
    }


}
