package util;

import java.lang.reflect.Method;

/**
 * @description: 排序排查工具类
 * @author: guoyihua
 * @date: 2021/01/05
 */
public class SortedUtil {

    private SortedUtil() {
    }

    public static <E extends Comparable> boolean isSorted(E[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].compareTo(arr[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static <E extends Comparable> void sortTest(String selectionName, E[] arr) throws Exception {
        Method sortMethod = Class.forName(selectionName).getDeclaredMethod("sort", Comparable[].class);
        long startTime = System.nanoTime();
        sortMethod.invoke(null, (Object) arr);
        long endTime = System.nanoTime();

        double time = (endTime - startTime) / 100000000.0;
        if (!SortedUtil.isSorted(arr)) {
            throw new RuntimeException(selectionName + " failed");
        }

        System.out.println(String.format("%s, %d : %f s", selectionName, arr.length, time));
    }
}
