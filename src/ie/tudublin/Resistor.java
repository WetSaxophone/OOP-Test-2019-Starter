package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Colour extends PApplet

{	

    public int ones;
    public int tens;
    public int hundreds;
    public int value;

    

    public void Resistor()
    {
        int hundreds = (value / 100);
        int tens = (value - (hundreds * 100)) / 10;
        int ones = value - ((hundreds * 100)  + (tens * 10));
        print(hundreds + ",");
        print(tens + ",");
        println(ones);
    }

    public String toString()
    {
        String displayName;
        displayName = colour + integer.toString(r) + integer.toString(g) + integer.toString(b) + integer.toString(value);
        return displayName;
    }
}