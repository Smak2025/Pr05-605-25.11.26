public class IntMath {

    public static int div(int a, int b) {
        return a / b;
    }

    public static long factorial(int n) {
        long r = 1;
        for (int i = 2; i <= n; i++) r *= i;
        return r;
    }

    /** Количество цифр числа (у нуля одна цифра). */
    public static int digits(int number) {
        int n = Math.abs(number), count = 1;
        while (n >= 10) { n /= 10; count++; }
        return count;
    }

    /** k-я цифра числа справа, нумерация с нуля. */
    public static int digit(int number, int k) {
        int n = Math.abs(number);
        for (int i = 0; i < k; i++) n /= 10;
        return n % 10;
    }

    public static int sum(int[] a) {
        int s = 0;
        for (int v : a) s += v;
        return s;
    }

    public static double average(int[] a) {
        return (double) sum(a) / a.length;
    }

    public static int parse(String s) {
        return Integer.parseInt(s.trim());
    }
}