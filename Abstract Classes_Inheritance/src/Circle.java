/**
*Circle.java,Circle class. A Circle object will have a
 private instance variable
  radius: a double
* @author Qiana Pierre
* @version 03/08/2021
*/

public class Circle extends Shape{
  private double radius;

  public Circle(){
    radius = 0;
  }
  public Circle(double radius){
    this.radius = radius;
  }
  public Circle(double radius,String color, Boolean filled){
    super(color,filled);
    this.radius = radius;
  }
  public double getRadius(){
    return radius;
  }
  public void setRadius(double radius){
    this.radius = radius;
  }
  public double getArea(){
    return Math.PI * radius * radius;
  }
  public double getPerimeter(){
    return 2 * Math.PI * radius;
  }
  public String toString(){
    return "It's printing from Circle";
  }
}
