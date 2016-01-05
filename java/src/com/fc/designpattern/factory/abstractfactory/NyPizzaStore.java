package com.fc.designpattern.factory.abstractfactory;

/**
 * Created by tislam on 1/3/16.
 */
public class NyPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        IngredientsFactory ingredientsFactory = new NyIngredientsFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientsFactory);
        }
        else if (type.equals("funky")) {
            pizza = new FunkyPizza(ingredientsFactory);
        }
        return pizza;
    }

}
