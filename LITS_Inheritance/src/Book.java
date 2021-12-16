public class Book extends Resource
{
  private String author;
  private int numOfPgs;
  private int publishYr;
  private String genre;


  public Book(String title, String author,
  String publisher, int numOfPgs,int publishYr, String genre, boolean electronic)
  {
    super(title,publisher,"Book",electronic);
    this.author = author;
    this.numOfPgs = numOfPgs;
    this.publishYr = publishYr;
    this.genre = genre;
  }

  public String getAuthor()
  {
    return author;
  }
  public void setAuthor(String author)
  {
    this.author = author;
  }
  public int getnumOfPgs()
  {
    return numOfPgs;
  }
  public void setNumOfPgs(int numOfPgs)
  {
    this.numOfPgs = numOfPgs;
  }
  public int getPublishYr()
  {
    return publishYr;
  }
  public void setPublishYr(int publishYr)
  {
    this.publishYr = publishYr;
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
    String outstring2 = "Author : "+ author + "\n" + "Page Count :"  + numOfPgs + "\n"
     + "Year Published : "  + publishYr + "\n" +"Genres :" + genre + "\n";

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
