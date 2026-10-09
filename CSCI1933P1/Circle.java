package CSCI1933P1;
import java.awt.Color;
public class Circle {
    //Do I have to make these attributes private?
    private double x;
    private double y;
    private double radius;
    private Color color;
    public Circle(double x_Position, double y_Position, double r){
        x = x_Position;
        y = y_Position;
        radius = r;
    }
    public double calculatePerimeter(){ // How do I know when to use static?
        return 3.1416 * (radius * 2);
    }
    public double calculateArea(){
        return 3.1416 * (radius * radius);
    }
    public void setColor(Color newColor){
        this.color = newColor;
    }
    public void setPos(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return this.color;
    }
    public double getXPos(){
        return this.x;
    }
    public double getYPos(){
        return this.y;
    }
    public double getRadius(){
        return this.radius;
    }

}
