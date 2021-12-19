import java.util.Scanner;

public class Workshop3Project4Recursion {
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(fibonacci(n));
    }
}