// 3*. Написать метод. Входящие параметры: отсортированный массив и число.
//        Метод должен вернуть true если это число есть в массиве, используя бинарный поиск.

import java.util.Arrays;
import java.util.Random;

public class task3 {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[random.nextInt(100) + 3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int x = random.nextInt(100);
        System.out.println("Будем искать " + x);
        System.out.println(binSearch(arr, x));
        System.out.println("Самодельный бинарный поиск");
        System.out.println(customBinSearch(arr, x));
    }

    public static boolean binSearch(int[] arr, int x) {
        if (Arrays.binarySearch(arr, x) >= 0) {
            System.out.println(x + " найден под индексом "
                    + Arrays.binarySearch(arr, x));
            return true;
        } else {
            return false;
        }
    }

    public static boolean customBinSearch(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (arr[middle] == x) {
                System.out.println(x + " найден под индексом " + middle);
                return true;
            }
            if (arr[middle] < x) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return false;
    }
}
