package edu.badpals.galleygrub.order;

import edu.badpals.galleygrub.items.Item;

import java.util.List;

public interface Comanda {
    void addItem(String name,double price);
    void addItem(String name,double price, String extra);
    int size();
    List<Item> itemList();
    Double getTotal();
    void updateTotal(Double total);
    void display();
}
