package linear;

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
        Integer[] arr = {1, 4, 6, 7, 9};
        int index = LinearSearch.search(arr, 6);
        System.out.println(index);
    }
}
