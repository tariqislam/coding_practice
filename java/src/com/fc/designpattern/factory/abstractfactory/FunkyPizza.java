package com.fc.designpattern.factory.abstractfactory;

/**
 * Created by tislam on 1/3/16.
 */
public class FunkyPizza extends Pizza {

    IngredientsFactory ingredientsFactory;

    public FunkyPizza(IngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    void prepare() {
        this.dough = new DeepDishDough();
        // no sauce;
        this.sauce = null;
    }

    public String toString() {
        return "cheese, no sauce " + dough.getDoughType();
    }

}
