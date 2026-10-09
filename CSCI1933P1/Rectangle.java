package CSCI1933P1;
import java.awt.Color;
public class Rectangle {
    private double x;
    private double y;
    private double width;
    private double height;
    private Color color;
    public Rectangle(double x_Position, double y_Position, double width, double height){
        this.x = x_Position;
        this.y = y_Position;
        this.width = width;
        this.height = height;
    }
    public double calculatePerimeter(){
        return (2 * height) + (2 * width);
    }
    public double calculateArea(){
        return height * width;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public void setPos(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public Color getColor(){
        return this.color;
    }
    public double getXPos(){
        return this.x;
    }
    public double getYPos(){
        return this.y;
    }
    public double getHeight(){
        return this.height;
    }
    public double getWidth(){
        return this.width;
    }
}
