package main.observer;

import main.Bank;
import main.entities.Customer;
import main.observer.CustomerObserver;

public class SalesTeam implements CustomerObserver {

    @Override
    public void onCustomerAdded(Customer customer) {
        System.out.println("Customer added: " + customer.getName() + " to " + Bank.getInstance());
    }

    @Override
    public void onCustomerRemoved(Customer customer) {
        System.out.println("Customer removed: " + customer.getName() + " from " + Bank.getInstance());
    }
}