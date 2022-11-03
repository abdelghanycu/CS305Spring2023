package week04;

public class CalcPow {

  public static int pow(int n, int p) {
    int res = 1;
    for (int i = 0; i < p; i++) {
      res *= n;
    }
    return res;
  }

  public static int powRec(int n, int p) {
    if (p == 0) {
      return 1;
    }
    return n * powRec(n, p - 1);
  }
}
