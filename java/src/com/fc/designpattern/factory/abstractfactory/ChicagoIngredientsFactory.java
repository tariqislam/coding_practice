package com.fc.designpattern.factory.abstractfactory;

/**
 * Created by tislam on 1/3/16.
 */
public class ChicagoIngredientsFactory implements IngredientsFactory {
    @Override
    public Dough createDough() {
        return new DeepDishDough();
    }

    @Override
    public Sauce createSauce() {
        return new SpicySauce();
    }
}
