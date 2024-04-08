package edu.badpals.galleygrub.receipt;

import edu.badpals.galleygrub.order.Comanda;

public interface Ticket {
    Comanda getOrder();
    Double total();
    void sumExtrasCharge();
    void print();
}
