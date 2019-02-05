package dev.Aziz.enigma;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class KeyManager implements KeyListener {
    //TODO: KeyManager only works with a window to be added on

    private boolean[]keys;

    private PropertyChangeSupport support;

    public KeyManager(){

        keys = new boolean[256];
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener plc){
        support.addPropertyChangeListener(plc);
    }

    public void removePropertyChangeLsitener(PropertyChangeListener plc){
        support.removePropertyChangeListener(plc);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        support.firePropertyChange("keys", keys[e.getKeyCode()], true);
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        support.firePropertyChange("keys", keys[e.getKeyCode()], true);
        keys[e.getKeyCode()] = false;
    }

    public boolean[] getKeys() {
        return keys;
    }
}
