package com.fc.designpattern.factory.abstractfactory;

/**
 * Created by tislam on 1/3/16.
 */
public class NyIngredientsFactory implements IngredientsFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
