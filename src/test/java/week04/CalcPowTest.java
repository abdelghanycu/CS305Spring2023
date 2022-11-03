package week04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalcPowTest {

  @Test
  public void powScenario1() {
    Assertions.assertEquals(CalcPow.pow(5, 8), 390625);
  }

  @Test
  public void porRecScenario1() {
    Assertions.assertEquals(CalcPow.powRec(5, 8), 390625);
  }
}
