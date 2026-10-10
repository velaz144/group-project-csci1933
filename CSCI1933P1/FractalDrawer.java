package CSCI1933P1;
// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;

public class FractalDrawer { 
    private double totalArea=0;  // member variable for tracking the total area

    public FractalDrawer() {}

    //checks which shape the use selected
    public double drawFractal(String type) {
        Canvas drawing = new Canvas(800, 800);

        //these draw the circle, rectangle, or triangle
        if (type.equalsIgnoreCase("circle")) {
            drawCircleFractal(100, 400, 400, Color.BLACK, drawing, 8);
        }
        else if (type.equalsIgnoreCase("rectangle")){
            drawRectangleFractal(100, 100, 350, 350, Color.PINK, drawing, 8);
        
        }
        else if (type.equalsIgnoreCase( "triangle")){
            drawTriangleFractal(100, 100, 350, 350, Color.RED, drawing, 8);
        }
    

        return totalArea;
    }


    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        if(level <= 0){
            return; //end reccursive loop
        }
        //setting colors
        else{
            level -= 1; 
            if(level == 7){
                c = Color.red;
            }
            else if (level == 6) {
                c = Color.orange;
        }
            else if (level == 5) {
                c = Color.YELLOW;
            }
            else if (level == 4){
                c = Color.PINK;
            }
            else if (level == 3){
                c = Color.white;
            }
            else if (level == 2){
                c = Color.MAGENTA;
            }
            else if (level == 1){
                c = Color.RED;
            }
            else {
                c = Color.ORANGE;
            } 
        }

        Triangle myTriangle = new Triangle(x, y, width, height);
        myTriangle.setColor(c);
        can.drawShape(myTriangle);
        totalArea += myTriangle.calculateArea();

        drawTriangleFractal(width * .5, height * .5, x - (width * .5), y, c, can, level);
        drawTriangleFractal(width * .5, height * .5, x + width, y, c, can, level);
        drawTriangleFractal(width * .5, height * .5, x + width * .25, y - height * .5, c, can, level);
    }



    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        if (level <= 0){
            return; //reccursive loop end
        }
        //setting colors
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
            c = Color.PINK;
        }
        else if (level == 2){
            c = Color.MAGENTA;
        }
        else if (level == 1){
            c = Color.LIGHT_GRAY;
        }
        else {
            c = Color.BLUE;
        }
        Circle myCircle = new Circle(x, y, radius);
        myCircle.setColor(c);
        can.drawShape(myCircle);
        totalArea += myCircle.calculateArea();
        drawCircleFractal(radius * .5, x - radius, y - radius, c, can, level); //third
        drawCircleFractal(radius * .5, x + radius, y - radius, c, can, level); //fourth
        drawCircleFractal(radius * .5, x + radius, y + radius, c, can, level); //first
        drawCircleFractal(radius * .5, x - radius, y + radius, c, can, level); //second
    }


    }


    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        if(level <= 0){
            return; //recursive loop end
        }
        //setting colors
        else{
            level -= 1;
        }
            if (level % 3 == 0){
                c = Color.PINK;
            }
            else if (level % 3 == 1){
                c = Color.CYAN;
            }
            else {
                c = Color.MAGENTA;
            }


        Rectangle myRectangle = new Rectangle(x, y, width, height);
        myRectangle.setColor(c);
       
       
        can.drawShape(myRectangle);
        
        totalArea += myRectangle.calculateArea();

        //upper l
        drawRectangleFractal(width * .5, height * .5, x - width * .5, y - height * .5, c, can, level);

        //lower l
        drawRectangleFractal(width * .5, height * .5, x - width * .5, y + height, c, can, level);

        //upper r
        drawRectangleFractal(width * .5, height * .5, x + width, y - height * .5, c, can, level);

        //lower r
        drawRectangleFractal(width * .5, height * .5, x + width, y + height, c, can, level);
    }

}
