package linear;

/**
 * @description: 数组生成器
 * @author: guoyihua
 * @date: 2020/12/28
 */
public class ArrayGenerator {

    public static Integer[] generate(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
