package SumOfArray;

import java.util.Scanner;

public class SumOfArray {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("How many number will you add? : ");
    int n = scanner.nextInt();

    int[] numbers = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.print("Enter a number: ");
      numbers[i] = scanner.nextInt();
    }

    int sum = Sum(numbers);

    System.out.println("Sum of elements in Array: " + sum);

    scanner.close();
  }

  public static int Sum(int[] array) {
    int sum = 0;

    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }

    return sum;
  }
}
