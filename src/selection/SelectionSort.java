package selection;

import java.util.Arrays;

/**
 * @description: 选择排序
 * @author: guoyihua
 * @date: 2020/12/28
 */
public class SelectionSort {

    /**
     * 这块做了一个限制，只有实现了Comparable接口的类才可以作为方法参数来做比较
     *
     * @param arr
     * @param <E>
     * @return
     */
    public static <E extends Comparable> E[] sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
        return arr;
    }

    private static <E> void swap(E[] arr, int target, int minIndex) {
        E temp = arr[target];
        arr[target] = arr[minIndex];
        arr[minIndex] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = {2, 0, 3, 5, 4, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

        Student[] students = {
                new Student("张三", 1, 85),
                new Student("李四", 10, 80),
                new Student("王五", 5, 100),
        };
        sort(students);
        System.out.println(Arrays.toString(students));
    }
}
