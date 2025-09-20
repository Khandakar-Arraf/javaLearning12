package examples;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        int x = 5;

        System.out.println("Initial x = " + x);

        // Unary plus and minus
        System.out.println("+x = " + +x);
        System.out.println("-x = " + -x);

        // Increment / Decrement
        System.out.println("x++ = " + (x++)); // post-increment
        System.out.println("After x++ -> x = " + x);
        System.out.println("++x = " + (++x)); // pre-increment
        System.out.println("x-- = " + (x--)); // post-decrement
        System.out.println("--x = " + (--x));


    }
}
