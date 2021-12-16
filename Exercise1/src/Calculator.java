/**
* Calcuator file with methods to do differnt kinds of math, including:
* addition subtraction, multiplication, divison, and factorials.
* @author Qiana Pierre
* @version 01/20/2021
*/

public class Calculator {

  /**
   * Add 1 to the passed-in number
   *
   * @param i the first number to be added
   * @return the numver passed in + 1
   */
  public static int add1(int i){
    return i + 1;
  }

  /**
   * Subtract 1 to the passed-in number
   *
   * @param i the first number to be added
   * @return the numver passed in - 1
   */

  public static int sub1(int i){
    return i - 1;
  }


  /**
   * Add 1 to the passed-in number
   *
   * @param i the first number to be added
   * @param j the second number to be added
   * @return the sum of the passed-in num
   */
   public static int add(int i,int j){
     for(int n = 0; n < j; n ++){
       i = add1(i);
     }
     return i;
   }


   /**
    * Sub 1 to the passed-in number
    *
    * @param i the first number to be subtracted
    * @param j the second number to be subtracted
    * @return the difference of the passed-in num
    */
   public static int sub(int i, int j){
     for(int n = 0; n < j; n ++){
       i = sub1(i);
     }
     return i;

   }


    /**
     * Multiply the passed-in number
     *
     * @param i the first number to be multiply
     * @param j the second number to be multiply
     * int ret set to zero, updated through loop
     * @return the product of the passed-in num
     */
    public static int multiply(int i, int j){
      int ret = 0;
      for(int n = 0; n < j; n++){
        ret = add(ret,i);
      }
      return ret;
    }

    /**
     * Divide  passed-in numbers
     *
     * @param i the first number to be divided
     * @param j the second number to be divided
     * int ret set to zero, updated through loop
     * @return the quotient of the passed-in num
     */

    public static int divide(int i, int j){
      int ret = 0;
      while (sub(i,j) >=0) {
        ret = add1(ret);
        i = sub(i,j);
      }
        return ret;
    }


    /**
     * Factor passed-in numbers
     *
     * @param i the first number to be factored
     * @param j the second number to be factored
     * int ret set to zero, updated through loop
     * @return the factorial of the passed-in num
     */

     public static int factorial(int i){
       if (i < 1){
         return 1;
       } else {
        return multiply(i,factorial(sub1(i)));
     }
   }


  /**
  * Main method to call all math on some variables
  */

  public static void main(String[] args){
      // Variables to use in the math
      int first = 5;
      int second = 4;
      // Printing test for variables
      System.out.println(first + " + 1 = " + add1(first));
      System.out.println(first + " - 1 = " + sub1(first));
      System.out.println(first + " + " + second + " = " + add(first,second));
      System.out.println(first + " - " + second + " = " + sub(first,second));
      System.out.println(first + " * " + second +  " = " + multiply(first,second));
      System.out.println(first + " / " + second + " = " + divide(first,second));
      System.out.println(first + " != " + factorial(first));

    }
  }
