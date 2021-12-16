public class CD extends Resource
{
  private String artist;
  private int publishedYear;
  private int length;

  public CD(String title, String artist,
  String publisher, int publishedYear,int length)
  {
    super(title,publisher,"CD",false);
    this.artist = artist;
    this.publishedYear = publishedYear;
    this.length = length;
  }

  public String getArtist()
  {
    return artist;
  }
  public void setArtist()
  {
    this.artist = artist;
  }
  public String getRecordingCompany()
  {
    return publisher;
  }
  public void setRecordingCompany()
  {
    this.publisher = publisher;
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
  public String toString() {
    String outstring = "Title : " + title + "\n" +"Type : "  + type + "\n"
    + "Recording Company : "  + publisher + "\n" + "Artist : "+ artist + "\n" + "Year Published : " + publishedYear + "\n"
    + "Length(min): "  + length + "\n";

    if (electronic == true) // checking if it is electronic or not
    {
     outstring += "Electronic" + "\n";
    } else {
    outstring += "Physical" + "\n";
    }

    if  (checkedOut == false){ //checking if its checked out or not
        outstring += "Available" + "\n";
    } else {
          outstring += "Checked Out To: " +  checkedOutPerson + "\n" ;
    }

    return outstring;

      }
  }
