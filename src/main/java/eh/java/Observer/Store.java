package eh.java.Observer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store implements Observable{
    private int discount;
    private String name;

    public Store(int discount, String name) {
        this.discount = discount;
        this.name = name;
    }
    public void  setDiscount(int discount){
        this.discount = discount;
        this.notifyObservers();
    }
    private List<Observer> customers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        this.customers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.customers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer customer : this.customers){
            customer.getUpdates(this.name);
        }
    }
}
