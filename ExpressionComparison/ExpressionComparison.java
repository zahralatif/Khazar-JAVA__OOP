public class ExpressionComparison {

  public static void main(String[] args) {
    int a = 5;
    int b = 4;
    int c = 3;

    int result = (a + b) / c;

    System.out.println(
      "(a + b) / c => " + "(" + a + " + " + b + ") / " + c + " = " + result
    );

    if (result < 10) {
      System.out.println("(a + b) / c is less than 10.");
    } else if (result == 10) {
      System.out.println("(a + b) / c is equal to 10.");
    } else {
      System.out.println("(a + b) / c is greater than 10.");
    }
  }
}
