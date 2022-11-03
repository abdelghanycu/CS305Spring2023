package week04;

public class MergeSort {

  private final int[] arr;

  public MergeSort(int[] arr) {
    this.arr = arr;
  }

  public int[] getArr() {
    return arr;
  }

  public String printArray() {
    String res = "";
    for (int i = 0; i < arr.length; i++) {
      res += arr[i] + " ";
    }
    return res;
  }

  public void sort() {
    if (arr != null) {
      sort(0, arr.length - 1);
    }
  }

  private void sort(int st, int ed) {
    if (st < ed) {

      int mid = (st + ed) / 2;

      sort(st, mid);
      sort(mid + 1, ed);

      merge(st, mid, mid + 1, ed);
    }
  }

  private void merge(int st1, int ed1, int st2, int ed2) {

    int sz1 = ed1 - st1 + 1;
    int sz2 = ed2 - st2 + 1;

    int[] left = new int[sz1];
    int[] right = new int[sz2];

    for (int i = st1; i <= ed1; i++) {
      left[i - st1] = arr[i];
    }

    for (int i = st2; i <= ed2; i++) {
      right[i - st2] = arr[i];
    }

    int idx1 = 0, idx2 = 0;
    int k = st1;

    while (idx1 < sz1 && idx2 < sz2) {
      if (left[idx1] < right[idx2]) {
        arr[k++] = left[idx1++];
      } else {
        arr[k++] = right[idx2++];
      }
    }

    while (idx1 < sz1) {
      arr[k++] = left[idx1++];
    }

    while (idx2 < sz2) {
      arr[k++] = right[idx2++];
    }

  }

}
