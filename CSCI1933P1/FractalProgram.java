package CSCI1933P1;

import java.awt.*;

public class FractalProgram {
    //TODO:
    // Main should ask user for shape input, and then draw the corresponding fractal.
    // This method should print area of fractal, after the fractal is done drawing.
    public static void main(String[] args) {
        Canvas drawing = new Canvas(800,800);
        Circle myCircle = new Circle(0,0,100);
        myCircle.setColor(Color.BLUE);
        drawing.drawShape(myCircle);
    }
}
