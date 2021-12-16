/**
* CopyArray file with copies an array and prints out both duplicant and original
* @author Qiana Pierre
* @version 01/20/2021
*/

public class CopyArray{
  public static void main (String [] args){
    int [] array1 = {17,42,3,5,4,26,27,14,55,18};
    int [] array2 = new int[10];// creates array with 10 intergers
    System.out.print("array1" + "\t"+ "array2\n");
      for(int i = 0; i < array1.length; i ++){ //loop to copy array1
        array2[i] = array1[i];
        System.out.println(array2[i] +"\t"+ array1[i]);// prints out both lists
    }
  }
}
