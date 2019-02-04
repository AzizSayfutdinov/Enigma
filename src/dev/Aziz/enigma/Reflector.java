package dev.Aziz.enigma;

public class Reflector {

    private char[][] contacts;
    private char currentInput;
    private Wheel leftWheel;

    public Reflector(char input, Wheel leftWheel){
        this.leftWheel = leftWheel;
        this.currentInput = input;
        contacts = new char[26][2];
        init();
    }

    public Reflector(Wheel leftWheel){
        this.leftWheel = leftWheel;
        contacts = new char[26][2];
        init();
    }

    private void init(){

        char[] in = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] out = "pqowieurztlaksjdhfgymxncbv".toCharArray();
        for(int i = 0; i < contacts.length; i++){
            contacts[i][0] = in[i];
            contacts[i][1] = out[i];
        }

    }

    public void setInput(char input){
        currentInput = input;
    }

    public char getOutput(char input){

        return contacts[(int)input - 65][1];

    }

    public char[][] getContacts() {
        return contacts;
    }

    public void setContacts(char[][] contacts) {
        this.contacts = contacts;
    }

    public char getCurrentInput() {
        return currentInput;
    }

    public void setCurrentInput(char currentInput) {
        this.currentInput = currentInput;
    }
}
