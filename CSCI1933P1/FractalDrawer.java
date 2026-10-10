package CSCI1933P1;
// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;

public class FractalDrawer {
    private double totalArea=0;  // member variable for tracking the total area

    public FractalDrawer() {

    }  // contructor


    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {
        //here is where we are going to call the methods for the first time
        Rectangle myRectangle = new Rectangle(300,300,200,200);
        Triangle myTriangle = new Triangle(400, 400, 100, 100);
        Circle myCircle = new Circle(400, 400, 100);

        return 0;
    }


    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        // this new canvas object you are going to do it in the FractalProgram.java
        // Canvas drawing = new Canvas(800,800);
    }


    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        if (level <= 0){
            return;
        }
        else {
            level -= 1;
            if (level == 7){
                c = Color.PINK;
            }
        else if (level == 6) {
            c = Color.MAGENTA;
        }
        else if (level == 5) {
            c = Color.RED;
        }
        else if (level == 4) {
            c = Color.CYAN;
        }
        else if (level == 3){
            c = Color.WHITE;
        }
        else if (level == 2){
            c = Color.ORANGE;
        }
        else if (level == 1){
            c = Color.LIGHT_GRAY;
        }
        else {
            c = Color.BLUE;
        }
    }


    }


    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        //here you are calling the class Rectangle.java so use the parameters adecuados
        Rectangle myRectangle = new Rectangle(x, y, width, height);
        // to set the color you can use a random color
        myRectangle.setColor(Color.BLUE);
        can.drawShape(myRectangle);
        //change the 3 recursive  calls to the right values to get the rectangles
        //upper left
        drawRectangleFractal(width-100,height-100, x-100,y-100, c, can, level);
        //upper right
        drawRectangleFractal(width-100,height-100, x+300,y+300, c, can, level);
        //lower right
        drawRectangleFractal(width-100,height-100, x,y+300, c, can, level);
        //lower left
        drawRectangleFractal(width-100,height-100, x-300,y, c, can, level);
    }

}
