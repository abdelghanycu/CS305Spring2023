package week03;

public class BinarySearch3 {

  public static void main(String[] args) {
//    System.out.println(binarySearch(new int[]{1, 5, 7, 9, 12, 15, 20, 17}, -5));
    System.out.println(bsRec(0, elements.length - 1));
  }

  public static int binarySearch(int[] a, int key) {
    int start = 0;
    int end = a.length - 1;

    for (; start <= end; ) {
      int mid = (start + end) / 2;
      if (a[mid] == key) {
        return mid;
      } else if (a[mid] > key) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }

  static int[] elements = {3, 7, 8, 9, 45, 455};
  static int key = 10;

  public static int bsRec(int st, int ed) {
    if (st > ed) {
      return -1;
    }
    int mid = (st + ed) / 2;
    if (elements[mid] == key) {
      return mid;
    } else if (elements[mid] > key) {
      ed = mid - 1;
//      return bsRec(st, mid - 1);
    } else {
      st = mid + 1;
//      return bsRec(mid + 1, ed);
    }
    return bsRec(st, ed);
  }
}

