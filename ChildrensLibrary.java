/*
 * Activity 4.2.1
 */
import java.util.ArrayList;
import java.io.IOException;

public class ChildrensLibrary
{
  public static void main(String[] args) throws IOException
  {
    Library library = new Library();
    ArrayList<Book> myarray = library.getChildrensBooks();
    for (Book list : myarray)
    {
      if (list.getAuthor().equals("L. Frank Baum"))
      {
        System.out.println(list.getTitle());
      }
    }

    String bookToFind = "Sky Island";
    double minimumRating = 0.0;
    for (Book list : myarray)
    {
      if (list.getTitle().equals(bookToFind))
      {
        minimumRating = list.getRating();
      }
    }
    System.out.println(minimumRating);

    for (Book list : myarray)
    {
      if (list.getRating() >= minimumRating)
      {
        String book = "";
        String author = "";
        book = list.getTitle();
        author = list.getAuthor();
        System.out.println("AUTHOR: " + author + " \n " + " BOOK: " + book + "\n");
      }
    }

    for (int i = 0; i < myarray.size(); i++)
    {
      if (myarray.get(i).getTitle().contains("The"))
      {
        System.out.println("TITLE: " + myarray.get(i).getTitle());
        System.out.println("LOCATION IN LIBRARY: " + i + "\n");
      }
    }
  }
}
