/**
 * @author hardy
 * @version V1.0.0
 * @description
 * @date 2022/10/12
 * @since 1.0
 */
public class A20220912SimpleSort {
    public static void main(String[] args) {
        int[] list = {3, 42, 44, 23, 34, 53, 25};
        int[] bubbleSortedList = bubbleSort(list);
        for (int i : bubbleSortedList) {
            System.out.println(i);
        }
        int wantIndex = binarySearch(bubbleSortedList, 53);
        System.out.println("The index of your want number is " + wantIndex);
    }

    /**
     *
     * @param list unsorted list
     * @return sorted list
     */
    public static int[] bubbleSort(int[] list){
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp;
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }

    public static int binarySearch(int[] list, int want) {
        int mid;
        int left = 0;
        int right = list.length;
        while (left <= right) {
            mid = (left + right) / 2;
            System.out.println(mid);
            if (want > list[mid]) {
                left = mid + 1;
            } else if (want < list[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
