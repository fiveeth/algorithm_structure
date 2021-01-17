package insertion;

import selection.SelectionSort;
import util.ArrayGenerator;
import util.SortedUtil;

import java.util.Arrays;

/**
 * @description: 插入排序
 * @author: guoyihua
 * @date: 2021/01/10
 */
public class InsertionSort {

    private InsertionSort() {
    }

    /**
     * 循环不变量arr[i...n) 是无序的; arr[0...i) 是有序的
     * <p>
     * 这块做了一个限制，只有实现了Comparable接口的类才可以作为方法参数来做比较
     *
     * @param arr
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            E temp = arr[i];
            int j;
            for (j = i; j - 1 >= 0; j--) {
                if (temp.compareTo(arr[j - 1]) < 0) {
                    arr[j] = arr[j - 1];
                } else {
                    break;
                }
            }
            arr[j] = temp;
        }
    }

    /**
     * 循环不变量arr[i...n) 是有序的; arr[0...i) 是无序的
     *
     * @param arr
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> void sort2(E[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            E temp = arr[i];
            int j;
            for (j = i; j < arr.length - 1; j++) {
                if (temp.compareTo(arr[j + 1]) < 0) {
                    arr[j] = arr[j + 1];
                } else {
                    break;
                }
            }
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] counts = {10000, 100000, 1000000};
        for (int n : counts) {
            Integer[] arr = ArrayGenerator.generateRandom(n, n);
            try {
                SortedUtil.sortTest(InsertionSort.class, arr);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
