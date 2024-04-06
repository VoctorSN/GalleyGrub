package edu.badpals.galleygrub.receipt;

import edu.badpals.galleygrub.extras.Extra;
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
    public void setChain(Extra extra) {

    }

    @Override
    public Extra getChain() {
        return null;
    }

    @Override
    public Double total() {
        return this.getOrder().getTotal();
    }

    @Override
    public void sumExtrasCharge() {

    }

    @Override
    public void print() {
        this.getOrder().display();
        System.out.println("\tTOTAL --------> " + this.total() + "$");
    }
}
