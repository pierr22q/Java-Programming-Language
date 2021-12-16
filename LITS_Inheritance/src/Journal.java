public class Journal extends Resource
{
  private int yearRange;
  private int yearRange2;
  private String publishingFrequency;


  public Journal(String title, String publisher, int yearRange, int yearRange2,
  String publishingFrequency)
  {
    super(title,publisher,"Journal",true);
    this.yearRange = yearRange;
    this.yearRange2 = yearRange2;
    this.publishingFrequency = publishingFrequency;
  }
  public int getYearRange()
  {
    return yearRange;
  }
  public void setYearRange(int yearRange)
  {
    this.yearRange = yearRange;
  }
  public int getYearRange2()
  {
    return yearRange2;
  }
  public void setYearRange2(int yearRange2)
  {
    this.yearRange2 = yearRange2;
  }
  public String getPublishingFrequency()
  {
    return publishingFrequency;
  }
  public void setPublishingFrequency(String publishingFrequency)
  {
    this.publishingFrequency = publishingFrequency;
  }

  public String toString() {
    String outstring2 = "Year in Range: " + yearRange + "-" + yearRange2 + "\n"+ "Frequency : "  + publishingFrequency + "\n";

    if (electronic == true) // checking if it is electronic or not
    {
     outstring2 += "Electronic" + "\n";
    } else {
    outstring2 += "Physical" + "\n";
    }

    if  (checkedOut == false){ //checking if its checked out or not
        outstring2 += "Available" + "\n";
    } else {
          outstring2 += "Checked Out To: " +  checkedOutPerson + "\n" ;
    }

     
        return  super.toString() + outstring2;
  }
}
