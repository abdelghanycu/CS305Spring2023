package week02;

public class BinarySearch {

  public static void main(String[] args) {
    BinarySearch b = new BinarySearch();
    int[] arr = {4, 7, 8, 9, 11, 13, 15};
    for (int i = -1; i < 18; i++) {
      System.out.println("the element " + i + " exist in the index " + b.bs(arr, i));
    }
  }

  /**
   * binary search method
   *
   * @param arr sorted array of elements
   * @param ele the target element to find
   * @return the index of the target element or -1 if not exist
   */
  public int bs(int[] arr, int ele) {

    int st = 0;
    int ed = arr.length - 1;

    int mid;

    while (st <= ed) {

      mid = (st + ed) / 2;

      if (arr[mid] == ele) {
        return mid;
      } else if (arr[mid] > ele) {
        ed = mid - 1;
      } else {
        st = mid + 1;
      }
    }

    return -1;
  }
}
