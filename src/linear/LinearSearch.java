package linear;

import util.ArrayGenerator;

/**
 * @description: 线性查找
 * @author: guoyihua
 * @date: 2020/12/25
 */
public class LinearSearch {

    private LinearSearch() {
    }

    public static <E> int search(E[] arr, E target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] counts = {1000000, 10000000};
        for (Integer n : counts) {
            Integer[] arr = ArrayGenerator.generate(n);

            long startTime = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                search(arr, n);
            }
            long endTime = System.nanoTime();
            double time = (endTime - startTime) / 1000000000.0;
            System.out.println("n=" + n + " 100 runs" + "总共花费" + time + "秒");
        }
    }
}
