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

    public void addPlug(char from, char to){

        // TODO: implement code for combinations of capital and minor letters
        // TODO: double if statement, first capital letters then the small letters and capital, both for from and to


        if((int)from >= 65 && (int)from <= 90) {
            inout[((int) from) - 65][0] = from;
            inout[((int) from) - 65][1] = to;
        }
        else if((int)from >= 97 && (int)from <= 122){
            inout[((int) from) - 97][0] = (char)((int)from - 32);
            inout[((int) from) - 97][1] = (char)((int)to - 32);
        }
        else
            throw new IllegalArgumentException("from and to must be characters from the alphabet");
    }


    public void printConfiguration(){

        System.out.println("------------- Plug configuration ------------- ");
        for(int i = 0; i < inout.length; i++){
            System.out.println("Connection " + (i + 1) + ": \t" + inout[i][0] + " -> " + inout[i][1]);
        }
        System.out.println("\n");

    }

}
