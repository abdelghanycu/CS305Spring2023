package week03_2;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Hanood
 */
public class OrdArrayList {

  private double[] a;                 // ref to array a
  private int n;               // number of data items
  //-----------------------------------------------------------

  public OrdArrayList(int max) // constructor
  {
    a = new double[max];                 // create the array
    n = 0;                        // no items yet
  }

  public void clear() {
    n = 0;
  }

  public double getFirst() {
    if (n == 0) {
      System.out.println("Empty List");
      return -1;
    }
    return a[0];
  }

  public double getLast() {
    if (n == 0) {
      System.out.println("Empty List");
      return -1;
    }
    return a[n - 1];
  }

  //----------------------- Binary Search O(log n) ------------------------
  public int find(double searchKey) {                              // find specified value
    int lowerBound = 0;
    int upperBound = n - 1;
    int curIn;

    while (true) {
      curIn = (lowerBound + upperBound) / 2;
      if (a[curIn] == searchKey) {
        return curIn;              // found it
      } else if (lowerBound > upperBound) {
        return -1;             // can't find it
      } else // divide range
      {
        if (a[curIn] < searchKey) {
          lowerBound = curIn + 1; // it's in upper half
        } else {
          upperBound = curIn - 1; // it's in lower half
        }
      }  // end else divide range
    }  // end while
  }  // end find()
  //----------------------- Insert Key in Order O(n) ---------------------

  public void insert(double value) // put element into array
  {
    int j = 0;
    for (j = 0; j < n; j++) // find where it goes
    {
      if (a[j] > value) // (linear search)
      {
        break;
      }
    }
    for (int k = n; k > j; k--) // move bigger ones up
    {
      a[k] = a[k - 1];
    }
    a[j] = value;                  // insert it
    n++;                      // increment size
  }
  //----------------------- Delete Key O(n) ----------------------------

  public boolean delete(double value) {
    int j = find(value);

    if (j == -1) // can't find it
    {
      return false;
    } else // found it
    {
      for (int k = j; k < n; k++) // move higher ones down
      {
        a[k] = a[k + 1];
      }
      n--;                   // decrement size
      return true;
    }
  }  // end delete()

  //------------------------ Find Min O(1) ------------------------------
  public double findMin() {
    // Your code here
    return 0;
  }

  //------------------------ Find Max O(1) ------------------------------
  public double findMax() {
    // Your code here
    return 0;
  }

  //------------------------ Find Next O(log n) ------------------------------
  // return the stored item with smallest key larger than k
  public double findNext(double k) {
    int j = find(k);
    if (j == -1 || j == n - 1) {
      return -1;
    }
    return a[j + 1];
  }

  //------------------------ Find Prev O(log n) ------------------------------
  // return the stored item with largest key smaller than k
  public double findPrev(double k) {
    // Your code here
    return 0;
  }
//------------------------ Display Elements O(n) ----------------------

  public void display() // displays array contents
  {
    for (int j = 0; j < n; j++) // for each element,
    {
      System.out.print(a[j] + " ");  // display it
    }
    System.out.println("");
  }
}
