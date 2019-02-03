package dev.Aziz.enigma;

public class Launcher {

    public static void main(String[] args){
        System.out.println("Enigma");

        Plugboard p = new Plugboard();
        p.printConfiguration();
        p.addPlug('a', 'b');
        p.printConfiguration();
        p.addPlug('Z', 'C');
        p.printConfiguration();
        Wheel w1 = new Wheel('c', Type.Type1);
        w1.printConfiguration();

    }

    // TODO: Let all the classes have observers, which will notify the next step about the change
    // TODO: > chain notification, maybe it'll work
    // TODO: Use observer pattern: https://www.baeldung.com/java-observer-pattern

}
