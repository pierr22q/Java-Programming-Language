/**
*Rectangle.java, Rectangle class. A Rectangle object will have two
 private instance variables
width: a double
length: a double
* @author Qiana Pierre
* @version 03/08/2021
*/


public class Rectangle extends Shape{
  private double width;
  private double length;

  public Rectangle(){
     width = 0;
     length = 0;
  }
  public Rectangle(double width,double length){
   this.width = width;
   this.length = length;
  }
  public Rectangle(double width,double length, String color,Boolean filled){
    super(color,filled);
    this.width = width;
    this.length = length;
  }
  public double getWidth(){
    return width;
  }
  public void setWidth(double width){
    this.width = width;
  }
  public double getLength(){
    return length;
  }
  public void setLength(double length){
    this.length = length;
  }
  public double getArea(){
    return width * length;
  }
  public double getPerimeter(){
    return 2 * width + 2 * length;
  }
  public String toString(){
    return "It's printing from Rectangle";
  }
}
