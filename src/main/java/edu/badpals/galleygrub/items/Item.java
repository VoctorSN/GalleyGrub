package edu.badpals.galleygrub.items;

public class Item implements Product{
    String name;
    Double price;
    String extra;
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, double price, String extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public Double price() {
        return isRegular() ? this.price : this.price + RetailPrice.prices.get(extra);
    }

    @Override
    public String extra() {
        return this.extra;
    }

    @Override
    public Boolean isRegular() {
        return this.extra() == null;
    }

    @Override
    public String toString() {
        if (this.isRegular()){
           return this.name() + "...." + this.price() + "$";
        }
        return this.name() + " W/ " + this.extra() + "...." + this.price() + "$ + " + RetailPrice.prices.get(this.extra) + "$";
    }
}
