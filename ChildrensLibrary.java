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
  }
}
