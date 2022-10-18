package week02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BinarySearchTest {

  @InjectMocks
  private BinarySearch binarySearch;

  @Test
  public void bsTestScenario1() {
    int[] arr = {1};
    Assertions.assertEquals(-1, binarySearch.bs(arr, 5));
    Assertions.assertEquals(0, binarySearch.bs(arr, 1));
  }

  @Test
  public void bsTestScenario2() {
    int[] arr = {1, 2, 5, 7, 8, 11, 13, 55};
    Assertions.assertEquals(-1, binarySearch.bs(arr, 3));
    Assertions.assertEquals(3, binarySearch.bs(arr, 7));
    Assertions.assertEquals(7, binarySearch.bs(arr, 55));
  }

  @Test
  public void bsTestScenario3() {
    int[] arr = {5, 41, 107};
    Assertions.assertEquals(0, binarySearch.bs(arr, 5));
    Assertions.assertEquals(1, binarySearch.bs(arr, 41));
    Assertions.assertEquals(2, binarySearch.bs(arr, 107));
    Assertions.assertEquals(-1, binarySearch.bs(arr, -1));
    Assertions.assertEquals(-1, binarySearch.bs(arr, 17));
    Assertions.assertEquals(-1, binarySearch.bs(arr, 99));
  }
}
