/**
*In Square.java,  Square class. A Square object will have one private
instance variable
 side: a double -- holds the length of a side of the square
* @author Qiana Pierre
* @version 03/08/2021
*/

public class Square extends Rectangle{
  private double side;

  public Square(){
    side = 0;
  }
  public Square(double side){
    super(side, side);
  }
  public Square(double side, String color,Boolean filled){
    super(side,side,color,filled);
  }

  public double getSide(){
    return side;
  }
  public void setSide(double side){
    this.side = side;
  }
  public void setWidth(double side){
    double width = getPerimeter()/ 2 - side * 2;
  }
  public void setLength(double side){
    double length = side;
  }
  public String toString(){
    return "It's printing from Square";
    }
}
