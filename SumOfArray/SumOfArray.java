package SumOfArray;

public class SumOfArray {

  public static void main(String[] args) {
    int[] numbers = { 5, 10, 15, 20, 25 };

    int sum = Sum(numbers);

    System.out.println("Sum of Elements in Array: " + sum);
  }

  public static int Sum(int[] array) {
    int sum = 0;

    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }

    return sum;
  }
}
