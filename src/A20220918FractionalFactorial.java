/**
 * @author hardy
 * @version V1.0.0
 * @description
 * @date 2022/10/12
 * @since 1.0
 */
public class A20220918FractionalFactorial {
    public static void main(String[] args) {
        int term = 5;
        double sum = 0.;
        int lastFactorial = -1;
        for (int i = 2; i <= 2 * term; i += 2) {
            lastFactorial = -i * lastFactorial * (i - 1);
            sum = sum + (1. / lastFactorial);
        }
        System.out.println(sum);
    }
}
