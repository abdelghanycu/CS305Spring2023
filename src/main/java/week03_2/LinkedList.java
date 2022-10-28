package week03_2;

/**
 * @author Hanood
 */
public class LinkedList {

  private Link first;            // ref to first link on list
  int n;

  // -------------------------------------------------------------
  public LinkedList() // constructor
  {
    first = null;               // no links on list yet
    n = 0;
  }

  public void clear() {
    first = null;
    n = 0;
  }

  public double getFirst() {
    if (n == 0) {
      System.out.println("Empty List");
      return -1;
    }
    return first.data;
  }

  public double getLast() {
    if (n == 0) {
      System.out.println("Empty List");
      return -1;
    }
    if (n == 1) {
      return first.data;
    }

    Link cur = first;
    while (cur.next != null) {
      cur = cur.next;
    }
    return cur.data;
  }
  //----------------------- Linear Search O(n) ------------------------
  // -1 if no such element, 0 if found

  public int find(double searchKey) {                              // find specified value
    if (n == 0) {
      return -1;
    }

    Link cur = first;

    while (cur != null && cur.data != searchKey) {
      cur = cur.next;
    }
    if (cur == null) {
      return -1;
    } else {
      return 0;
    }

  }  // end find()
  //----------------------- Insert Key at First O(1) ---------------------

  public void insert(double value) // put element into List
  {
    if (n == 0) {
      first = new Link(value);
    } else {
      Link newLink = new Link(value);
      newLink.next = first;
      first = newLink;
    }
    n++;
  }
  //----------------------- Delete Key O(n) ----------------------------

  public boolean delete(double value) {
    int j = find(value);

    if (j == -1) // can't find it
    {
      return false;
    } else // found it
    {

      Link cur = first;
      Link prev = first;

      while (cur.data != value) {
        prev = cur;
        cur = cur.next;
      }

      if (cur == first) {
        first = first.next;
      } else {
        prev.next = cur.next;
      }

      n--;                   // decrement size
      return true;
    }
  }  // end delete()

  //------------------------- Selection Sort O(n^2) ------------------------
  public void selectionSort() {

    // Your code here

  }  // end selectionSort()
//--------------------------------------------------------------

  private void swap(Link one, Link two) {
    double temp = one.data;
    one.data = two.data;
    two.data = temp;
  }

  //------------------------ Find Min O(n) ------------------------------
  public double findMin() {
    if (n == 0) {
      return -1;
    }
    if (n == 1) {
      return first.data;
    }

    Link cur = first;
    double min = cur.data;

    while (cur != null) {
      if (cur.data < min) {
        min = cur.data;
      }
      cur = cur.next;
    }

    return min;
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
    Link cur1 = first;
    Link cur2 = first;
    while (cur1 != null) {
      if (cur1.data > k) {
        minLarge = cur1.data;
        cur2 = cur1.next;
        break;
      }

      cur1 = cur1.next;
    }

    while (cur2 != null) {
      if (cur2.data > k && cur2.data < minLarge) {
        minLarge = cur2.data;
      }
      cur2 = cur2.next;
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
    Link cur = first; // for each element,
    while (cur != null) {
      System.out.print(cur.data + " ");  // display it
      cur = cur.next;
    }
    System.out.println("");
  }

  public String toString() {
    String s = "";
    Link cur = first; // for each element,
    while (cur != null) {
      s += cur.data + " ";
      cur = cur.next;
    }

    return s;
  }
}
