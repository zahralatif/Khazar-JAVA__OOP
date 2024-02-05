public class MaxMinProduct {

  public static void main(String[] args) {
    double num1 = 21.7;
    double num2 = 7.7;
    double num3 = 7.21;
    double num4 = 19.12;

    double max = Math.max(num1, num2);

    double min = Math.min(num3, num4);

    double product = max * min;

    System.out.println("The maximum between the first two numbers is: " + max);
    System.out.println("The minimum between the second two numbers is: " + min);
    System.out.println("The product of the maximum and minimum is: " + product);
  }
}
