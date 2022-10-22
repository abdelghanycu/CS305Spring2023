package week03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BinarySearch3Test {

  @InjectMocks
  private BinarySearch3 binarySearch3;

  @Test
  public void bsTestScenario1() {
    int[] arr = {1, 2, 4, 7, 8, 9, 45, 47, 78, 96};
    Assertions.assertEquals(binarySearch3.binarySearch(arr, 10), -1);
    Assertions.assertEquals(binarySearch3.binarySearch(arr, 8), -1);
  }
}
