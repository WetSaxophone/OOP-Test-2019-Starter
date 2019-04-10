package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Colour extends PApplet

{	
    private String colour;
    public int r;
    public int g;
    public int b;
    public int value;

    

    public void colour()
    {

    }

    public String toString()
    {
        String displayName;
        displayName = colour + integer.toString(r) + integer.toString(g) + integer.toString(b) + integer.toString(value);
        return displayName;
    }
}