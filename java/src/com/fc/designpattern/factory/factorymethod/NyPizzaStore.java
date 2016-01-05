package com.fc.designpattern.factory.factorymethod;

/**
 * Created by tislam on 1/3/16.
 */
public class NyPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NyCheesePizza();
        }
        else if (type.equals("ny")) {
            pizza = new NyPizza();
        }
        return pizza;
    }

}
