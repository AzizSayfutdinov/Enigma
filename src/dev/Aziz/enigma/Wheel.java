package dev.Aziz.enigma;

public class Wheel {

    private char[][]contacts;
    private Type type;
    private char currentInput;

    public Wheel(char input, Type type){
        currentInput = input;
        contacts = new char[26][2];
        init(type);

    }

    private void init(Type type){

        // TODO: include check, if all plugs have only been used once

        switch(type){

            case Type1:
                this.type = Type.Type1;
                char[] in = "abcdefghijklmnopqrstuvwxyz".toCharArray();
                char[] out = "ploikmjuzhngbtcvfrsxdewqya".toCharArray();
                for(int i = 0; i < contacts.length; i++){
                    contacts[i][0] = in[i];
                    contacts[i][1] = out[i];
                }
                break;

            case Type2:
                this.type = Type.Type2;
                in = "abcdefghijklmnopqrstuvwxyz".toCharArray();
                out = "qaywsxedcrfvtgbzhnujmiklop".toCharArray();
                for(int i = 0; i < contacts.length; i++){
                    contacts[i][0] = in[i];
                    contacts[i][1] = out[i];
                }
                break;

            case Type3:
                this.type = Type.Type3;
                in = "abcdefghijklmnopqrstuvwxyz".toCharArray();
                out = "saxywqfevdrczbhntguimkjpol".toCharArray();
                for(int i = 0; i < contacts.length; i++){
                    contacts[i][0] = in[i];
                    contacts[i][1] = out[i];
                }
                break;

            case Type4:
                this.type = Type.Type4;
                in = "abcdefghijklmnopqrstuvwxyz".toCharArray();
                out = "esyxdcwaqtgbfhznvrmupoiljk".toCharArray();
                for(int i = 0; i < contacts.length; i++){
                    contacts[i][0] = in[i];
                    contacts[i][1] = out[i];
                }
                break;

            case Type5:
                this.type = Type.Type5;
                in = "abcdefghijklmnopqrstuvwxyz".toCharArray();
                out = "mnbvcxyaqertzuioplkjhgfdsa".toCharArray();
                for(int i = 0; i < contacts.length; i++){
                    contacts[i][0] = in[i];
                    contacts[i][1] = out[i];
                }
                break;

        }

    }

    public char getOutput(char input){
        this.currentInput = input;


        
    }


    public void printConfiguration(){

        System.out.println("------------- Wheel configuration ------------- ");
        System.out.println("Wheel Type " + (type.ordinal() + 1));
        for(int i = 0; i < contacts.length; i++){
            System.out.println("Connection : " + (i + 1) + ": \t" + contacts[i][0] + " -> " + contacts[i][1]);
        }


    }


}
