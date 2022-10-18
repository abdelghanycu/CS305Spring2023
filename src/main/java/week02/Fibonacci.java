package week02;

public class Fibonacci {

  public static void main(String[] args) {
    Fibonacci f = new Fibonacci();
    for (int i = 0; i < 20; i++) {
      System.out.println("with i = " + i + " result by way1 = " + f.fibWay1(i));
      System.out.println("with i = " + i + " result by way2 = " + f.fibWay2(i));
    }
  }

  public int fibWay1(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    return fibWay1(n - 1) + fibWay1(n - 2);
  }

  public int fibWay2(int n) {
    int[] arr = new int[n + 2];
    arr[0] = 0;
    arr[1] = 1;
    for (int i = 2; i <= n; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
    }
    return arr[n];
  }
}
