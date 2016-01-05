package com.fc.designpattern.factory.abstractfactory;

/**
 * Created by tislam on 1/3/16.
 */
public class CheesePizza extends Pizza {

    IngredientsFactory ingredientsFactory;

    public CheesePizza(IngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    public void prepare() {
        this.sauce = this.ingredientsFactory.createSauce();
        this.dough = this.ingredientsFactory.createDough();
    }

    public String toString() {
        return "cheese, " + sauce.getSauceType() + " " + dough.getDoughType();
    }
}
