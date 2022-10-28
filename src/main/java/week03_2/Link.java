package week03_2;

/**
 * @author Hanood
 */
public class Link {

  public double data;           // data item
  public Link next;              // next link in list
// -------------------------------------------------------------

  public Link(double d) // constructor
  {
    data = d;
  }
// -------------------------------------------------------------

  public void displayLink() // display ourself
  {
    System.out.print(data);
  }
  // end class Link
}
