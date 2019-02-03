package dev.Aziz.enigma;

public class Plugboard {

    private char[][] inout;

    public Plugboard(){

        inout = new char[26][2];
        init();

    }

    private void init(){

        for(int i = 0; i < inout.length; i++){
            inout[i][0] = (char)(65 + i);
            inout[i][1] = (char)(65 + i);
        }
    }

    public void printConfiguration(){

        for(int i = 0; i < inout.length; i++){
            System.out.println("Connection " + (i + 1) + ": \t" + inout[i][0] + " -> " + inout[i][1]);
        }
    }

}
