package com.fc.designpattern.factory.abstractfactory;

/**
 * Created by tislam on 1/3/16.
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        IngredientsFactory ingredientsFactory = new ChicagoIngredientsFactory();

        if (type.equals("chicago")) {
            pizza = new CheesePizza(ingredientsFactory);
        }
        return pizza;
    }

}
