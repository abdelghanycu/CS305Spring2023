package week03_2;

import java.util.Arrays;

/**
 * @author Hanood
 */
public class ArrayList {

  double[] a;                 // ref to array a
  int n;               // number of data items
  //-----------------------------------------------------------

  public ArrayList(int max) // constructor
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
  //----------------------- Linear Search O(n) ------------------------

  public int find(double searchKey) {                              // find specified value
    int j;
    for (j = 0; j < n; j++) // for each element,
    {
      if (a[j] == searchKey) // found item?
      {
        break;                       // exit loop before end
      }
    }
    if (j == n) // gone to end?
    {
      return -1;                   // yes, can't find it
    } else {
      return j;                    // no, found it
    }
  }  // end find()
  //----------------------- Insert Key at End O(1) ---------------------

  public void insert(double value) // put element into array
  {
    a[n] = value;             // insert it
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

  //------------------------- Selection Sort O(n^2) ------------------------
  public void selectionSort() {
    int out, in, min;

    for (out = 0; out < n - 1; out++) // outer loop
    {
      min = out;                     // minimum
      for (in = out + 1; in < n; in++) // inner loop
      {
        if (a[in] < a[min]) // if min greater,
        {
          min = in;               // we have a new min
        }
      }
      swap(out, min);                // swap them
    }  // end for(out)
  }  // end selectionSort()
//--------------------------------------------------------------

  private void swap(int one, int two) {
    double temp = a[one];
    a[one] = a[two];
    a[two] = temp;
  }

  //------------------------ Find Min O(n) ------------------------------
  public double findMin() {
    // Your code here
    return 0;
  }

  //------------------------ Find Max O(n) ------------------------------
  public double findMax() {
    // Your code here
    return 0;
  }

  //------------------------ Find Next O(n) ------------------------------
  // return the stored item with smallest key larger than k
  public double findNext(double k) {
    int f = find(k);
    if (f == -1) {
      return -1;
    }

    double minLarge = -1;

    int i;
    for (i = 0; i < n; i++) {
      if (a[i] > k) {
        minLarge = a[i];
        break;
      }
    }

    for (int j = i + 1; j < n; j++) {
      if (a[j] > k && a[j] < minLarge) {
        minLarge = a[j];
      }
    }

    return minLarge; // -1 if no such item
  }

  //------------------------ Find Prev O(n) ------------------------------
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

  public String toString() {
    String s = "";
    for (int j = 0; j < n; j++) // for each element,
    {
      s += a[j] + " ";
    }
    return s;
  }
}
