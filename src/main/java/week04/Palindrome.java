package week04;

public class Palindrome {

  private final String text;

  public Palindrome(String text) {
    this.text = text;
  }

  public boolean isPalindrome() {
    return isPalindrome(0);
  }

  public boolean isPalindrome(int idx) {
    if (idx == text.length() / 2) {
      return text.charAt(idx) == text.charAt(text.length() / 2);
    }
    return text.charAt(idx) == text.charAt(text.length() - 1 - idx) && isPalindrome(idx + 1);
  }

}
