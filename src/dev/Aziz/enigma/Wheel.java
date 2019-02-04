package dev.Aziz.enigma;

public class Wheel {

    private char currentInput;
    private WheelType wheelType;

    public Wheel(char input, WheelType wheelType){
        this.wheelType = wheelType;
        currentInput = input;

    }

    public Wheel(WheelType wheelType){
        this.wheelType = wheelType;

    }

    public void setInput(char input){
        this.currentInput = input;
    }



    public char getOutput(char input){
        this.currentInput = input;
        return wheelType.getContacts()[(int)input - 65][1];   // check for small letters as well
    }

    public char getCurrentInput() {
        return currentInput;
    }

    public void setCurrentInput(char currentInput) {
        this.currentInput = currentInput;
    }

    public WheelType getWheelType() {
        return wheelType;
    }

    public void setWheelType(WheelType wheelType) {
        this.wheelType = wheelType;
    }
}
