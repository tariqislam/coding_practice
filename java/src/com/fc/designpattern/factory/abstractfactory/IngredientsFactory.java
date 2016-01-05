package com.fc.designpattern.factory.abstractfactory;

/**
 * Created by tislam on 1/3/16.
 */
public interface IngredientsFactory {

    Dough createDough();
    Sauce createSauce();

}
