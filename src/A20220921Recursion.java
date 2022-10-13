import java.util.Arrays;

/**
 * @author hardy
 * @version V1.0.0
 * @description
 * @date 2022/10/12
 * @since 1.0
 */
public class A20220921Recursion {
    public static void main(String[] args) {
        System.out.println(recursionString("abcdefg"));
    }

    public static String recursionString(String str) {
        char[] strList = str.toCharArray();
        String recursionString = "";
        for (int i = strList.length - 1; i >= 0; i--) {
            recursionString += strList[i];
        }
        return recursionString;
    }

    public static int partitionNumber(int num, int max) {
        if (num == 1 || max == 1) {
            return 1;
        }else if (num < 1 || max < 1) {
            return 0;
        }else if (num < max) {
            return partitionNumber(num, num);
        }else if (num == max) {
            return partitionNumber(num, max - 1) + 1;
        }else {
            return partitionNumber(num, max - 1) + partitionNumber(num - max, max);
        }
    }
}
