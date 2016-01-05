package com.fc.designpattern.factory.simplefactory;

/**
 * Created by tislam on 1/3/16.
 */
public class PizzaStore {

    private PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public String orderPizza(String type) {

        Pizza pizza = this.pizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return "ordered " + pizza.toString();
    }


}
