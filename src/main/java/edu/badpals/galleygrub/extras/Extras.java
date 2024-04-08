package edu.badpals.galleygrub.extras;

public enum Extras {
    CHEESE(0.25d), SAUCE(0.50d), MEDIUM(0.25d), LARGE(0.50d);

    private double price;
    private String name;
    private Extras(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
