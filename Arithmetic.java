public class Arithmetic {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two integers as arguments.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        System.out.println("SUM: " + (n + m));
        System.out.println("DIFFERENCE: " + (n - m));
        System.out.println("PRODUCT: " + (n * m));

        if (m != 0) {
            System.out.println("DIVISION: " + (n / m));
            System.out.println("MODULUS: " + (n % m));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}

