//package week03;
//
//public class BinarySearch2 {
//  public static void main(String[] args) {
//
////    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
////    System.out.println(bs(arr, 15));
//
//    BinarySearch2 binarySearch2 = new BinarySearch2();
//    System.out.println(binarySearch2.bsRec(0, binarySearch2.elements.length - 1));
//  }
//
//  int[] elements = {1, 4,5, 7,9, 55, 441, 457};
//  int element = 4;
//
//  public int bsRec(int st, int ed) {
//    if(st > ed) {
//      return -1;
//    }
//    int mid = (st + ed) / 2;
//    if (elements[mid] == element) {
//      return mid;
//    } else if (elements[mid] > element) {
//      return bsRec(st, mid - 1);
//    } else {
//      return bsRec(mid + 1, ed);
//    }
//  }
//
//  public static int bs(int[] arr, int x) {
//    int start = 0;
//    int end = arr.length - 1;
//    while (start <= end) {
//      int mid = (start + end) / 2;
//
//      if (arr[mid] == x) {
//        return mid;
//      } else if (arr[mid] > x) {
//        end = mid - 1;
//      } else {
//        start = mid + 1;
//      }
//    }
//    return -1;
//  }
//}
