package se.su.ovning1;

public class LongPlay extends Recording {

    public LongPlay(String name, String artist, int year, int condition, double price) {
        super(name, artist, year, condition, price);
    }

    @Override
    public String getType() {
        return "LP";
    }

    @Override
    public double getPrice() {
        double val = getOriginalPrice() * (getCondition() / 10.0) + (2025 - getYear()) * 5.0;
        return Math.max(10.0, val);
    }

}
