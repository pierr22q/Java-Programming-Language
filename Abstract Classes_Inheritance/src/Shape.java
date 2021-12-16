/**
*Shape.java, a abstract class. It has two instance variables: color: a String
filled: a boolean (true when the shape is filled in, false when it's empty)
* @author Qiana Pierre
* @version 03/08/2021
*/

public abstract class Shape{
  public String color;
  public Boolean filled;

  public Shape(){
    color = "black";
    filled = true;
  }
  public Shape(String color, Boolean filled){
    this.color = color;
    this.filled = filled;
  }

  public String getColor(){
    return color;
  }
  public void setColor(String color){
    this.color = color;
    }
  public Boolean isFilled(){
    return (filled == true);
  }
  public void setFilled(Boolean filled){
    this.filled = filled;
  }
  public String toString() {
    return "Printing from Shape";
  }
  public abstract double getArea();
  public abstract double getPerimeter();
}
