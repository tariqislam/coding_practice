package com.fc.designpattern.factory.factorymethod;

/**
 * Created by tislam on 1/3/16.
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("chicago")) {
            pizza = new ChicagoCheesePizza();
        }
        return pizza;
    }

}
