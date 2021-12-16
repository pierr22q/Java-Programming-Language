public class DVD extends Resource
{
  private int publishedYear;
  private int length;
  private String performers;
  private String genre;

  public DVD(String title, String publisher, int publishedYear,
  int length,String performers,String genre)
  {
    super(title,publisher,"DVD",false);
    this.publishedYear = publishedYear;
    this.length = length;
    this.performers = performers;
    this.genre = genre;
  }
  public int getPublishedYear()
  {
    return publishedYear;
  }
  public void setPublishedYear()
  {
    this.publishedYear = publishedYear;
  }
  public int getLength()
  {
    return length;
  }
  public void setLength()
  {
    this.length = length;
  }
  public String getPerformers()
  {
    return performers;
  }
  public void setPerformers()
  {
    this.performers = performers;
  }
  public String getGenre(String genre)
  {
    return genre;
  }
  public void setGenre(String genre)
  {
    this.genre = genre;
  }
  public String toString() {
    String outstring2 =   "Year Published : " + publishedYear + "\n"+ "Length(min) : "
    + length + "\n" + "Performers : " + performers + "\n" + "Generes : " + genre + "\n";

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
