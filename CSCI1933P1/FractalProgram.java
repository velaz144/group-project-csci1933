package CSCI1933P1;
import java.util.Scanner;

import java.awt.*;

public class FractalProgram {
    //TODO:
    // Main should ask user for shape input, and then draw the corresponding fractal.
    // This method should print area of fractal, after the fractal is done drawing.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("choose one of the shapes, circle, triangle, or rectangle");
        String type = s.nextLine();

        FractalDrawer fractal = new FractalDrawer();

        double totalArea = fractal.drawFractal(type);
        System.out.println("the total area is " + totalArea);
        s.close();
        
    }
}
