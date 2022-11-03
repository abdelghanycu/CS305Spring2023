package week04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MergeSortTest {

  private MergeSort mergeSort;

  @Test
  public void sortScenario1() {

    mergeSort = new MergeSort(new int[]{17, 89, 45, 0, 12, -1});
    mergeSort.sort();

    int[] arr = mergeSort.getArr();

    System.out.println(mergeSort.printArray());

    Assertions.assertEquals(arr[0], -1);
    Assertions.assertEquals(arr[1], 0);
    Assertions.assertEquals(arr[2], 12);
    Assertions.assertEquals(arr[3], 17);
    Assertions.assertEquals(arr[4], 45);
    Assertions.assertEquals(arr[5], 89);
  }

  @Test
  public void sortScenario2() {

    mergeSort = new MergeSort(new int[]{7, 8, 7, 11, 65, 94, 12});
    mergeSort.sort();

    int[] arr = mergeSort.getArr();

    System.out.println(mergeSort.printArray());

    Assertions.assertEquals(arr[0], 7);
    Assertions.assertEquals(arr[1], 7);
    Assertions.assertEquals(arr[2], 8);
    Assertions.assertEquals(arr[3], 11);
    Assertions.assertEquals(arr[4], 12);
    Assertions.assertEquals(arr[5], 65);
    Assertions.assertEquals(arr[6], 94);
  }
}
