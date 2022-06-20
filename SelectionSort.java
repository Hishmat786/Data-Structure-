import java.util.ArrayList;
import java.util.List;

class SelectionSort {
    List<Integer> list = new ArrayList<>();

    int max(int[] arr) {
        int maximum = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (maximum < arr[i]) {
                maximum = arr[i];
                index = i;
            }
        }
        arr[index] = Integer.MIN_VALUE;
        return maximum;
    }

    void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int m = max(arr);
            list.add(m);
        }
    }

    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int[] arr = { 9, 5, 6, 1, 7, 3 };
        obj.selectionSort(arr);
        System.out.println(obj.list);
    }
}