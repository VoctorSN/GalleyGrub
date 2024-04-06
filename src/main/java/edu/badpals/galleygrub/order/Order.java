package edu.badpals.galleygrub.order;

import edu.badpals.galleygrub.items.Item;
import edu.badpals.galleygrub.items.Product;

import java.util.ArrayList;
import java.util.List;

public class Order implements Comanda{
    private Double total = 0.0;
    private List<Item> items = new ArrayList<>();

    public Order(){}

    @Override
    public void addItem(String name, double price) {
        this.itemList().add(new Item(name,price));
    }

    @Override
    public void addItem(String name, double price, String extra) {
        this.itemList().add(new Item(name,price,extra));
    }

    public List<Item> itemList() {
        return this.items;
    }

    @Override
    public int size() {
        return this.itemList().size();
    }

    @Override
    public Double getTotal() {
        return this.itemList().stream().mapToDouble(Item::price).reduce(Double::sum).orElse(0.0);
    }

    @Override
    public void updateTotal(Double total) {
        this.total += total;
    }

    @Override
    public void display() {
        System.out.println("\n\t - - - Order - - -");
        this.itemList().forEach(this::itemDisplay);
    }

    private void itemDisplay(Product item){
        System.out.println("\t" + item.toString());
    }
}
