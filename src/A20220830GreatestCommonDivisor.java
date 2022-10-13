/**
 * @author hardy
 * @version V1.0.0
 * @description
 * @date 2022/10/12
 * @since 1.0
 */
public class A20220830GreatestCommonDivisor {
    public static void main(String[] args) {
        int num1 = 80;
        int num2 = 81;
        int mid = 0;
        while (num1 % num2 != 0){
            mid = num1 % num2;
            num1 = num2;
            num2 = mid;
        }
        System.out.println("the greatest common divisor number = " + num2);
    }
}
