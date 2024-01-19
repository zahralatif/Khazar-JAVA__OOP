package TrafficLight;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the initial color (red/green): ");
    String initialColor = scanner.nextLine();

    System.out.print("Enter the initial duration (in seconds): ");
    int initialDuration = scanner.nextInt();

    TrafficLight light = new TrafficLight(initialColor, initialDuration);

    System.out.println("The light is red: " + light.isRed());
    System.out.println("The light is green: " + light.isGreen());

    scanner.nextLine(); // Consume the newline character

    System.out.print("Enter the new color (red/green): ");
    String newColor = scanner.nextLine();
    light.changeColor(newColor);

    System.out.println("The light is now " + newColor + ": " + light.isGreen());
    System.out.println("The light duration is: " + light.getDuration());

    System.out.print("Enter the new duration (in seconds): ");
    int newDuration = scanner.nextInt();
    light.setDuration(newDuration);

    System.out.println("The light duration is now: " + light.getDuration());

    // Close the scanner to prevent resource leak
    scanner.close();
  }
}

