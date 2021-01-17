package algorithm.util;

import java.util.Random;

/**
 * @description: 数组生成器
 * @author: guoyihua
 * @date: 2020/12/28
 */
public class ArrayGenerator {

    private ArrayGenerator(){}

    public static Integer[] generate(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    /**
     * 生成未排序数组
     *
     * @param n
     * @param bound
     * @return
     */
    public static Integer[] generateRandom(int n, int bound) {
        Integer[] arr = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(bound);
        }
        return arr;
    }
}
