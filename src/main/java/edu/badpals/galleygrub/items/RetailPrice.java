package edu.badpals.galleygrub.items;

import java.util.HashMap;

public class RetailPrice {

    public static HashMap<String,Double> prices = new HashMap<>();
    RetailPrice(){}
    public static void init_prices() {

        prices.put("cheese",0.25);
        prices.put("sauce",0.50);
        prices.put("medium",0.25);
        prices.put("large",0.50);
    }

    public static void display(){
        prices.forEach((key, value) -> System.out.println("\t" + key + "=" + value));
    }
}
