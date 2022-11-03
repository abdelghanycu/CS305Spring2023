package week04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MinMaxTest {

  private MinMax minMax;

  @Test
  public void
  getMinScenario1() {

    int[] arr = new int[]{5, 7, 8, 9, 21, 4, 7};

    minMax = new MinMax(arr);

    Assertions.assertEquals(minMax.getMin(), 4);
    Assertions.assertEquals(minMax.getMax(), 21);
  }

  @Test
  public void getMinScenario2() {

    int[] arr = new int[]{-9, 8, 5, -11};

    minMax = new MinMax(arr);

    Assertions.assertEquals(minMax.getMin(), -11);
    Assertions.assertEquals(minMax.getMax(), 8);
  }

  @Test
  public void getMinScenario3() {

    int[] arr = new int[]{-1, 5, 8, 7, 8, 9};

    minMax = new MinMax(arr);

    Assertions.assertEquals(minMax.getMin(), -1);
    Assertions.assertEquals(minMax.getMax(), 9);
  }

  @Test
  public void getMinScenario4() {

    int[] arr = new int[]{9, 5, 8, 7, 8, -1};

    minMax = new MinMax(arr);

    Assertions.assertEquals(minMax.getMin(), -1);
    Assertions.assertEquals(minMax.getMax(), 9);
  }

  @Test
  public void getMinScenario5() {
  }

  @Test
  public void getMinScenario6() {
  }

  @Test
  public void getMinScenario7() {
  }
}
