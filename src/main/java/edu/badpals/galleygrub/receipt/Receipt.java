package edu.badpals.galleygrub.receipt;

import edu.badpals.galleygrub.extras.Extras;
import edu.badpals.galleygrub.order.Comanda;

public class Receipt implements Ticket{
    private Double total = 0.0;
    private Comanda order;
    public Receipt(Comanda order) {
        this.order = order;
    }

    @Override
    public Comanda getOrder() {
        return this.order;
    }



    @Override
    public Double total() {
        this.sumExtrasCharge();
        return this.total + this.getOrder().getTotal();
    }

    @Override
    public void sumExtrasCharge() {
        total = getOrder().itemList().stream().filter(item-> !item.isRegular()).mapToDouble(item -> Extras.valueOf(item.extra().toUpperCase()).getPrice()).sum();
    }

    @Override
    public void print() {
        this.getOrder().display();
        System.out.println("\tTOTAL --------> " + this.total() + "$");
    }
}
