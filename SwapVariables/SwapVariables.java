public class SwapVariables {
    public static void main(String[] args) {

        int a = 21;
        int b = 7;

        System.out.println("Initial values - a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Swapped values - a = " + a + ", b = " + b);
    }
}
