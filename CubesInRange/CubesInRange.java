public class CubesInRange {

  public static void main(String[] args) {
    int a = 2;
    int b = 7;

    System.out.println("Cubes of numbers between " + a + " and " + b + ":");
    for (int i = a; i <= b; i++) {
      int cube = i * i * i;
      System.out.println("Cube of " + i + " is " + cube);
    }
  }
}
