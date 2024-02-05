public class NumberComparison {

  public static void main(String[] args) {
    int A = 20;
    int B = 10;
    int C = 30;
    int D = 40;

    int sumAB = A + B;
    int sumCD = C + D;

    if (sumAB < sumCD) {
      System.out.println(
        "The sum of " + A + " and " + B + " is less than the sum of " + C + " and " + D
      );
    } else if (sumAB > sumCD) {
      System.out.println(
        "The sum of " + A + " and " + B + " is not less than the sum of " + C + " and " + D
      );
    } else {
      System.out.println(
        "The sum of " + A + " and " + B + " is equal the sum of " + C + " and " + D
      );
    }
  }
}
