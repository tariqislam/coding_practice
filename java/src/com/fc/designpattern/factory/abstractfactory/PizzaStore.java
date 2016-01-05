package com.fc.designpattern.factory.abstractfactory;

/**
 * Created by tislam on 1/3/16.
 */
public abstract class PizzaStore {

    // concrete method that uses created product object
    public String orderPizza(String type) {

        Pizza pizza = this.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return "ordered " + pizza.toString();

    }

    // abstract create method that concrete creators will implement
    protected abstract Pizza createPizza(String type);
}