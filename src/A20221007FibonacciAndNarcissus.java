/**
 * @author hardy
 * @version V1.0.0
 * @description
 * @date 2022/10/12
 * @since 1.0
 */
public class A20221007FibonacciAndNarcissus {
    public static void main(String[] args) {
        System.out.println(narcissus(153));
    }
    public static int fib(int num) {
        if (num < 2) {
            return num;
        }
        return fib(num - 1) + fib(num - 2);
    }

    public static boolean narcissus(int num) {
        if (num < 100 || num > 999) {
            return false;
        }
        int a = num / 100;
        int b = num % 100 / 10;
        int c = num % 10;
        return Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == num;
    }
}
