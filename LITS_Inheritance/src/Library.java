public class Library{

/*  a method that count how many items are checked out,
then creates an array of that size, then copy all checked-out items into the new array and return it. */
  public static Resource [] getAllCheckedOut(Resource [] list){
    int count = 0;
    for (int i= 0; i < list.length; i++){
      if (list[i].getCheckedOut()){
        count ++;
      }
    }
    Resource[] allcheckedOut = new Resource[count];
    int count2 = -1;
    for (int i= 0; i < list.length; i++){
      if (list[i].getCheckedOut()){
        count2++;
        allcheckedOut[count2]= list[i];
      }
    }
    return allcheckedOut;
    }

/*takes an array of Resource objects and a String, and returns a smaller array of Resource objects*/
  public static Resource [] getAllUserHasCheckedOut(Resource [] list,String user){
    int count = 0;
    for (int i= 0; i < list.length; i++){
      if (list[i].getCheckOutPerson() == user){
        count ++;
        }
      }

      Resource[] allUsercheckedOut = new Resource[count];

      int count2 = -1;
      for (int i= 0; i < list.length; i++){
        if (list[i].getCheckOutPerson() == user){
          count2++;
          allUsercheckedOut[count2]= list[i];
        }
      }
      return allUsercheckedOut;
    }

  /* takes an array of Resource objects and a String, and returns a smaller array of Resource objects */
  public static Resource [] getAllOfType(Resource [] list, String type){
    int count = 0;
    for (int i= 0; i < list.length; i++){
      if (list[i].getType().equals(type)){
        count ++;
        }
      }

      Resource[] allOfType = new Resource[count];

      int count2 = -1;
      for (int i= 0; i < list.length; i++){
        if (list[i].getType().equals(type)){
          count2++;
          allOfType[count2]= list[i];
        }
      }
      return allOfType;
    }
}
