package com.fc.designpattern.observer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tislam on 1/2/16.
 */
public class WeatherTest {

    WeatherStation weatherStation;
    GeneralDisplay generalDisplay;
    StaticDisplay staticDisplay;

    @Before
    public void setUp() throws Exception {
        weatherStation = new WeatherStation();

        generalDisplay = new GeneralDisplay();
        staticDisplay = new StaticDisplay();

        weatherStation.registerObserver(generalDisplay);
        weatherStation.registerObserver(staticDisplay);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testObserverPattern() throws Exception {

        // observers need to pull data
        weatherStation.weatherChanged("rainy!", false);
        assertEquals("rainy!", generalDisplay.display());
        assertEquals("rainy!", staticDisplay.display());

        // pushing data to observers
        weatherStation.weatherChanged("sunny!", true);
        assertEquals("sunny!", generalDisplay.display());
        assertEquals("sunny!", staticDisplay.display());
    }

}