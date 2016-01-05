package com.fc.designpattern.factory.simplefactory;

/**
 * Created by tislam on 1/3/16.
 */
public class PizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }
        else if (type.equals("ny")) {
            pizza = new NyPizza();
        }
        return pizza;
    }

}
