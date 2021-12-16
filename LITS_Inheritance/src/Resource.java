public class Resource
{
  protected String title;
  protected String publisher;
  protected String type;
  protected boolean electronic;
  protected boolean checkedOut;
  protected String checkedOutPerson;

  public Resource(String title, String publisher, String type, boolean electronic){
    this.title = title;
    this.publisher = publisher;
    this.type = type;
    this.electronic = electronic;
    this.checkedOut = false;
  }
  public String getType()
  {
    return type;
  }
  public String getTitle()
  {
    return title;
  }
  public boolean getCheckedOut()
  {
    return checkedOut;
  }
  public String getCheckOutPerson(){
    return checkedOutPerson;
  }
  public String toString() {
    String outstring = "Title :" + title + "\n" +"Type : "  + type + "\n"
    + "Publisher :"  + publisher + "\n";
    return outstring;

  }
  public boolean checkIn(){
    checkedOut = false;
    checkedOutPerson = null;
    return checkedOut;
  }
  public void checkOut(String checkOutName)
  {
    checkedOut = true;
    checkedOutPerson = checkOutName;
  }
}
