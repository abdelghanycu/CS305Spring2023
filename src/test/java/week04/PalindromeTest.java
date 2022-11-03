package week04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PalindromeTest {

  private Palindrome palindrome;

  @Test
  public void isPalindromeScenario1() {

    palindrome = new Palindrome("BadhopvpohdaB");

    Assertions.assertTrue(palindrome.isPalindrome());
  }

  @Test
  public void isPalindromeScenario2() {

    palindrome = new Palindrome("cv");

    Assertions.assertFalse(palindrome.isPalindrome());
  }

  @Test
  public void isPalindromeScenario3() {

    palindrome = new Palindrome("v");

    Assertions.assertTrue(palindrome.isPalindrome());
  }

  @Test
  public void isPalindromeScenario4() {

    palindrome = new Palindrome("fjotVSSVtojf");

    Assertions.assertTrue(palindrome.isPalindrome());
  }
}
