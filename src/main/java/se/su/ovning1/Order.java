package se.su.ovning1;

import java.util.List;
import java.util.ArrayList;

public class Order {

    private static long counter;
    private final long orderNumber;
    private final List<Item> items;

    public Order(Item... items) {
        this.orderNumber = counter++;
        this.items = new ArrayList<>(List.of(items));

    }

    public double getTotalValue() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;

    }

    public double getTotalValuePlusVAT() {
        double total = 0;
        for (Item item : items) {
            total += item.getPriceWithVAT();
        }
        return total;
    }

    public String getReceipt() {
        StringBuilder sb = new StringBuilder();
        sb.append("Receipt for order #").append(orderNumber).append("\n");
        sb.append("-----------\n");

        for (Item item : items) {
            sb.append(item.toString()).append("\n");
        }

        sb.append("Total excl. VAT: ").append(getTotalValue()).append("\n");
        sb.append("Total incl. VAT: ").append(getTotalValuePlusVAT());

        return sb.toString();
    }

}
