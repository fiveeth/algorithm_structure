package selection;

import util.ArrayGenerator;
import util.SortedUtil;

/**
 * @description: 选择排序  每一次循环都拿到最小的索引，并且跟循环起始位置的值进行交换
 * @author: guoyihua
 * @date: 2020/12/28
 */
public class SelectionSort {

    private SelectionSort() {
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
    public static <E extends Comparable> E[] sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
        return arr;
    }

    /**
     * 循环不变量arr[i...n) 是有序的; arr[0...i) 是无序的
     *
     * @param arr
     * @param <E>
     * @return
     */
    public static <E extends Comparable> E[] sort2(E[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            int maxIndex = i;
            for (int j = i; j >= 0; j--) {
                if (arr[j].compareTo(arr[maxIndex]) > 0) {
                    maxIndex = j;
                }
            }
            swap(arr, i, maxIndex);
        }
        return arr;
    }

    private static <E> void swap(E[] arr, int target, int minIndex) {
        E temp = arr[target];
        arr[target] = arr[minIndex];
        arr[minIndex] = temp;
    }

    public static void main(String[] args) {
        int[] counts = {10000, 100000};
        for (int n : counts) {
            Integer[] arr = ArrayGenerator.generateRandom(n, n);
            try {
                SortedUtil.sortTest(SelectionSort.class, arr);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
