package dev.Aziz.enigma;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class TestObject implements PropertyChangeListener {



    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Property changed: " + evt.getNewValue());
    }
}
