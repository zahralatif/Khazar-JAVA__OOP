public class NumberCheck {

  public static void main(String[] args) {
    int number1 = 21;
    int number2 = -7;
    int number3 = 18;
    int number4 = 0;

    if (number1 == 0) {
      System.out.println("number1 = " + number1 + " is zero.");
    } else if (number1 % 2 == 0) {
      System.out.println("number1 = " + number1 + " is even.");
    } else {
      System.out.println("number1 = " + number1 + " is odd.");
    }

    if (number2 == 0) {
      System.out.println("number2 = " + number2 + " is zero.");
    } else if (number2 % 2 == 0) {
      System.out.println("number2 = " + number2 + " is even.");
    } else {
      System.out.println("number2 = " + number2 + " is odd.");
    }

    if (number3 == 0) {
      System.out.println("number3 = " + number3 + " is zero.");
    } else if (number3 % 2 == 0) {
      System.out.println("number3 = " + number3 + " is even.");
    } else {
      System.out.println("number3 = " + number3 + " is odd.");
    }

    if (number4 == 0) {
      System.out.println("number4 = " + number4 + " is zero.");
    } else if (number4 % 2 == 0) {
      System.out.println("number4 = " + number4 + " is even.");
    } else {
      System.out.println("number4 = " + number4 + " is odd.");
    }
  }
}
