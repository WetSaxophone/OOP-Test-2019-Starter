package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class Resistor extends PApplet

{	

    ArrayList<Resistor> resistors = new ArrayList<Resistor>();

    public int ones;
    public int tens;
    public int hundreds;
    public int value;

    

    public void Resistors()
    {
        int hundreds = (value / 100);
        int tens = (value - (hundreds * 100)) / 10;
        int ones = value - ((hundreds * 100)  + (tens * 10));
        print(hundreds + ",");
        print(tens + ",");
        println(ones);
    }
}