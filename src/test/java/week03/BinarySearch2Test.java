//package week03;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//@ExtendWith(MockitoExtension.class)
//public class BinarySearch2Test {
//
//  @InjectMocks
//  private BinarySearch2 binarySearch2;
//
//  @Test
//  public void bsTestScenario1() {
//    int[] arr = {7, 8, 66, 99, 441, 4789};
//    Assertions.assertEquals(binarySearch2.bs(arr, 5), -1);
//    Assertions.assertEquals(binarySearch2.bs(arr, 99), 3);
//    Assertions.assertEquals(binarySearch2.bs(arr, 441), 4);
//    Assertions.assertEquals(binarySearch2.bs(arr, -5), -1);
//  }
//}
